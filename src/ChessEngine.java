// Create based on https://en.wikipedia.org/wiki/Algebraic_notation_(chess)#Naming_the_pieces
public class ChessEngine {
    /* NAMING THE PIECES
     *
     * English-speaking players use the letters:
     * K for king,
     * Q for queen,
     * R for rook,
     * B for bishop,
     * and N for knight (since K is already used).
     * for coding, we use 'p' for Pawn
     */

    char[][] currentBoard = { // FOR NOW, WHITE IS CAPITALIZED, BLACK IS OTHER
            {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
    };

    /* NOTATION FOR MOVES
     * Each move of a piece is indicated by the piece's uppercase letter
     * plus the coordinate of the destination square.
     * E.g. Be5 (move a bishop to e5), Nf3 (move a knight to f3).
     *
     * For pawn moves, a letter indicating pawn is not used, only the destination square is given.
     * E.g. c5 (move a pawn to c5).
     *
     */
    public ChessEngine() { // later add parameter to indicate player is white or black


    }

    /**
     * Output the next move based on the Alpha-Beta algorithm
     * @return a String to be read to make the next move
     */
    public String nextMove() {
        return "";
    }
}
