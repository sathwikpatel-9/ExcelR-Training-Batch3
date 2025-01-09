import java.util.Scanner;
public class Demo020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int terms = scanner.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci series up to " + terms + " terms:");
            int first = 0, second = 1;

            for (int i = 1; i <= terms; i++) {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;
            }
        }

        scanner.close();
    }
}