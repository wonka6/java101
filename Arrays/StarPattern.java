package java101.Arrays;

public class StarPattern {
    public static void main(String[] args) {


        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (j == 0 && i == 0) {
                    letter[i][j] = "*";
                } else if (j % 3 == 0)
                    letter[i][j] = "*";
                else if (i % 3 == 0)
                    letter[i][j] = "*";

                else
                    letter[i][j] = "  ";
            }

        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
}