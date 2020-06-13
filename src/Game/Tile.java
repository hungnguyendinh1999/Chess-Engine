package Game;

import Pieces.*;

public class Tile {

    /**
     * Tile Properties
     */
    private int x;
    private int y;
    private Piece piece;
    private final boolean WHITE = true;
    private final boolean BLACK = false;

    /**
     * Tile can be empty or have ONE piece
     *
     * @param X x coordinate
     * @param Y y coordinate
     */
    public Tile(int X, int Y, char pieceInit) {
        //SET THE INITIAL X AND Y
        x = X;
        y = Y;
        if (pieceInit == 'P') this.piece = new Pawn(X,Y, WHITE);
        else if (pieceInit == 'p') this.piece = new Pawn(X,Y, BLACK);

        else if (pieceInit == 'R') this.piece = new Rook(X,Y, WHITE);
        else if (pieceInit == 'r') this.piece = new Rook(X,Y, BLACK);

        else if (pieceInit == 'N') this.piece = new Knight(X,Y, WHITE);
        else if (pieceInit == 'n') this.piece = new Knight(X,Y, BLACK);

        else if (pieceInit == 'B') this.piece = new Bishop(X,Y, WHITE);
        else if (pieceInit == 'b') this.piece = new Bishop(X,Y, BLACK);

        else if (pieceInit == 'Q') this.piece = new Queen(X,Y, WHITE);
        else if (pieceInit == 'q') this.piece = new Queen(X,Y, BLACK);

        else if (pieceInit == 'K') this.piece = new King(X,Y, WHITE);
        else if (pieceInit == 'k') this.piece = new King(X,Y, BLACK);
        else { // create emptyTile
            this.piece = null; // not White or Black. Edible by either side.
        }
    }

    public double getDistance(int X, int Y) {
        double distance;
        double xdif = Math.abs(X-x);
        double ydif = Math.abs(Y-y);
        distance = xdif+ydif;
        return distance;
    }

    /* GET X AND Y */
    public int getX() { return x; }
    public int getY() { return y; }

    /* SET THE X AND Y */
    public void setX(int X) { x = X; }
    public void setY(int Y) { y = Y; }

    /* ADD X AND Y VEL */
    public void addX(int addX) { x += addX; }
    public void addY(int addY) { y += addY; }
}
