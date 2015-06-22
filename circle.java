
class RoundShape {
	public RoundShape(double r){
		radius = r;
	}
	public double area() {
		double a = Math.PI*radius*radius;
		return a;
	}
	public double circumference() {
		double a = 2 * Math.PI* radius;
		return a;
	}
	public void setRadius(double nr){
		radius = nr;
	}
	public double radius;
}
public class Circle {
	public static void main(String[] args){
		RoundShape bob = new RoundShape(33.2);
		System.out.println(bob.area());
	}
}