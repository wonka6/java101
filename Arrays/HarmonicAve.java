package java101.Arrays;

public class HarmonicAve {

    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5, 6};
        double sum = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += (1.0 / arr[i]);
        }
        double harmonic = arr.length / sum;

        System.out.print("Harmonic Average : " + harmonic);
    }
}
