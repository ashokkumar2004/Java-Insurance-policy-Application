package authendication;
import java.util.*;
public class Authendication implements IAuthendication{
	private static int userid=45;
	private static int password=1234;
	public boolean user()
	{
		
		System.out.println("Enter user id");
		if(user1())
		{
			if(pass())
			{
				return true;
				
			}
			else
			{
				return false;
			}
			
			
		}
		else
		{
			return false;
		}
		
		
		
	}
	private boolean user1()
	{
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		if(id==userid)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	private boolean pass()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password");		
		int pass1=sc.nextInt();
		if(pass1==password)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

}
