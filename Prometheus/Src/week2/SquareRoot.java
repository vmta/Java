package week2;

public class SquareRoot {

	public static void main(String[] args) {
		double a = 3;
		double b = 2.5;
		double c = -0.5;

		double x1, x2;
		
		x1 = (Math.sqrt(b * b - 4 * a * c) - b) / (2 * a);
		x2 = (- Math.sqrt(b * b - 4 * a * c) - b) / (2 * a);
		
		x1 = (Double.isInfinite(x1)) ? 0.0 : x1;
		x2 = (Double.isInfinite(x2)) ? 0.0 : x2;
		x1 = (Double.isNaN(x1)) ? x2 : x1;
		x2 = (Double.isNaN(x2)) ? x1 : x2;

		if (!Double.isNaN(x1)) {
			System.out.println("x1=" + x1);
		} else {
			System.out.println("x1=");
		}
		
		if (!Double.isNaN(x2)) {
			System.out.println("x2=" + x2);
		} else {
			System.out.println("x2=");
		}
	}
}