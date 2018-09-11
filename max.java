import java.util.Scanner;
class A
{
	public static void main(String[] args)

	{
		String s1;
		String s2;
		int a,b;
		
		Scanner s=new Scanner(System.in);
		s1=s.next();
		s2=s.next();
		a=Integer.parseInt(s1);
				b=Integer.parseInt(s2);
				
				if(a>b)
				{
					System.out.print("Maximum is = "+ a);
				}
				else
				{
					System.out.print("Maximum is = "+ b);
				}
				
				
				
		
	}

	
	
	
}