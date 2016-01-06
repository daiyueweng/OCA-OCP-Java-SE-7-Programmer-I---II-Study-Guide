//Using break and continue
class BrkContTest{
	public static void main(String [] args)
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Inside Loop");
			continue;
		}
		
		Foo foo = new Foo();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Inside Loop");
			if (foo.doStuff()==5)
			{
				continue;
			}
			// more loop code, that won't be reached when the above if
			// test is true
		}	
	}
}

class Foo{
	int doStuff(){
		return 5;
	}
}
