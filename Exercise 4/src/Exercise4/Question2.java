package Exercise4;

public class Question2 {

	public static void main(String[] args) {
		//Write a statement that declare a string array initialize with the following string: 
		//Sunday, Monday, Tuesday, Wednesday, Thursday, Friday and Saturday
		//Write a loop that display the content of each element in the array that you declare
			
			String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
				
			for(int i=0;i<days.length;i++) {
				System.out.println(days[i]);
			}
			System.out.println();
				
			int j=0;
			while(j<days.length) {
				System.out.println(days[j]);
				j++;
			}
			System.out.println();
				
			int k=0;
			do {
				System.out.println(days[k]);
				k++;
			}while(k<days.length);
			System.out.println();


	}

}
