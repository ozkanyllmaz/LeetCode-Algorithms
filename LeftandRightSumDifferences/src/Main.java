import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = 0;
        rightSum[0] = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum[i + 1] = leftSum[i] + nums[i];
        }
        rightSum[rightSum.length - 1] = 0;

        for (int i = nums.length - 1; i > 0; i--) {
            rightSum[i - 1] = rightSum[i] + nums[i];
        }

        int[] answer = new int[nums.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        Solution solution = new Solution();
        int[] result = solution.leftRightDifference(nums);
        System.out.println(Arrays.toString(result));


    }
}