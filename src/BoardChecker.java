public class BoardChecker {
    public static void main(String[] args) {

        int answer;

        //TEST 1: NOT FINISHED
        answer = isSolved(new int[][] {
                {0, 0, 1},
                {0, 1, 2},
                {2, 1, 0}
        });
        System.out.println(answer);

        //TEST 2: X WINS
        answer = isSolved(new int[][] {
                {1, 1, 1},
                {0, 2, 2},
                {0, 0, 0}
        });
        System.out.println(answer);

        //TEST 3: O WINS
        answer = isSolved(new int[][] {
                {1, 1, 2},
                {0, 2, 0},
                {2, 1, 1}
        });
        System.out.println(answer);

        //TEST 4: DRAW
        answer = isSolved(new int[][] {
                {1, 2, 1},
                {1, 1, 2},
                {2, 1, 2}
        });
        System.out.println(answer);

    }

    public static int isSolved(int[][] board) {

        int status = -1;
        int boardCount = 0;
        boolean winFlag = false;

        //ROW WIN CHECKER
        for(int i = 0; i < 3; i++) {
            if ((board[i][0] == 1) && (board[i][1] == 1) && (board[i][2] == 1)) {
                status = 1;
                winFlag = true;
            } else if ((board[i][0] == 2) && (board[i][1] == 2) && (board[i][2] == 2)) {
                status = 2;
                winFlag = true;
            }
        }

        //COLUMN WIN CHECKER
        for(int i = 0; i < 3; i++) {
            if ((board[0][i] == 1) && (board[1][i] == 1) && (board[2][i] == 1)) {
                status = 1;
                winFlag = true;
            } else if ((board[0][i] == 2) && (board[1][i] == 2) && (board[2][i] == 2)) {
                status = 2;
                winFlag = true;
            }
        }

        //DIAGONAL WIN CHECKER
        if ((board[0][0] == 1) && (board[1][1] == 1) && (board[2][2] == 1)) {
            status = 1;
            winFlag = true;
        } else if ((board[0][0] == 2) && (board[1][1] == 2) && (board[2][2] == 2)) {
            status = 2;
            winFlag = true;
        }

        if ((board[0][2] == 1) && (board[1][1] == 1) && (board[2][0] == 1)) {
            status = 1;
            winFlag = true;
        } else if ((board[0][2] == 2) && (board[1][1] == 2) && (board[2][0] == 2)) {
            status = 2;
            winFlag = true;
        }


        if(!winFlag) {

            //DRAW CHECKER
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {

                    if(board[i][j] != 0) {
                        boardCount++;
                    }

                }
            }

            //BOARD IS FULL
            if(boardCount == 9) {
                status = 0;
            }

        }

       return status;
    }
}
