package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ImageButton extends JButton {
    public ImageButton(String imagePath, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(imagePath);
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        setIcon(resizedIcon);
    }
}