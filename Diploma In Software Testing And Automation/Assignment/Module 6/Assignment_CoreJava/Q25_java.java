package Assignment;
abstract class parent {
	abstract void message(); 
} class FirstSubClass extends parent { 
	@Override 
   void message()
	{ System.out.println("this is first subclass");
	} 
	}
 class SecondSubClass extends parent {
	 @Override
	 void message()
	 { System.out.println("this is second subclass");
	 }
	 
}
public class Q25_java {

	public static void main(String[] args) {
		FirstSubClass obj = new FirstSubClass();
		obj.message(); 
		
		SecondSubClass obj1 = new SecondSubClass();
		obj1.message();

	}

}
