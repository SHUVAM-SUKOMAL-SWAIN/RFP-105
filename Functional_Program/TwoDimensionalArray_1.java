package Functional_Program;

import java.util.Scanner;

public class TwoDimensionalArray_1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row=sc.nextInt();
		System.out.println("Enter number of columns: ");
		int col=sc.nextInt();
		System.out.println("Total number of elements= "+(row*col));
		
		int array[][];
		array=new int[row][col];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The array elements are:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		sc.close();

	}

}
