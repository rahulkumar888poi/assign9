import java.util.Scanner;
interface Animals
{
	void eat();
	void speak();
	
	
	
	
}

class dog implements Animals
{
	public void eat()
	{
		
		System.out.print("Meat");
		
	}
	
	public void speak()
	{
		
		System.out.print("Dog");
		
	}
	
	
}


class cat implements Animals
{
	public void eat()
	{
		
		System.out.print("Fish");
		
	}
	
	public void speak()
	{
		
		System.out.print("Cat");
		
	}
	
	
}

class more
{
	
	public static void main(String[] args)
	{
		
	dog d=new dog();
	cat c=new cat();
d.eat();
d.speak();	
	c.eat();
c.speak();	
		
	}
	
}