
class Employee {

	protected int id;
	protected String firstName;
	protected String lastName;
	protected String address;
	
	public Employee(){}
	
	public Employee(int id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getFullName(){
		return firstName+" "+lastName;
	}
	
	public void sendMessage(){
		System.out.println("Salary added successfully...");
	}	
}


class FullTimeEmployee extends Employee{
	
	private double basic;
	private double bonus;

	public FullTimeEmployee(){
  }

	public FullTimeEmployee(int id, String firstName, String lastName, double basic, double bonus, String address) {
		super(id,firstName, lastName,address);
		this.basic = basic;
		this.bonus = bonus;
	}
	
	public double computeSal(){
		return basic + bonus;
	}
	
	public void showDetails(){
		System.out.println("Id : " + id);
		System.out.println("Name : " + getFullName());
		System.out.println("Grand Total : " + computeSal());
		System.out.println("Address : " + address);
	}	
	
}



class PartTimeEmployee extends Employee{

	private double amountPerHour;
	private int hoursWorked;
	
	public PartTimeEmployee(){}
	
	public PartTimeEmployee(int id, String firstName, String lastName, double amountPerHour, int hoursWorked,
			String address) {
		super(id,firstName, lastName,address);
		this.amountPerHour = amountPerHour;
		this.hoursWorked = hoursWorked;
	}
	
	public double computeSal(){
		return amountPerHour * hoursWorked;
	}
	
	public void showDetails(){
		System.out.println("Id : " + id);
		System.out.println("Name : " + getFullName());
		System.out.println("Grand Total : " + computeSal());
		System.out.println("Address : " + address);
	}	
}



public class EmployeeDemo011 {

	public static void main(String[] args) {
FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101,"SACHIN","TENDULKAR",6000,2000,"50-50, EAST, MUMBAI");
		fullTimeEmployee.showDetails();
		fullTimeEmployee.sendMessage();
	
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102,"MS","DHONI",150,80,"20-20,WEST, MUMBAI");
		partTimeEmployee.showDetails();
		partTimeEmployee.sendMessage();
	}
}








