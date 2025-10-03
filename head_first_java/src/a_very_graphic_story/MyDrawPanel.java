package a_very_graphic_story;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);



        Image image = new ImageIcon(getClass().getResource("catzilla.jpg")).getImage();

        g.drawImage(image, 3, 4, this);

        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70,70,Color.BLUE, 150,150, Color.orange);

        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);

        g.setColor(Color.orange);

        g.fillRect(20, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(panel);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
