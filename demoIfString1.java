import java.io.*;
import java.util.*;

public class demoIfString1 {
	public static void main (String args[]) {
		Scanner x = new Scanner(System.in);
		System.out.println("What is the secret letter? ");
		String v = x.next();
		System.out.println("you said " + v);
		if (v.equals("b")) {
			System.out.println("you got it right");
		}
	}
}