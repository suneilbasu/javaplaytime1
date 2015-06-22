import java.io.*;
import java.util.*;
public class demoIf1{
	public static void main (String args[]){
		Scanner cheesey = new Scanner(System.in);
		System.out.println("2 + 2 = ?");
		int guess = cheesey.nextInt();
		if (guess == 4)
			System.out.println(" correct ");
	}
}