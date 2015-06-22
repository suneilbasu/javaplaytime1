import java.io.*;
import java.util.*;

public class demoImportKeyboardDoubleAndInt1
{
	public static void main (String args[])
	{
		Scanner basu = new Scanner(System.in);
		System.out.println("I will double your number! ");
		int yourNumber = basu.nextInt();
		yourNumber = yourNumber * 2;
		System.out.println(yourNumber);
	}
}