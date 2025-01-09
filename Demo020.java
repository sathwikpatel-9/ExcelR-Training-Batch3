import java.util.Scanner;
    class FizzBizz {   
        public String getFizzBizz(int number) {
                            if (number <= 0)
                                    return "Error";
                    if (number % 3 == 0 && number % 5 == 0) 
                                return "FIZZBIZZ";			
                      if (number % 5 == 0)
                        return "BIZZ";
                        if (number % 3 == 0)
                        return "FIZZ";
                    return "number:" + number;
                }
            }
            public class Demo020 {
                public static void main(String[] args) {
                    FizzBizz fbobj = new FizzBizz();
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter a number:");
                    int num = sc.nextInt();
                    sc.close();
                    System.out.println(fbobj.getFizzBizz(num));
        }
    }
