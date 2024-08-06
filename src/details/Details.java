package details;
import java.util.*;
public class Details implements IDetails {
	private static int currentinsurance=0; 
	public void healthdetail1()
	{
		currentinsurance+=50000;
		show2();
		
	}
	public void healthdetail2()
	{
		currentinsurance+=100000;
		show2();
		
	}
	public void healthdetail3()
	{
		currentinsurance+=200000;
		show2();
		
	}
	public void vehicledetail1()
	{
		currentinsurance+=20000;
		show2();
		
	}
	public void vehicledetail2()
	{
		currentinsurance+=40000;
		show2();
		
	}
	public void vehicledetail3()
	{
		currentinsurance+=80000;
		show2();
		
	}
	public void agridetail1()
	{
		currentinsurance+=50000;
		show2();
		
	}
	public void agridetail2()
	{
		currentinsurance+=80000;
		show2();
		
	}
	public void agridetail3()
	{
		currentinsurance+=150000;
		show2();
		
	}
	private void show2()
	{
		System.out.print("Your current insurance amount is");
		System.out.println(currentinsurance);
	}
	
}
