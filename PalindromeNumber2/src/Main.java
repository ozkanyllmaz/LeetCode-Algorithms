import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int sayi) {
        int count = 0;
        int sayi1 = sayi;
        if (sayi < 0) {
            return false;
        }
        while (sayi > 0) {
            int kalan = (sayi % 10);
            sayi = (sayi - kalan) / 10;
            count++;
        }
        int[] kalanDizi = new int[count];
        int i = 0;
        while (sayi1 > 0) {
            kalanDizi[i] = (sayi1 % 10);
            sayi1 = (sayi1 - kalanDizi[i]) / 10;
            i++;
        }
        for (int x = 0, y = 0; x < count / 2; x++) {
            if (kalanDizi[x] != kalanDizi[count - x - 1]) {
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        Solution solution = new Solution();
        solution.isPalindrome(sayi);
    }
}