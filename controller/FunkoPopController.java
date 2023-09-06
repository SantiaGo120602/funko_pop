package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import model.FunkoPopModel;
import model.body_attributes.BodyAttributeEnum;
import model.history.HistoryEntry;
import view.FunkoPopView;

public class FunkoPopController {
    private FunkoPopModel model;
    private FunkoPopView view;
    private Random random = new Random();

    public FunkoPopView getView() {
        return view;
    }

    public FunkoPopModel getModel() {
        return model;
    }

    public FunkoPopController(FunkoPopModel model, FunkoPopView view) {
        this.model = model;
        this.view = view;
        
        this.view.addAddUndoListener(new UndoListener());
        this.view.addAddDownloadListener(new DownloadListener());
        this.view.addAddChangeListener(new ChangeListener());
        this.view.addAddRandomListener(new RandomListener());
        this.view.addAddLeftHeadListener(new ButtonLeftHeadListener());
        this.view.addAddLeftTorsoListener(new ButtonLeftTorsoListener());
        this.view.addAddLeftPantsListener(new ButtonLeftPantsListener());
        this.view.addAddLeftShoesListener(new ButtonLeftShoesListener());
        this.view.addAddRightHeadListener(new ButtonRightHeadListener());
        this.view.addAddRightTorsoListener(new ButtonRightTorsoListener());
        this.view.addAddRightPantsListener(new ButtonRightPantsListener());
        this.view.addAddRightShoesListener(new ButtonRightShoesListener());
        this.view.addAddWhiteButtonListener(new ButtonWhiteListener());
        this.view.addAddYellowButtonListener(new ButtonYellowListener());
        this.view.addAddBrownButtonListener(new ButtonBrownListener());
        this.view.addAddBlackButtonListener(new ButtonBlackListener());
        this.view.addAddFemaleButtonListener(new ButtonFemaleListener());
        this.view.addAddMaleButtonListener(new ButtonMaleListener());
    }

    public void updateModel( BodyAttributeEnum bodyAttributeAnatomy,
    BodyAttributeEnum bodyAttributeGender,
    BodyAttributeEnum bodyAttributeSkin,
    int headNumber,
    int pantsNumber,
    int shoesNumber,
    int torsoNumber){
        model.updateBody(bodyAttributeAnatomy, bodyAttributeGender, bodyAttributeSkin, headNumber, pantsNumber, shoesNumber, torsoNumber);
        updateView();
    }

    public void updateView(){
        view.updateView(model.getHead().getImagePath(),
        model.getPants().getImagePath(),
        model.getShoes().getImagePath(),
        model.getTorso().getImagePath()
        );
    }

    private class DownloadListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.getFunkoPopFrame().downloadImage();
        }
    }

    private class UndoListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent arg0) {
            HistoryEntry historyEntry = model.getHistorySingleton().pop();
            updateModel(historyEntry.getBodyAnatomyAttribute(),
            historyEntry.getBodyGenderAttribute(),
            historyEntry.getBodySkinAttribute(),
            historyEntry.getHeadCode(),
            historyEntry.getPantsCode(),
            historyEntry.getPantsCode(),
            historyEntry.getTorsoCode());
        }
    }

    

    private class ChangeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            BodyAttributeEnum newAnatomy = BodyAttributeEnum.LEGO;
            if (model.getBodyAnatomyAttribute() == BodyAttributeEnum.LEGO){
                newAnatomy = BodyAttributeEnum.FUNKO;
            }
            updateModel(newAnatomy,
            model.getBodyGenderAttribute(),
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());   
        }
    }

    private class RandomListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int[] randomArray = new int[4];
            for (int i = 0; i < 4; i++) {
                randomArray[i] = random.nextInt(3 - 1 + 1) + 1;
            }
            ArrayList<BodyAttributeEnum> anatomyList = new ArrayList<>();
            anatomyList.add(BodyAttributeEnum.LEGO);
            anatomyList.add(BodyAttributeEnum.FUNKO);
            ArrayList<BodyAttributeEnum> genderList = new ArrayList<>();
            genderList.add(BodyAttributeEnum.FEMALE);
            genderList.add(BodyAttributeEnum.MALE);
            ArrayList<BodyAttributeEnum> skinList = new ArrayList<>();
            skinList.add(BodyAttributeEnum.WHITE);
            skinList.add(BodyAttributeEnum.BLACK);
            skinList.add(BodyAttributeEnum.YELLOW);
            skinList.add(BodyAttributeEnum.BROWN);

            updateModel(anatomyList.get(random.nextInt(anatomyList.size())),
            genderList.get(random.nextInt(genderList.size())),
            skinList.get(random.nextInt(skinList.size())),
            randomArray[0],
            randomArray[1],
            randomArray[2],
            randomArray[3]);
        }
    }

    private class ButtonLeftHeadListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int cambio = model.getHead().getId();
            if (cambio==1){
                cambio = 4;
            }
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            model.getBodySkinAttribute(),
            cambio-1,
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());
        }

    }

    private class ButtonLeftTorsoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int cambio = model.getTorso().getId();
            if (cambio==1){
                cambio = 4;
            }
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            cambio-1);
        }

    }

    private class ButtonLeftPantsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int cambio = model.getPants().getId();
            if (cambio==1){
                cambio = 4;
            }
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            cambio-1,
            model.getShoes().getId(),
            model.getTorso().getId());
        }

    }

    private class ButtonLeftShoesListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int cambio = model.getShoes().getId();
            if (cambio==1){
                cambio = 4;
            }
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            model.getPants().getId(),
            cambio-1,
            model.getTorso().getId());
        }

    }

    private class ButtonRightHeadListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int cambio = model.getHead().getId();
            if (cambio==3){
                cambio = 0;
            }
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            model.getBodySkinAttribute(),
            cambio+1,
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());
        }

    }

    private class ButtonRightTorsoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int cambio = model.getTorso().getId();
            if (cambio==3){
                cambio = 0;
            }
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            cambio+1);
        }

    }

    private class ButtonRightPantsListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int cambio = model.getPants().getId();
            if (cambio==3){
                cambio = 0;
            }
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            cambio+1,
            model.getShoes().getId(),
            model.getTorso().getId());
            
        }
        
    }

    private class ButtonRightShoesListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int cambio = model.getShoes().getId();
            if (cambio==3){
                cambio = 0;
            }
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            model.getPants().getId(),
            cambio+1,
            model.getTorso().getId());
        }

    }

    private class ButtonWhiteListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            BodyAttributeEnum.WHITE,
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());
        }
    }

    private class ButtonYellowListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            BodyAttributeEnum.YELLOW,
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());
        }
    }
    
    private class ButtonBrownListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            BodyAttributeEnum.BROWN,
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());
        }
    }

    private class ButtonBlackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            updateModel(model.getBodyAnatomyAttribute(),
            model.getBodyGenderAttribute(),
            BodyAttributeEnum.BLACK,
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());
        }
    }

    private class ButtonFemaleListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            updateModel(model.getBodyAnatomyAttribute(),
            BodyAttributeEnum.FEMALE,
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());
        }
    }

    private class ButtonMaleListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            updateModel(model.getBodyAnatomyAttribute(),
            BodyAttributeEnum.MALE,
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());
        }
    }

}
