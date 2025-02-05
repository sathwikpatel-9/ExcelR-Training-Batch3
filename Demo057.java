import java.util.Scanner;

class SumFirstLastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = sumFirstAndLastDigit(number);

        System.out.println("Sum of first and last digits of " + number + " is: " + sum);

        scanner.close();
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}
