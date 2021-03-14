
public class accessModifiers {
	


	public static void main(String[] args) {
		
		specificModifier obj = new specificModifier();
		obj.display();
	}

}

class specificModifier{
	protected void display() {
		System.out.println("Inside display method");
	}
}
