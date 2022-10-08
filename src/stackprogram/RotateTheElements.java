package stackprogram;

import java.util.Scanner;

public class RotateTheElements {

	public static void main(String[] args) {

		int size, arraylength;

		Scanner a = new Scanner(System.in); 

		System.out.println("Enter the array size: ");

		size  = a.nextInt();

		System.out.println("Enter the Rotation size");

		int numberOfTimes = a.nextInt();		

		int array[]=new int[size];

		System.out.println("Enter the Numbers");
		for(int i=0;i<size;i++)
		{
			array[i]=a.nextInt();
		}
		for(int j =0 ; j<numberOfTimes;j++)
		{
			arraylength=array[array.length-1];
			for(int k =array.length-1; k>0;k--)
			{	
				array[k] =array[k-1];
			}
			array[0]=arraylength;
		}
		System.out.print("This is Rotation array value => ");
		for(int l=0;l<array.length;l++)
		{
			System.out.print(+array[l]+" ");
		}
		
	}
}
