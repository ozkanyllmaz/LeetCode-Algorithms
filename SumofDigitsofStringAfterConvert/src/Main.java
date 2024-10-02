import java.util.Scanner;

class Main {
    public static int getLucky(String str, int k) {
        char[] letters = new char[26];
        int sum = 0;
        for(int i = 0; i < 'z'-'a'; i++){
            letters[i] = (char) ('a' + i);
        }
        for(char ch : str.toCharArray()){
            for(int i = 0; i < letters.length; i++){
                if(ch == letters[i]){
                    sum += i+1;
                }
            }
        }
        if(k != 1){
           while(k > 0){

               k--;
           }
        }

        return sum;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("s = ");
        String s = scan.nextLine();
        System.out.print("k = ");
        int k = scan.nextInt();

        System.out.println(getLucky(s,k));

    }
}