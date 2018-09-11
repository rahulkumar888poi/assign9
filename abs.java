import java.util.Scanner;
abstract class animals
{
	
	String color;
	String name;
	String breed;
	
	abstract void eat();
	void speak()
	{
		
	}
	
	
	
	
	
}

class dog extends animals
{
	 void eat()
	{
		
		System.out.print("Meat");
		
	}
	
	void speak()
	{
		
		System.out.print("Dog");
		
	}
	
	
}



class more
{
	
	public static void main(String[] args)
	{
		
	dog d=new dog();

d.eat();
d.speak();	
	
		
	}
	
}