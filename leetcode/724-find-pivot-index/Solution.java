class Solution {
    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++)
                leftSum += nums[j];

            for (int k = i + 1; k < nums.length; k++)
                rightSum += nums[k];

            System.out.println("LeftSum " + leftSum + " | RightSum " + rightSum);
            System.out.println();
            if (leftSum == rightSum)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };
        int pivot = pivotIndex(arr);
        if (pivot < 0)
            System.out.println("No pivot found!");
        else
            System.out.println("Pivot found at index " + pivot);
    }
}