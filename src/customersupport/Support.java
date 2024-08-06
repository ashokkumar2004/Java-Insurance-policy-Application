package customersupport;
import java.util.*;
import policydetails.*;
public class Support implements ISupport{
	public void showcoveragetype()
	{
		show();
		
	}
	private void show()
	{
		while(true)
		{
			System.out.println("1.Health Insurance\n2.Vehicle Insurance\n3.Agri Insurance\n4.exit");
			int n=readtype();
			IPolicy policy=new Policy();
			switch(n)
			{
			case 1:
				policy.healthinsurance();
				show();
				break;
			case 2:
				policy.vehicleinsurance();
				show();
				break;
			case 3:
				policy.agriinsurance();
				show();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("ENter valid choice");
				break;
				
			}
			
			
		}
	}
	private int readtype()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		return n;
	}

}
