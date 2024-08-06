package policydetails;
import authendication.*;
import java.util.*;
import details.*;
public class Policy implements IPolicy {
	IAuthendication authendicate=new Authendication();
	IDetails obj=new Details();
	public void healthinsurance()
	{
		if(authendicate.user())
		{
			System.out.println("Health Insurance type");
			health();
		}
		else
		{
			System.out.println("you're not a valid user create a userid");
		}
		
		
		
	}
	public void vehicleinsurance()
	{
		if(authendicate.user())
		{
			System.out.println("Vehicle Insurance type");
			vehicle();
		}
		else
		{
			System.out.println("you're not a valid user create a userid");
		}
		
	}
	public void agriinsurance()
	{
		if(authendicate.user())
		{
			System.out.println("Agri Insurance type");
			agri();
		}
		else
		{
			System.out.println("you're not a valid user create a userid");
		}
		
	}
	private void health()
	{
		System.out.println("The premium amount and duration for health insurance");
		System.out.println("1.Amount=50000 Duration=2 years ");
		System.out.println("2.Amount=100000 Duration=3 years ");
		System.out.println("3.Amount=200000 Duration=4 years ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			obj.healthdetail1();
			break;
		case 2:
			obj.healthdetail2();
			break;
		case 3:
			obj.healthdetail3();
			break;
		case 4:
			System.out.println("Enter valid choice");
			break;
		default:
			break;
		}
		
		
	}
	private void vehicle()
	{
		System.out.println("The premium amount and duration for vehicle insurance");
		System.out.println("1.Amount=20000 Duration=2 years ");
		System.out.println("2.Amount=40000 Duration=3 years ");
		System.out.println("3.Amount=80000 Duration=4 years");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			obj.vehicledetail1();
			break;
		case 2:
			obj.vehicledetail2();
			break;
		case 3:
			obj.vehicledetail3();
			break;
		case 4:
			System.out.println("Enter valid choice");
			break;
		default:
			break;
		}
		
		
	}
	private void agri()
	{
		System.out.println("The premium amount and duration are");
		System.out.println("1.Amount=50000 Duration=2 years benefits");
		System.out.println("2.Amount=80000 Duration=2 years benefits");
		System.out.println("3.Amount=150000 Duration=2 years benefits");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			obj.agridetail1();
			break;
		case 2:
			obj.agridetail2();
			break;
		case 3:
			obj.agridetail3();
			break;
		case 4:
			System.out.println("Enter valid choice");
			break;
		default:
			break;
		}
		
		
	}

}
