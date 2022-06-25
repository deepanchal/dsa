import java.util.Arrays;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int len = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != val) {
                nums[len] = nums[i];
                len++;
            }
            i++;
        }

        return len;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 4, 4, 7 };
        System.out.println("Initial Array: " + Arrays.toString(arr));
        int finalArrLen = removeElement(arr, 4);
        System.out.println(
                "New Array (Length: " + finalArrLen + "): " + Arrays.toString(arr).substring(1, (finalArrLen * 3) - 1)
            );
    }
}