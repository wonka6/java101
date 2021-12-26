package java101.Arrays;

public class FrequencyOfRepeatedNumbers {

    public static boolean IsUnique(int[] list, int value) {
        for (int i : list) {
            if (i == value)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] list = {7, 7, 7, 7, 4, 3, 3, 3, 7, 3};

        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = i; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    count++;
                }
            }
            if (!IsUnique(list, i)) {
                if (count >= 2) {
                    System.out.println(list[i] + " sayisi " + count + " kez tekrar etmistir.");
                    break;
                }
            }
        }

    }
}