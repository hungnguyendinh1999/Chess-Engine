/*******************************************************
 * Owner: Hung Dinh Nguyen
 * Email:  HungNguyen2@clarku.edu
 *
 * GUI.UserInterface.java to work on the front-end of the
 * chess engine. This includes:
 * 1. Board
 * 2. GUI.Chess Piece interaction (MouseListener)
 * 3. Possible Move of a clicked GUI.Chess Piece
 * 4. Graphic for 'Check'-ing a King
 * 5. Image of each chess piece
 *
 *******************************************************/
package GUI;

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
        initializePieces(G);

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
                if (black) G.setColor(new Color(205,133,63));
                else G.setColor(Color.WHITE);
                G.fillRect(i * TILESIZE + 10, j * TILESIZE + 10, TILESIZE, TILESIZE);
                black = !black;
            }
        }
    }

    private void initializePieces(Graphics G) {
        G.setColor(Color.black);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                G.fillOval(i * TILESIZE + 15, j * TILESIZE + 15, TILESIZE-15, TILESIZE-15);
            }
        }

        G.setColor(Color.BLUE);
        for (int i = 0; i < 8; i++) {
            for (int j = 6; j < 8; j++) {
                G.fillOval(i * TILESIZE + 15, j * TILESIZE + 15, TILESIZE-15, TILESIZE-15);
            }
        }

    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    boolean clickedOnPiece = false;
    /**
     * Mouse click once: Piece Selection -> Show possible moves
     * Mouse 2nd click: Move Piece (unless not possible -> reset)
     * @param e MouseEvent
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
        if (clickedOnPiece) {

        } else {
            // check if x and y is in the suggested Tiles
            // make a func returnTileClicked
        }
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
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
