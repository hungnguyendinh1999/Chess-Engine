package Pieces;


public abstract class Piece {
    private int row;         // x-coordinate
    private int col;         // y-coordinate
    private boolean player; // black or white
    String imagePath;

    /**
     *
     * @param row the numerical row-location of Piece
     * @param col the numerical col-location of Piece (1-8 instead of A-H)
     * @param player the Player object associated with the Piece
     */
    public Piece(int row, int col, boolean player) {
        this.row = row;
        this.col = col;
        this.player = player;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public abstract void showMoves();
    public abstract void move();
}
