package Game;

public class Board {
    private char[][] whiteBoard = { // FOR NOW, WHITE IS CAPITALIZED, BLACK IS OTHER
            {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
    };
    private char[][] blackBoard = { // FOR NOW, WHITE IS CAPITALIZED, BLACK IS OTHER
            {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'}
    };

    private Tile[][] currentBoard;

    /**
     * Chess board contains 8x8 tiles
     * With Chess configurations for Black and White pieces
     */
    public Board(Player player) {
        currentBoard = new Tile[8][8];
        if(player.player) { // set to White view
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    currentBoard[i][j] = new Tile(0, 0, whiteBoard[i][j]);
                }
            }
        }
        else { // set to black view
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    currentBoard[i][j] = new Tile(0, 0, blackBoard[i][j]);
                }
            }
        }


    }


}
