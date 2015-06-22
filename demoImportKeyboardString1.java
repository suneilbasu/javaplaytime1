import java.io.*;
import java.util.*;

public class demoImportKeyboardString1
{
	public static void main (String args[])
	{
		Scanner kbReader = new Scanner(System.in);
		System.out.println("input something ");
		String youSaid = kbReader.nextLine();
		System.out.println("You said "+youSaid);
	}
}