package stackprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DescStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size = input.nextInt();
		List<Integer> listEmty = new ArrayList<Integer>(size);
		List<Integer> listfirst = new ArrayList<Integer>(size);

		System.out.println("Enter the StackValue  :");
		for (int i = 0; i < size; i++) {
			listfirst.add(input.nextInt());
		}
		int count = 0;
		for (int i = 0; i < listfirst.size() - 1; i++) {
			if (listfirst.get(i) > listfirst.get(i + 1)) {
				listEmty.add(listfirst.get(i));
			} else {
				listfirst.remove(listfirst.get(i + 1));
				listEmty.add(listfirst.get(i));
			}
			count++;
		}
		System.out.println(count - 1);

		for (int i = 0; i < listEmty.size(); i++) {
			System.out.println("The Stack value is " + listEmty.get(i) + " ");
		}
	}

}
