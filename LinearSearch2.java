import java.util.Scanner;
public class LinearSearch2{
	static Scanner inBox = new Scanner(System.in);

	public static boolean isMatch(int a, int look, int myArray[]){
		for (int n = 0; n < myArray.length; n++){
			if(look==2){
				return true;
			}
			return false;
			}
		}
	}
	public static void main(String[] args){
		int myArray[]= {1,2,4,41,55}; 
		System.out.print("look for: ");
		int look = inBox.nextInt();
	}	
}
