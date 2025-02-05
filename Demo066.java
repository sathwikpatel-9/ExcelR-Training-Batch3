import java.util.Scanner;

class PrintArrayIndexes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Index values and corresponding elements:");
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }

        scanner.close();
    }
}
