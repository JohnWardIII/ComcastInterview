import java.util.ArrayList;

public class ComcastInterview {
    public int minValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;

        for (int each : n){
            if (each > max){
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {10,15,20,22,25,30};
        ComcastInterview comcastInterview = new ComcastInterview();
        System.out.println("Minimum value = " + comcastInterview.minValue(arr));
        System.out.println("Maximum value = " + comcastInterview.maxValue(arr));
    }
}
