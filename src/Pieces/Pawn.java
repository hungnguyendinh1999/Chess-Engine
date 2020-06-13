package Pieces;
import Pieces.Piece;

public class Pawn extends Piece {

    public Pawn(int row, int col, boolean player) {
        super(row, col, player);
        if (player) { // if player is White
            imagePath = "src/Pieces/img/Chess_WPawn.png";
        }
        else imagePath = "src/Pieces/img/Chess_BPawn.png";
    }

    public String getImagePath() {
        return imagePath;
    }

    @Override
    public void showMoves() {

    }

    @Override
    public void move() {

    }
}
