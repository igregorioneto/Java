package challenges;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintAlternateElementsOfAnArray {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4};
        print3(A, 4);
    }

    public static void print(int arr[], int n) {
        if (n == arr.length)
            Arrays.stream(arr)
                    .filter(e -> (e % 2 == 0))
                    .forEach(e -> System.out.print(e + " "));
    }

    public static void print2(int arr[], int n) {
        String p = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                p += arr[i] + " ";
        }
        System.out.print(p);
    }

    public static void print3(int arr[], int n) {
        IntStream.range(0, n)
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.print(arr[i] + " "));
    }
}
