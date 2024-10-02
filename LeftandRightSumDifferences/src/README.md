# Left and Right Sum Differences

## Problem Description

Given a **0-indexed** integer array `nums`, calculate the **left sum** for each index `i` and the **right sum** for each index `i`. The `leftSum[i]` is defined as the sum of all elements of `nums` strictly to the left of index `i`. The `rightSum[i]` is defined as the sum of all elements of `nums` strictly to the right of index `i`.

Return a new array `answer` where `answer[i] = |leftSum[i] - rightSum[i]|`.

### Example 1:

Input: nums = [10, 4, 8, 3] Output: [15, 1, 11, 22] Explanation:

For index 0: leftSum = 0, rightSum = 15 -> |0 - 15| = 15

For index 1: leftSum = 10, rightSum = 11 -> |10 - 11| = 1

For index 2: leftSum = 14, rightSum = 3 -> |14 - 3| = 11

For index 3: leftSum = 22, rightSum = 0 -> |22 - 0| = 22

### Example 2:

### Constraints:
- `1 <= nums.length <= 1000`
- `1 <= nums[i] <= 10^5`

## Approach

1. **Left Sum Calculation**: Create an array `leftSum` where each element `leftSum[i]` holds the sum of all elements before index `i` in the array `nums`.
2. **Right Sum Calculation**: Create an array `rightSum` where each element `rightSum[i]` holds the sum of all elements after index `i` in the array `nums`.
3. **Result Calculation**: Create an array `answer` where each element `answer[i]` is the absolute difference between `leftSum[i]` and `rightSum[i]`.

### Time Complexity:
- The solution has a time complexity of **O(n)**, where `n` is the length of the array `nums`, as we traverse the array three times (once for left sum, once for right sum, and once for calculating the result).

### How to Run To run the Java code:

Compile the Solution.java file:

## How to Run

To run the Java code:

1. Compile the `Solution.java` file:
    ```bash
    javac Solution.java
    ```

2. Run the program:
    ```bash
    java Solution
    ```
### Output: 
    Answer: [15, 1, 11, 22]
