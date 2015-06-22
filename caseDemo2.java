import java.io.*;
import java.util.*;
public class caseDemo2
{
	public static void main (String args[])
	{
		Scanner peep = new Scanner(System.in);
		System.out.println("guess a number ");
		String poop = peep.nextLine();
		char dood = poop.charAt(0);

		switch(dood)
		{
			case '1':
				System.out.println("one");
				break;
			case '2':
				System.out.println("two");
				break;
			default:
				System.out.println("bigger");
		}		
	}
}