package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.BodyAttributeEnum;
import model.FunkoPopModel;
import view.FunkoPopView;

public class FunkoPopController {
    private FunkoPopModel model;
    private FunkoPopView view;

    public FunkoPopView getView() {
        return view;
    }

    public FunkoPopModel getModel() {
        return model;
    }

    public FunkoPopController(FunkoPopModel model, FunkoPopView view) {
        this.model = model;
        this.view = view;

        this.view.addAddDownloadListener(new DownloadListener());
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

    public void updateModel(BodyAttributeEnum bodyAttributeGender,
    BodyAttributeEnum bodyAttributeSkin,
    int headNumber,
    int pantsNumber,
    int shoesNumber,
    int torsoNumber){
        model.updateBody(bodyAttributeGender, bodyAttributeSkin, headNumber, pantsNumber, shoesNumber, torsoNumber);
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

    private class ButtonLeftHeadListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int cambio = model.getHead().getId();
            if (cambio==1){
                cambio = 4;
            }
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(model.getBodyGenderAttribute(),
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
            updateModel(BodyAttributeEnum.FEMALE,
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
            updateModel(BodyAttributeEnum.MALE,
            model.getBodySkinAttribute(),
            model.getHead().getId(),
            model.getPants().getId(),
            model.getShoes().getId(),
            model.getTorso().getId());
        }
    }

}
