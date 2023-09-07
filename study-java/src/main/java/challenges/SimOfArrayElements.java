package challenges;

import java.util.Arrays;

public class SimOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {3 ,2 ,1};
        System.out.println(sumElement(arr, 3));
    }

    public static int sumElement(int arr[], int n) {
        if (n == arr.length) {
            return Arrays.stream(arr).sum();
        }
        return 0;
    }
}
