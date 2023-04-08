package test_Q;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:   " );
		String name = in.nextLine();
		int age = in.nextInt();
		double marks = in.nextDouble();

	
	
	if (age >= 17 && age <= 21)
	{
		if(marks >= 80)
		{
			System.out.println(name  +  "is eligible.");
		}
	
	}else	
			
		System.out.println(name  +  "is not eligible.");
	}
}
