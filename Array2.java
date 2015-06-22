import java.util.Arrays;
public class Array1

{
	public static void main (String args[])
	{
		String grade[] =  {"","","","","G","O","A","L","!","","","","","",""};
		for(int n=0; n <grade.length; n++)
			{
				System.out.println(grade[n]);
			}
		System.out.println(Arrays.toString(grade));
		}
}