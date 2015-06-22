import java.util.Scanner;

public class searchLinear{
	int myArray[]= {1,2,4,41,55};

	static Scanner inBox = new Scanner(System.in);

	public static int checkGuess(int non, int[] myArray){
		for (int n = 0; n < myArray.length; n++){
			if(myArray[n]==non){
				return 1;
			}else {
				return 0;
			}
		}

		
	}
	public static void main(String[] args){
	}

}