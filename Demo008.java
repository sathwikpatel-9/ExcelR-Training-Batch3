import java.util.*;
public class Demo008{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String username,pass;
        do{
            System.out.println("welcome to mallareddy University,please login");
            System.out.println("Enter Name");
            username = scanner.next();
            System.out.println("Enter password");
            pass = scanner.next();
        }while((!username.equals("anirudh"))||(!pass.equals("anirudh_015")));
        System.out.println("Successfully logged in.");
    }
}