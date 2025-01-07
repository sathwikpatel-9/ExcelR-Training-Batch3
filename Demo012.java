class CircleAreaDemo1 {

	void Area() {
		
		int r = 5;
		
		double ca = Math.PI* Math.pow(r, 2);
		
		System.out.println("The circle area is : " + ca);
	}

}
public class Demo012 {
    public static void main(String[] args) {
        CircleAreaDemo1 obj = new CircleAreaDemo1();
        obj.Area();
    }
}