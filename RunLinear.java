import java.util.Scanner;
public class RunLinear{
	static Scanner inputBox = new Scanner(System.in);

	public static void main(String[]args){
		System.out.println("enter search... ");
		int like = inputBox.nextInt();
		Linear z = new Linear();
		z.look(like);
	}
}