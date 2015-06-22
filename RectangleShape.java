class Rectangle{
	double lengthr;
	int widthr;

	public Rectangle(double l, int w){
		lengthr = l;
		widthr = w;
	}
	public double area() {
		double a = lengthr* widthr;
		return a;
	}
}
public class RectangleShape {
	public static void main(String[] args){
		Rectangle bob = new Rectangle(3.0,2);

		System.out.println(bob.area());
	}

}