package challenges;

import java.util.*;

public class NonRepeatingNumbers {
    public static void main(String[] args) {
        int arr[] = {18 ,24 ,24 ,21 ,10 ,29 ,8 ,10 ,29 ,18};

        int[] ans = singleNumberPerformative(arr);
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }

    static int[] singleNumber(int[] nums) {
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                array.add(nums[i]);
            }
        }

        int[] result = new int[array.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = array.get(i);
        }

        Arrays.sort(result);

        return result;
    }

    static int[] singleNumberPerformative(int[] nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num: nums) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        List<Integer> array = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: occurrences.entrySet()) {
            if (entry.getValue() == 1) {
                array.add(entry.getKey());
            }
        }

        int[] result = array.stream().mapToInt(i -> i).toArray();

        Arrays.sort(result);
        return result;
    }
}
