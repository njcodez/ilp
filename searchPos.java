import java.util.Scanner;
import java.util.Arrays;

public class searchPos {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;} 
            else if (nums[mid] < target) {
                left = mid + 1;}
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {nums[i] = sc.nextInt();}
        System.out.print("target: ");
        int target = sc.nextInt();
        int result = searchInsert(nums, target);
        System.out.println("array: " + Arrays.toString(nums));
        System.out.println("target: " + target);
        System.out.println("position: " + result);
    }
}
