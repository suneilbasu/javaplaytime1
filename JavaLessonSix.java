import java.io.*;
public class JavaLessonSix{
	public static void main(String[] args){
		getAFile("./somestuff.txt");
	}
	public static void getAFile(String fileName){
		try{
		FileInputStream file = new FileInputStream(fileName);
	}
		catch(FileNotFoundException e){
		System.out.println("can't find that file.");
		}
		catch(Exception e) {
			System.out.println("some other vague error");
		}
		finally { // this is always called
			System.out.println("bob");
		}
	}
}
