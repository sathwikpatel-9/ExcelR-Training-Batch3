import java.util.Scanner;

class EvenOddRearrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int[] rearrangedArray = new int[n];
        int leftIndex = 0;
        int rightIndex = n - 1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                rearrangedArray[leftIndex] = arr[i];
                leftIndex++;
            } else {
                rearrangedArray[rightIndex] = arr[i];
                rightIndex--;
            }
        }
        
        System.out.println("Rearranged array with even numbers on the left and odd numbers on the right:");
        for (int i = 0; i < n; i++) {
            System.out.print(rearrangedArray[i] + " ");
        }
    }
}
