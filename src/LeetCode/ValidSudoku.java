package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        // each 9 rows, 9 columns and 9 sub-boxes can be considered a Set and they can be accumulated in an array
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] columnSet = new HashSet[9];
        Set<Character>[] boxSet = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            // all the rows, columns and sub-boxes will be initialized in the outside loop
            rowSet[i] = new HashSet<>();
            columnSet[i] = new HashSet<>();
            boxSet[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];

                if (ch == '.') continue;
                int k = (i / 3) * 3 + (j / 3);

                if (rowSet[i].contains(ch) || columnSet[j].contains(ch) || boxSet[k].contains(ch)) return false;

                rowSet[i].add(ch);
                columnSet[j].add(ch);
                boxSet[k].add(ch);
            }
        }

        return true;
    }
}
