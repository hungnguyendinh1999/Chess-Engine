package Pieces;

import GUI.UserInterface;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Test extends JPanel{

    BufferedImage image;
    Pawn test;

    public Test() {
        test = new Pawn(50, 50, true);
        System.out.println(test.getImagePath());
        try {
            image = ImageIO.read(new File(test.getImagePath()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
        this.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        Test stuff = new Test();
        JFrame f = new JFrame("My Title Goes Here!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when click exit, close
        f.add(stuff);
        f.setSize(666, 666);
        f.setResizable(false);
        f.setVisible(true); // make sure it's visible when created
    }
}
