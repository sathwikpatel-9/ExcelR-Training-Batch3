import java.util.Scanner;

public class Demo022 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter monthly gross salary (in Rs): ");
        double grossSalary = sc.nextDouble();
        
        System.out.print("Enter monthly HRA (in Rs): ");
        double hra = sc.nextDouble();
        
        System.out.print("Enter monthly PF (in Rs): ");
        double pf = sc.nextDouble();
        
        double annualSalary = grossSalary * 12;
        double deductions = (hra + pf) * 12;
        double taxableIncome = annualSalary - deductions;
        
        double totalTax = 0;
        
        if (taxableIncome <= 500000) {
            totalTax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            totalTax = 50000 + (taxableIncome - 500000) * 0.20;
        } else {
            totalTax = 150000 + (taxableIncome - 1000000) * 0.30;
        }
        
        System.out.println("Annual Salary: Rs " + annualSalary);
        System.out.println("Annual Deductions (HRA + PF): Rs " + deductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Total Tax to be paid: Rs " + totalTax);
        
        sc.close();
    }
}