package challenges;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatingNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1, 4};
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
                if (arr[i] != arr[j] && !array.contains(arr[i])) {
                    array.add(arr[i]);
                } else if(arr[i] == arr[j] && !array.contains(arr[i])) {
                    System.out.println("Iguais =>" + arr[i] + " " + arr[j]);
                    break;
                }
            }
        }

        System.out.println(array);
    }
}
