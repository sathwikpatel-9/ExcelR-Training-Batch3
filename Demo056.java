import java.util.Scanner;

class SumOfCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = sumOfCubesOfDigits(number);

        System.out.println("Sum of cubes of digits of " + number + " is: " + sum);

        scanner.close();
    }

    public static int sumOfCubesOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        return sum;
    }
}
