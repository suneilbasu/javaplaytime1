class Lunch {
	public boolean diet_yes_no;
	public int calories;

	public Lunch(boolean diet, int cal){
		diet_yes_no = diet;
		calories = cal;
	}
	
}
public class Diet {
	public static void main (String[] args){
		Lunch yummy = new Lunch(true, 900);
		System.out.println(yummy.diet_yes_no);
		System.out.println(yummy.calories);
	}
}