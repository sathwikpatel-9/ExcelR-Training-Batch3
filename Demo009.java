import java.util.*;
public class Demo009{

        String Cust_Name = "Anirudh";
        long Account_no = 123456789;
        Double Balance = 10000.00;
        void accept_details(){
            Scanner sc = new Scanner(System.in);
            Cust_Name = sc.nextLine();
            Account_no = sc.nextLong();
            //Balance = sc.nextDouble();
        }
        void Display_details(){
            System.out.println("Hello "+Cust_Name);
            System.out.println("Ur Balance is "+Balance);
        }
        public static void main(String[] args) {
            Demo009 obj = new Demo009();
            obj.accept_details();
            obj.Display_details();
        }
    }
 