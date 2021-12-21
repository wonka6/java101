package java101.Arrays;

public class Transpoze {
    public static void main(String[] args) {
        int[][] list = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int [][] newList = new int[list[0].length][list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                newList[j][i] = list[i][j];

            }
        }

        System.out.println("Original Matrix");
        System.out.println("==============");

        for (int[] ints : list) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }

        System.out.println("==============");
        System.out.println("Transpose");
        System.out.println("==============");

        for (int[] ints : newList) {
            for (int j = 0; j < newList[0].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
