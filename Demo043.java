import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an uppercase character: ");
        char upperChar = scanner.next().charAt(0);

        if (upperChar >= 'A' && upperChar <= 'Z') {
            char lowerChar = Character.toLowerCase(upperChar);
            System.out.println("The lowercase of '" + upperChar + "' is '" + lowerChar + "'.");
        } else {
            System.out.println(upperChar + " is not an uppercase letter.");
        }

        scanner.close();
    }
}
