package view;

import java.awt.event.ActionListener;

public class FunkoPopView {
    private FunkoPopFrame funkoPopFrame = new FunkoPopFrame();

    public FunkoPopFrame getFunkoPopFrame() {
        return funkoPopFrame;
    }

    public void updateView(String headPath, String pantsPath, String shoesPath, String torsoPath){
        funkoPopFrame.updateImage("head", headPath);
        funkoPopFrame.updateImage("pants", pantsPath);
        funkoPopFrame.updateImage("shoes", shoesPath);
        funkoPopFrame.updateImage("torso", torsoPath);

    }
    public void addAddUndoListener(ActionListener listener) {
        funkoPopFrame.getUndoButton().addActionListener(listener);
    }
    public void addAddDownloadListener(ActionListener listener) {
        funkoPopFrame.getDownloadButton().addActionListener(listener);
    }
    public void addAddRandomListener(ActionListener listener) {
        funkoPopFrame.getRandomButton().addActionListener(listener);
    }
    public void addAddChangeListener(ActionListener listener) {
        funkoPopFrame.getChangeButton().addActionListener(listener);
    }
    public void addAddLeftHeadListener(ActionListener listener) {
        funkoPopFrame.getLeftButtonHead().addActionListener(listener);
    }
    public void addAddLeftTorsoListener(ActionListener listener) {
        funkoPopFrame.getLeftButtonTorso().addActionListener(listener);
    }
    public void addAddLeftPantsListener(ActionListener listener) {
        funkoPopFrame.getLeftButtonPants().addActionListener(listener);
    }
    public void addAddLeftShoesListener(ActionListener listener) {
        funkoPopFrame.getLeftButtonShoes().addActionListener(listener);
    }
    public void addAddRightHeadListener(ActionListener listener) {
        funkoPopFrame.getRightButtonHead().addActionListener(listener);
    }
    public void addAddRightTorsoListener(ActionListener listener) {
        funkoPopFrame.getRightButtonTorso().addActionListener(listener);
    }
    public void addAddRightPantsListener(ActionListener listener) {
        funkoPopFrame.getRightButtonPants().addActionListener(listener);
    }
    public void addAddRightShoesListener(ActionListener listener) {
        funkoPopFrame.getRightButtonShoes().addActionListener(listener);
    }
    public void addAddWhiteButtonListener(ActionListener listener) {
        funkoPopFrame.getWhiteButton().addActionListener(listener);
    }
    public void addAddYellowButtonListener(ActionListener listener) {
        funkoPopFrame.getYellowButton().addActionListener(listener);
    }
    public void addAddBrownButtonListener(ActionListener listener) {
        funkoPopFrame.getBrowButton().addActionListener(listener);
    }
    public void addAddBlackButtonListener(ActionListener listener) {
        funkoPopFrame.getBlackButton().addActionListener(listener);
    }
    public void addAddFemaleButtonListener(ActionListener listener) {
        funkoPopFrame.getFemaleButton().addActionListener(listener);
    }
    public void addAddMaleButtonListener(ActionListener listener) {
        funkoPopFrame.getMaleButton().addActionListener(listener);
    }
}
