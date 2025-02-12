import java.util.Scanner;

class SecondMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element (all elements may be the same).");
        } else {
            System.out.println("The second maximum element in the array is: " + secondMax);
        }
    }
}
