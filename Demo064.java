import java.util.Scanner;

class SwapFirstLastElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size <= 1) {
            System.out.println("Array should have at least two elements to swap.");
            return;
        }

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int temp = array[0];
        array[0] = array[size - 1];
        array[size - 1] = temp;

        System.out.println("Array after swapping 1st and last elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
