import java.util.Scanner;

class ArrayFirstSecondLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        if (size >= 1) {
            System.out.println("1st Element: " + array[0]);
        }
        if (size >= 2) {
            System.out.println("2nd Element: " + array[1]);
        }
        if (size >= 3) {
            System.out.println("Last Element: " + array[size - 1]);
        } else if (size == 2) {
            System.out.println("Last Element: " + array[size - 1]);
        }

        scanner.close();
    }
}
