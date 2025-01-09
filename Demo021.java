public class Demo021 {
    private double annualSalary;
    private double hra;
    private double pf;

    public Demo021(double annualSalary, double hra, double pf) {
        this.annualSalary = annualSalary;
        this.hra = hra;
        this.pf = pf;
    }

    public double calculateDeductions() {
        return hra + pf;
    }

    public double calculateTaxableIncome() {
        return annualSalary - calculateDeductions();
    }

    public double calculateTax() {
        double taxableIncome = calculateTaxableIncome();
        double tax = 0;

        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome <= 1000000) {
            tax = 500000 * 0.10 + (taxableIncome - 500000) * 0.20;
        } else {
            tax = 500000 * 0.10 + 500000 * 0.20 + (taxableIncome - 1000000) * 0.30;
        }

        return tax;
    }

    public static void main(String[] args) {
        Demo021 employee = new Demo021(1200000, 200000, 50000);
        System.out.println("Annual Income Tax: " + employee.calculateTax());
    }
}
