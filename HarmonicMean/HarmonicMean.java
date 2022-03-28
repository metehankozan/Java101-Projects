package HarmonicMean;

public class HarmonicMean {

    static double harmonicMean(int[] arr) {
        return arr.length / harmonicSeries(arr);
    }

    static double harmonicSeries(int[] arr) {
        double sum = 0;
        for (int elem : arr) {
            sum += 1. / elem;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 4};
        System.out.println(harmonicMean(arr));
    }
}
