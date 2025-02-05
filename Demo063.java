import java.util.Scanner;

class SumFirstLastElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Array should have at least one element.");
            return;
        }

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = array[0] + array[size - 1];
        System.out.println("Sum of 1st and last elements: " + sum);

        scanner.close();
    }
}