import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int len = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[len] != nums[i]) {
                len++;
                nums[len] = nums[i];
            }
        }

        return len + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 2, 3, 4, 4, 4, 7 };
        System.out.println("Initial Array: " + Arrays.toString(arr));
        int finalArrLen = removeDuplicates(arr);
        System.out.println(
                "Final Array (Length: " + finalArrLen + "): " + Arrays.toString(arr).substring(1, (finalArrLen * 3) - 1)
            );
    }
}