package view;

import javax.swing.*;
import java.awt.*;

public class ColorButton extends JButton {
    private Color color;

    public ColorButton(Color color) {
        this.color = color;
        setPreferredSize(new Dimension(200, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
}
