import java.util.*;

public class Demo071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter array elements: ");
        String[] input = scanner.nextLine().split(" ");
        
        Set<Integer> seen = new HashSet<>(), duplicates = new HashSet<>();
        
        for (String s : input) {
            int num = Integer.parseInt(s);
            if (!seen.add(num)) duplicates.add(num);
        }
        
        System.out.println("Duplicates: " + duplicates);
        scanner.close();
    }
}