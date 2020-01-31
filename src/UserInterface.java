/*******************************************************
 * Owner: Hung Dinh Nguyen
 * Email:  HungNguyen2@clarku.edu
 *
 * UserInterface.java to work on the front-end of the
 * chess engine. This includes:
 * 1. Board
 * 2. Chess Piece interaction (MouseListener)
 * 3. Possible Move of a clicked Chess Piece
 * 4. Graphic for 'Check'-ing a King
 * 5. Image of each chess piece
 *
 *******************************************************/

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class UserInterface extends JPanel implements MouseListener, MouseMotionListener {
    static int x,y;
    private final int TILESIZE = 75;

    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        // this.setBackground(new Color(0,100,0));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        // Set Board
        makeChessBoard(G);

        // Drawing
//        G.setColor(Color.RED);
//        G.fillRect(x, y, 100, 200);
//        G.setColor(new Color(190, 81, 30));
//        G.fillRect(120, 20, 200, 100);
//        G.drawString("Hungover", x, y);
    }

    private void makeChessBoard(Graphics G) {
        boolean black = true;
        for (int i = 0; i < 8; i++) {
            black = !black;
            for (int j = 0; j < 8; j++) {
                if (black) G.setColor(new Color());
                else G.setColor(Color.WHITE);
                G.fillRect(i * TILESIZE, j * TILESIZE, TILESIZE, TILESIZE);
                black = !black;
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

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
        x = e.getX();
        y = e.getY();
        repaint();
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
}
