package view;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import model.utils.ImageUtils;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class FunkoPopFrame extends JFrame{
    private static String validImageFolder = ImageUtils.getImageFolder("resources/images");
    private JPanel bodyPartsPanel = null;
    private JPanel headPanel;
    private JPanel torsoPanel;
    private JPanel pantsPanel;
    private JPanel shoesPanel;
    private JButton changeButton;
    private JButton downloadButton;
    private JButton randomButton;
    private JButton undoButton;
    private JPanel containerPanel;
    private JButton rightButtonPants = new JButton(">");
    private JButton rightButtonShoes = new JButton(">");
    private JButton rightButtonTorso = new JButton(">");
    private JButton rightButtonHead = new JButton(">");
    private JButton leftButtonPants = new JButton("<");
    private JButton leftButtonShoes = new JButton("<");
    private JButton leftButtonTorso = new JButton("<");
    private JButton leftButtonHead = new JButton("<");
    private ColorButton whiteButton = new ColorButton(new Color(249, 222, 198));
    private ColorButton yellowButton = new ColorButton(new Color(139, 69, 19));
    private ColorButton browButton = new ColorButton(new Color(101, 67, 33));
    private ColorButton blackButton = new ColorButton(new Color(50, 30, 20));
    private ImageButton femaleButton = new ImageButton(validImageFolder + "/other/female_icon.png", 200, 200);
    private ImageButton maleButton = new ImageButton(validImageFolder + "/other/male_icon.png", 200, 200);
    
    public ColorButton getWhiteButton() {
        return whiteButton;
    }

    public void setWhiteButton(ColorButton whiteButton) {
        this.whiteButton = whiteButton;
    }

    public ColorButton getYellowButton() {
        return yellowButton;
    }

    public void setYellowButton(ColorButton yellowButton) {
        this.yellowButton = yellowButton;
    }

    public ColorButton getBrowButton() {
        return browButton;
    }

    public void setBrowButton(ColorButton browButton) {
        this.browButton = browButton;
    }

    public ColorButton getBlackButton() {
        return blackButton;
    }

    public void setBlackButton(ColorButton blackButton) {
        this.blackButton = blackButton;
    }

    public ImageButton getFemaleButton() {
        return femaleButton;
    }

    public void setFemaleButton(ImageButton femaleButton) {
        this.femaleButton = femaleButton;
    }

    public ImageButton getMaleButton() {
        return maleButton;
    }

    public void setMaleButton(ImageButton maleButton) {
        this.maleButton = maleButton;
    }

    public JButton getLeftButtonHead() {
        return leftButtonHead;
    }

    public void setLeftButtonHead(JButton leftButtonHead) {
        this.leftButtonHead = leftButtonHead;
    }

    public JButton getLeftButtonTorso() {
        return leftButtonTorso;
    }

    public void setLeftButtonTorso(JButton leftButtonTorso) {
        this.leftButtonTorso = leftButtonTorso;
    }

    public JButton getLeftButtonShoes() {
        return leftButtonShoes;
    }

    public void setLeftButtonShoes(JButton leftButtonShoes) {
        this.leftButtonShoes = leftButtonShoes;
    }

    public JButton getLeftButtonPants() {
        return leftButtonPants;
    }

    public void setLeftButtonPants(JButton leftButtonPants) {
        this.leftButtonPants = leftButtonPants;
    }

    public JButton getRightButtonHead() {
        return rightButtonHead;
    }

    public void setRightButtonHead(JButton rightButtonHead) {
        this.rightButtonHead = rightButtonHead;
    }

    public JButton getRightButtonTorso() {
        return rightButtonTorso;
    }

    public void setRightButtonTorso(JButton rightButtonTorso) {
        this.rightButtonTorso = rightButtonTorso;
    }

    public JButton getRightButtonShoes() {
        return rightButtonShoes;
    }

    public void setRightButtonShoes(JButton rightButtonShoes) {
        this.rightButtonShoes = rightButtonShoes;
    }

    public JButton getRightButtonPants() {
        return rightButtonPants;
    }

    public void setRightButtonPants(JButton rightButtonPants) {
        this.rightButtonPants = rightButtonPants;
    }

    public JPanel getContainerPanel() {
        return containerPanel;
    }

    public void setContainerPanel(JPanel containerPanel) {
        this.containerPanel = containerPanel;
    }

    public JButton getDownloadButton() {
        return downloadButton;
    }

    public void setDownloadButton(JButton downloadButton) {
        this.downloadButton = downloadButton;
    }

    public JButton getChangeButton() {
        return changeButton;
    }

    public void setchangeButton(JButton changeButton) {
        this.changeButton = changeButton;
    }

    public JButton getRandomButton() {
        return randomButton;
    }

    public void setcRandomButton(JButton randomButton) {
        this.randomButton = randomButton;
    }

    public JButton getUndoButton() {
        return undoButton;
    }

    public void setUndoButton(JButton undoButton) {
        this.undoButton = undoButton;
    }
    public FunkoPopFrame() {
        JPanel mainContentPanel = new JPanel(new GridLayout(1, 3));
        leftButtonHead.setPreferredSize(new Dimension(85, 85));
        leftButtonPants.setPreferredSize(new Dimension(85, 85));
        leftButtonShoes.setPreferredSize(new Dimension(85, 85));
        leftButtonTorso.setPreferredSize(new Dimension(85, 85));
        rightButtonHead.setPreferredSize(new Dimension(85, 85));
        rightButtonPants.setPreferredSize(new Dimension(85, 85));
        rightButtonShoes.setPreferredSize(new Dimension(85, 85));
        rightButtonTorso.setPreferredSize(new Dimension(85, 85));
        setTitle("Funko Pop Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1600, 1000);
        
        headPanel = createPartPanel(validImageFolder + "/funko/female_black_head_01.png");
        torsoPanel = createPartPanel(validImageFolder + "/funko/female_black_torso_01.png");
        pantsPanel = createPartPanel(validImageFolder + "/funko/female_black_pants_01.png");
        shoesPanel = createPartPanel(validImageFolder + "/funko/female_black_shoes_01.png");

        JPanel skinGenderPanel = createSkinGenderPanel();

        bodyPartsPanel = new JPanel();
        bodyPartsPanel.setLayout(new BoxLayout(bodyPartsPanel, BoxLayout.Y_AXIS));
        bodyPartsPanel.add(headPanel);
        bodyPartsPanel.add(torsoPanel);
        bodyPartsPanel.add(pantsPanel);
        bodyPartsPanel.add(shoesPanel);
        bodyPartsPanel.setBackground(Color.DARK_GRAY);
        Border border1 = BorderFactory.createLineBorder(Color.BLACK, 2);
        bodyPartsPanel.setBorder(border1);   


        downloadButton = new JButton("Download Image");
        downloadButton.setPreferredSize(new Dimension(300, 120));
        randomButton = new JButton("Randomize Image");
        randomButton.setPreferredSize(new Dimension(300, 120));
        changeButton = new JButton("Funko/Lego");
        changeButton.setPreferredSize(new Dimension(300, 120));
        undoButton = new JButton("Undo");
        undoButton.setPreferredSize(new Dimension(300, 120));
        JPanel buttonsPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        centerPanel.setPreferredSize(new Dimension(400, 400));
        centerPanel.add(Box.createVerticalGlue()); 
        centerPanel.add(downloadButton);
        centerPanel.add(randomButton);
        centerPanel.add(changeButton);
        centerPanel.add(undoButton);
        centerPanel.add(Box.createVerticalGlue()); 
        centerPanel.setBackground(Color.DARK_GRAY);
        Border border3 = BorderFactory.createLineBorder(Color.BLACK, 2);
        centerPanel.setBorder(border3);
        buttonsPanel.add(Box.createVerticalGlue()); 
        buttonsPanel.add(centerPanel, BorderLayout.CENTER);
        buttonsPanel.add(Box.createVerticalGlue());
        buttonsPanel.setBackground(Color.lightGray);

        mainContentPanel.add(buttonsPanel);
        mainContentPanel.add(bodyPartsPanel);
        mainContentPanel.add(skinGenderPanel);
        
        JPanel mainPanel = new JPanel(new BorderLayout());

        mainPanel.add(mainContentPanel);

        add(mainPanel);
    }

    private JPanel createPartPanel(String imageName) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setMaximumSize(new Dimension(410, 400));

        ImageIcon originalIcon = new ImageIcon(imageName);
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel imageLabel = new JLabel(resizedIcon, SwingConstants.CENTER);
        String[] parts = imageName.split("_");
        String parte = parts[3];

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(imageLabel, BorderLayout.CENTER);


        if (parte.equals("head")){
            contentPanel.add(leftButtonHead, BorderLayout.WEST);
            contentPanel.add(rightButtonHead, BorderLayout.EAST);
        } else if (parte.equals("pants")){
            contentPanel.add(leftButtonPants, BorderLayout.WEST);
            contentPanel.add(rightButtonPants, BorderLayout.EAST);
        } else if (parte.equals("shoes")){
            contentPanel.add(leftButtonShoes, BorderLayout.WEST);
            contentPanel.add(rightButtonShoes, BorderLayout.EAST);
        } else if (parte.equals("torso")){
            contentPanel.add(leftButtonTorso, BorderLayout.WEST);
            contentPanel.add(rightButtonTorso, BorderLayout.EAST);
        }


        panel.add(contentPanel, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createSkinGenderPanel() {
        JPanel skinGenderPanel = new JPanel(new GridLayout(2, 1));

        JPanel upperRowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JPanel lowerRowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));

        femaleButton.setPreferredSize(new Dimension(200, 200));
        maleButton.setPreferredSize(new Dimension(200, 200));

        upperRowPanel.add(femaleButton, BorderLayout.NORTH);
        upperRowPanel.add(maleButton, BorderLayout.NORTH);
        lowerRowPanel.add(whiteButton, BorderLayout.SOUTH);
        lowerRowPanel.add(yellowButton, BorderLayout.SOUTH);
        lowerRowPanel.add(browButton, BorderLayout.SOUTH);
        lowerRowPanel.add(blackButton, BorderLayout.SOUTH);
        upperRowPanel.setBackground(Color.lightGray);
        lowerRowPanel.setBackground(Color.lightGray);


        skinGenderPanel.add(upperRowPanel);
        skinGenderPanel.add(lowerRowPanel);
        return skinGenderPanel;
    }

    public void updateImage(String partName, String newImageFilename) {
        JPanel targetPanel = null;
        if (partName.equalsIgnoreCase("head")) {
            targetPanel = headPanel;
        } else if (partName.equalsIgnoreCase("torso")) {
            targetPanel = torsoPanel;
        } else if (partName.equalsIgnoreCase("pants")) {
            targetPanel = pantsPanel;
        } else if (partName.equalsIgnoreCase("shoes")) {
            targetPanel = shoesPanel;
        }

        if (targetPanel != null) {
            targetPanel.removeAll();
            ImageIcon newIcon = new ImageIcon(newImageFilename);
            Image newImage = newIcon.getImage();
            Image resizedImage = newImage.getScaledInstance(225, 225, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            JLabel newImageLabel = new JLabel(resizedIcon);
            String[] parts = newImageFilename.split("_");
            String parte = parts[3];
            if (parte.equals("head")){
                targetPanel.add(leftButtonHead, BorderLayout.WEST);
                targetPanel.add(rightButtonHead, BorderLayout.EAST);
            } else if (parte.equals("pants")){
                targetPanel.add(leftButtonPants, BorderLayout.WEST);
                targetPanel.add(rightButtonPants, BorderLayout.EAST);
            } else if (parte.equals("shoes")){
                targetPanel.add(leftButtonShoes, BorderLayout.WEST);
                targetPanel.add(rightButtonShoes, BorderLayout.EAST);
            } else if (parte.equals("torso")){
                targetPanel.add(leftButtonTorso, BorderLayout.WEST);
                targetPanel.add(rightButtonTorso, BorderLayout.EAST);
            }

            
            targetPanel.add(newImageLabel);
            targetPanel.revalidate();
            targetPanel.repaint();
        }
    }

    public void downloadImage() {
        JPanel panel = bodyPartsPanel;
        BufferedImage combinedImage = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D g = combinedImage.createGraphics();
        panel.printAll(g);
        g.dispose();

        JFileChooser fileChooser = new JFileChooser();
        int choice = fileChooser.showSaveDialog(containerPanel);
        if (choice == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                ImageIO.write(combinedImage, "png", file);
                JOptionPane.showMessageDialog(containerPanel, "Images downloaded successfully.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


}
