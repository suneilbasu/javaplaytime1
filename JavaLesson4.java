import java.util.Scanner;
public class JavaLesson4 {
	static Scanner inputbox = new Scanner(System.in);

	public static void main(String[] args){
		String contYorN = "Y";

		int h = 1;
		while (contYorN.equalsIgnoreCase("y")){
			System.out.print("continue y or n? ");
			contYorN = inputbox.nextLine();
			h++;
		}
	}
}