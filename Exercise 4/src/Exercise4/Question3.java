package Exercise4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		//Write a program that create an array of 10 element size
		//Your program should prompt the user to input numbers in array
		//Display the sum of all element in array
				
			int[] numbers = new int[10];
				
			Scanner in = new Scanner (System.in);
				
			System.out.println("Enter numbers: ");
			for (int i=0; i<numbers.length; i++) {
				numbers[i] = in.nextInt();
			}
				
			for (int i=0; i<numbers.length; i++) {
				System.out.print(numbers[i]);
			}
				
			System.out.println();
			int sum=0;
			for (int i=0; i<numbers.length; i++) {
				sum= sum + numbers[i];
			}
			System.out.print("The sum of element in array is equal to " + sum);	

	}

}
