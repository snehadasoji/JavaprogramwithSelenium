package scanpro;
import java.util.Scanner;


public class Scanprogram {

	public static void main(String[] args) {
		
		int weekday;
		
		Scanner in = new Scanner(System.in);{
		System.out.println("Enter weekday number: ");
		weekday = in.nextInt();
		}
		
		if(weekday==1)
		{
			
			System.out.println("Sunday");
		}
		else if(weekday == 2)
		{
			System.out.println("Monday");
		}
		else if(weekday == 3)
		{
			System.out.println("Tuesday");
		}
		else if(weekday == 4)
		{
			System.out.println("Wednesday");
		}
		else if(weekday == 5)
		{
			System.out.println("Thursday");
			
		}
		else if(weekday == 6)
		{
			System.out.println("Friday");
		}
		else if(weekday == 7)
		{
			System.out.println("Saturday");
		}
		else
		{
			System.out.println("Invalid Enter...!");
		}
 
	}

}
