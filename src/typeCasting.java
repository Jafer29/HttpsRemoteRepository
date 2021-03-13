
public class typeCasting {

	public static void main(String[] args) {
		char b = 'A';
		//Implicit conversion
		System.out.println("This is Implicit Cnversion");
		System.out.println("the value of a is"+b);
		int c = 'b';
		System.out.println("the value of c is"+c);
		float d = 'b';
		System.out.println("the value of d is"+d);
		double e = 'b';
		System.out.println("the vale of e is"+e);
		
		//Explicit conversion
		
		double f = 60.5;
		System.out.println("this is explicit conversion");
		int y = (int) f;
		System.out.println("the vaalue of f is" +f);
		System.out.println("the value of y is"+y);
		
		
		
		

	}

}
