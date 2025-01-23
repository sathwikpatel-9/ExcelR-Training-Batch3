import java.util.Scanner;


class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10; 
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }
}


public class LTCode002 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();;
        Solution sol = new Solution();
        int result = sol.reverse(number);
        System.out.println(result);
    }
}