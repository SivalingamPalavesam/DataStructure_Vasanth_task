package stackprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 
 * @author Sivalingam P
 * @version 24-05-2022
 */
public class FindNumberOfSimilarIndexPossible {

	public static void main(String[] args)
	{
		int count1 = 0,count2 = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size=input.nextInt();

		List<Integer> arr = new ArrayList<Integer>(size); //1 3 5 7 8 2 5 7 

		System.out.println("Enter the array value :");

		for(int i =0; i<size;i++)
		{
			arr.add(input.nextInt());
		}
		for(int i =0 ;i<=size-1;i++)
		{
			for(int j=1;j<=size-1;j++)
			{
				if(arr.get(j)>arr.get(i))					
				{
					if(arr.get(i) == arr.get(j)+1 || arr.get(j) == arr.get(i)+1)
					{
					count1++;
					System.out.println("The Number Of Pair is :"+"("+arr.get(i)+" , "+arr.get(j)+")");
					}
					else { count2++;}	
				}
			}
		}
		System.out.println("Number of  pair count is :"+(count1));
	}

}
