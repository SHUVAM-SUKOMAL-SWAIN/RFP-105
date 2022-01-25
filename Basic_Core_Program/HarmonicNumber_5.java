package Basic_Core_Program;
import java.util.Scanner;

public class HarmonicNumber_5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of the harmonic number: ");
		int range=sc.nextInt();
		double number=0;
		
		if (range>0)
		{
			for (double i=1;i<=range; i++) 
			{
				number=number+(1/i);
			}
			System.out.println("The "+range+"th value of the harmonic number= "+number);
		}
		else
			System.out.println("Range must be greater than 0");
		
		sc.close();
	}

}
