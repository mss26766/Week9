import java.util.Scanner;

public class Week9 {
	public static void main(String[]args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter your Role from the following choices: Administrator, Faculty, Staff, Student, Guest. ");
	
		for (int count=0; count<4; count++){
		String input=keyboard.next();	
		switch(input)
		{
			case "Administrator":
			    System.out.println("Welcome Administrator! ");
			break;
			case "Faculty":
				System.out.println("Welcome Faculty! ");
			break;
			case "Staff":
				System.out.println("Welcome Staff! ");
			break;	
			case "Student":
				System.out.println("Welcome Student! ");
			break;	
			case "Guest":
				System.out.println("Welcome Guest! ");
			break;	
			default: 
				System.out.println("Wrong Role. Enter the role again! ");
			break;	
		  }
		}		
	}
}
