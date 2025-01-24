public class Demo040 {
    int reverse(int x) {
        int rev = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            
            rev = rev * 10 + digit;
        }
        
        return rev;
    }
    
    public static void main(String[] args) {
        Demo040 solution = new Demo040();
        
        int result1 = solution.reverse(123);
        System.out.println("Reversed 123: " + result1);
        
        int result2 = solution.reverse(-123);
        System.out.println("Reversed -123: " + result2);
        
        int result3 = solution.reverse(120);
        System.out.println("Reversed 120: " + result3);
        
        int result4 = solution.reverse(1534236469);
        System.out.println("Reversed 1534236469: " + result4);
    }
}
