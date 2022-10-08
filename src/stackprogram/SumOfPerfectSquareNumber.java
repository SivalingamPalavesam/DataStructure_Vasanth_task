package stackprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Sivalingam P
 * @version 24-05-2022
 */
public class SumOfPerfectSquareNumber {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size=input.nextInt();

		List<Integer> arr = new ArrayList<Integer>(size); // 1, 4, 2, 5, 12, 5 , 2, 4

		System.out.println("Enter the array value :");

		for(int i =0; i<size;i++)
		{
			arr.add(input.nextInt());
		}
		int SubArray = size/2;
		System.out.println("Minimum sub array size is above 2  :"+SubArray);
		for(int i = 0;i <= size-1;i++)
		{
			for(int j =0 ; j<=size-1;j++)
			{
				for(int k =0;k<size;k++)
				{	
					if(SubArray == 3)
					{
						int total = arr.get(i)+arr.get(j)+arr.get(k);
						int sqrt =  (int) Math.sqrt(total);
						if(sqrt*sqrt == total) 
						{
							System.out.println("("+arr.get(i)+" , "+arr.get(j)+" , "+arr.get(k)+")"+"   => "+total);
						}
					}
				}
				if(SubArray == 2)
				{
					int total = arr.get(i)+arr.get(j);
					int sqrt =  (int) Math.sqrt(total);
					if(sqrt*sqrt == total) 
					{
						System.out.println("("+arr.get(i)+" , "+arr.get(j)+")"+"  =>"+total);
					}
				}
			}
			if(SubArray == 1 )
			{
				int total = arr.get(i);
				int sqrt =  (int) Math.sqrt(total);
				if(sqrt*sqrt == total) 
				{
					System.out.println("("+arr.get(i)+")");
				}
			}
		}
	}
}
