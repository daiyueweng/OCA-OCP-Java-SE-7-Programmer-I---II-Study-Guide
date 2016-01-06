//Chapter 6 SELF TEST Question 16
class MyException extends Exception{}
class Tire{
	void doStuff(){}
}
public class Retread extends Tire{
	public static void main(String [] args)
	{
		new Retread().doStuff();
	}
	//insert code here
	//void doStuff(){ // compiles successfully, can throw an exception at runtime
		//System.out.println(7/0);
	//}
	
	//void doStuff() throws MyException{ // compilation failed, can't throw an exception at runtime
		                               //// overriding method can't throw broader checked exception than overridden method
		//System.out.println(7/0);
	//}
	
	//void doStuff() throws RuntimeException{ // compiles successfully, can throw an exception at runtime
		//System.out.println(7/0);
	//}
	
	void doStuff() throws ArithmeticException{ // compiles successfully, can throw an exception at runtime
		System.out.println(7/0);
	}
}
