import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int romanToInt(String str) {
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int len = 0;
        for (char ch : str.toCharArray()) {
            len++;
        }
        char[] romanArray = new char[len];
        int i = len;
        for (char ch : str.toCharArray()) {
            romanArray[i - 1] = ch;
            i--;
        }
        int sum = roman.get(romanArray[0]);
        for (i = 0; i < len - 1; i++) {
            int currentValue = roman.get(romanArray[i]);
            int lastValue = roman.get(romanArray[i + 1]);
            if (lastValue >= currentValue) {
                sum += (lastValue);
            }
            if (lastValue < currentValue) {
                sum -= (lastValue);
            }
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.romanToInt(str));

    }
}