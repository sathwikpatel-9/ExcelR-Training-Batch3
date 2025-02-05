import java.util.Scanner;

class Demo052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int digits = 0;

        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }

        originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, digits);
            originalNumber /= 10;
        }

        return result == number;
    }
}
