package Exercise4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// The variable list1 and list2 are reference arrays that each have 5 elements
		//Write code that copies the values in list1 to list2
		//Values in list1 are input by user
				
			Scanner in = new Scanner (System.in);
				
			int[] list1 = new int[5];
			int[] list2 = list1;
				
			System.out.println("Enter the value for List 1: ");
			for (int i=0; i<list1.length;i++) {
				list1[i] = in.nextInt();
			}
				
			System.out.println();
			System.out.print("List 1: ");
			for (int i=0; i<list1.length; i++) {
				System.out.print(list1[i]);
			}
				
			System.out.println();
			System.out.print("List 2: ");
			for (int i=0; i<list2.length; i++) {
				System.out.print(list2[i]);
			}

	}

}
