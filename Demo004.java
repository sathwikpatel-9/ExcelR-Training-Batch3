public class Demo004{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 25;
        int num3 = 30;
        if(num1>num2 & num1>num3){
            System.out.println("Num1 is greater");
        }
        else if(num2>num1 & num2>num3){
            System.out.println("num2 is greater");
        }
        else{
            System.out.println("num3 is greater");
        }
    }
}