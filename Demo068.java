import java.util.Scanner;

class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even numbers in the array: " + count);

        scanner.close();
    }
}
