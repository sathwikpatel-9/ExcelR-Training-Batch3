package Core_Java;
import java.util.Scanner;
public class Demo007 {
    public static void main(String[] args){
        String name;
        int age;
        Long phoneno;
        System.out.println("plz enter ur name, age, and phone no");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        phoneno = sc.nextLong();
        System.out.println("hello "+name +"your age is "+age +"your phone no is"+phoneno);
    }
}