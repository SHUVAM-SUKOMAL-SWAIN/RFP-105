package Basic_Core_Program;

import java.util.Scanner;

public class GreeetUser_1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.next();
		String greet="Hello UserName, How are you?";
		String str1="UserName";
		
		if(name.length()>=3)
		{
			greet=greet.replace(str1, name);
			System.out.println(greet);
		}
		
		else {
			System.out.println("Your name must be greater than 2 character");
			}
		sc.close();
	}

}
