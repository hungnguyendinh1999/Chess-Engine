import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class UserInterface extends JPanel implements MouseListener, MouseMotionListener {
    static int x,y;

    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        // this.setBackground(new Color(0,100,0));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        // Set Board
        // makeChessBoard();
        // Drawing
        G.setColor(Color.RED);
        G.fillRect(x, y, 100, 200);
        G.setColor(new Color(190, 81, 30));
        G.fillRect(120, 20, 200, 100);
        G.drawString("Hungover", x, y);
    }

    private void makeChessBoard(Graphics G) {

        G.fillRect(0,0,500,500);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {

    }
}
