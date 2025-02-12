import java.util.Scanner;

class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] originalArray = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }
        
        int[] copiedArray = new int[n];
        for (int i = 0; i < n; i++) {
            copiedArray[i] = originalArray[i];
        }
        
        System.out.println("Elements of the copied array:");
        for (int i = 0; i < n; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }
}