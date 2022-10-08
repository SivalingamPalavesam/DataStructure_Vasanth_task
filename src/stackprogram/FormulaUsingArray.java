package stackprogram;

import java.util.Arrays;
import java.util.Scanner;

public class FormulaUsingArray 
{
	static int c =0;

	static void Formula(int[] firstArray, int[] SecArray)
	{
		int totalValue=0;
		for(int i = 0;i<firstArray.length;i++)
		{
			for(int j = 0;j<SecArray.length;j++)
			{
				int Value = (firstArray[i] * SecArray[j] * (i + j));
				//System.out.println(Value);
				totalValue=totalValue+Value;

			}System.out.println("The Total Value is  :"+totalValue);
		}
	}	
	public static void method(int[] emptyArr,int[] firstArray, int[] SecArray )
	{
		int i,j = 0,k=0;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter User Value   :");
		for(k = 0 ;k<3;k++)
		{
			emptyArr[k]=input.nextInt();
		}
		k=0;
		if(emptyArr[k]==1) {
			i=emptyArr[k+1];
			j=emptyArr[k+2];
			int temp;
			temp=firstArray[i];
			firstArray[i]=SecArray[j];
			SecArray[j]=temp;
		}
		if(emptyArr[0]==2) {
			i=emptyArr[k+1];
			j=emptyArr[k+2];
			int temp;
			temp=firstArray[i];
			firstArray[i]=firstArray[j];
			firstArray[j]=temp;
		}
		if(emptyArr[0]==3) {
			i=emptyArr[k+1];
			j=emptyArr[k+2];
			int temp;
			temp=SecArray[i];
			SecArray[i]=SecArray[j];
			SecArray[j]=temp;
		}
	}
	public static void main(String[] args)
	{
		int[] firstArray={1,2,3};
		int[] SecArray = {7,6};
		int[] emptyArr = new int [3];

		for(int l =0 ; l<=3;l++)
		{
			FormulaUsingArray.Formula(firstArray,SecArray);
			FormulaUsingArray.method(emptyArr,firstArray,SecArray);
			System.out.println(Arrays.toString(firstArray));
			System.out.println(Arrays.toString(SecArray));
		}
	}

}
