import java.util.Scanner;
// create a linear search that checks each item in an array.

public class LinearSearch1{
	static Scanner inBox = new Scanner(System.in);
	
	public static void main(String args[]){
		int lookfor = inBox.nextInt();
		int myArray[]= {1,2,4,41,55};
		
		public static boolean hereorNot(){		
					for (int n = 0; n < myArray.length; n++){

			if(myArray[n]==lookfor){
				System.out.println("found");
			}
			else{
				System.out.println("not here");
			}

		}

	}
}