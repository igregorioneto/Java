package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ValueEqualIndesValue {
    public static void main(String[] args) {
        int[] arr = {1 ,335, 501, 170, 725 ,479, 359, 963 ,465 ,706, 146 ,12 ,828 ,962 ,492 ,996, 943, 828 ,437 ,392 ,605, 903 ,154 ,293, 383 ,422 ,717 ,719 ,896, 448 ,727, 772 ,539, 870, 913, 668, 300, 36, 895, 704, 812, 323};
        System.out.println(equalsValuesArray(arr, 42));
    }

    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        //List<Integer> array = new ArrayList<>(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
        ArrayList<Integer> newArray = new ArrayList<>();
        if (n >= 0 && arr.length > 0) {
            var a = Arrays.stream(arr)
                    .boxed()
                    .collect(Collectors.toCollection(ArrayList::new));

            newArray.add(a.get(n - 1));
        }
        return newArray;
    }

    static ArrayList<Integer> valueEquals(int[] arr, int n) {
        ArrayList<Integer> newArray = new ArrayList<>();
        if (n > 0 && arr.length > 0) {
            newArray.add(arr[n - 1]);
        }
        return newArray;
    }

    static ArrayList<Integer> valueEqual(int[] arr, int n) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int value:arr) {
            if (value % n == 0) newArray.add(value);
        }
        return newArray;
    }

    static ArrayList<Integer> equalsValuesArray(int[] arr, int n) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) newArray.add(arr[i]);
        }
        return newArray;
    }
}
