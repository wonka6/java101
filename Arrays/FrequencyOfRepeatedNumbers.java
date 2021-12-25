package java101.Arrays;

public class FrequencyOfRepeatedNumbers {
    public static void main(String[] args) {
        int[] list = {7, 7, 4, 3, 3, 3};

        int count = 0;
        int fr = 0;
        for(int i = 0; i < list.length; i++){

            for(int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    count++;
                    System.out.print(list[i] + "\t" + count);
                    fr = count;
                    break;
                }
            }
            System.out.println(fr);
        }







    }
}

