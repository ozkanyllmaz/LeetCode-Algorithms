import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{0};
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        solution.twoSum(nums, target);
    }
}