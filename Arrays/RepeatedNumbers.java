package java101.Arrays;

public class RepeatedNumbers {
    public static boolean IsUnique(int[] list, int value) {
        for (int i : list) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void EvenRepeated(int[] list) {

        for (int i : list) {
            if (i % 2 == 0 && i != 0)
                System.out.print(i + "\t");
        }
    }


    public static void main(String[] args) {
        int[] list = {1, 1, 2, 3, 4, 5, 6, 4, 7, 2, 3, 89, 56, 75, 159, 89};

        int[] newList = new int[list.length];
        int newIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!IsUnique(newList, list[i]))
                        newList[newIndex++] = list[i];
                    break;
                }
            }
        }

        System.out.print("Repeated numbers in the array : ");
        EvenRepeated(newList);

    }
}