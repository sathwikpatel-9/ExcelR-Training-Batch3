import java.util.*;

class Array{
    String name[] = new String[5];
    String address[] = new String[5];
    long phone[] = new long[5];
    void array1(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter details of friend "+(i+1));
            System.out.print("Enter name: ");
            name[i] = sc.next();
            System.out.print("Enter address: ");
            address[i] = sc.next();
            System.out.print("Enter phone: ");
            phone[i] = sc.nextLong();
        }
    }
    void display(){
        System.out.println("\nMy Friends are: ");
        for(int i=0;i<5;i++){
            System.out.println("Name: "+name[i]);
            System.out.println("Address: "+address[i]);
            System.out.println("Phone: "+phone[i]+"/n");
        }
    }
}
class Demo024{
    public static void main(String[] args){
        Array a = new Array();
        a.array1();
        a.display();
    }
}