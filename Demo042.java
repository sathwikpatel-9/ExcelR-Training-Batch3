import java.util.Scanner;

class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a lowercase character: ");
        char lowerChar = scanner.next().charAt(0);

        if (lowerChar >= 'a' && lowerChar <= 'z') {

            char upperChar = Character.toUpperCase(lowerChar);
            System.out.println("The uppercase of '" + lowerChar + "' is '" + upperChar + "'.");
        } else {
            System.out.println(lowerChar + " is not a lowercase letter.");
        }

        scanner.close();
    }
}
