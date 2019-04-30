import java.util.Scanner;


public class Circle {
	public static void main(String[] args) {
		System.out.println("Please enter the radius of your circle:");
		Scanner scan = new Scanner(System.in);

		double r = scan.nextDouble();

		System.out.println("Diameter: "+ dia(r));
		System.out.println("Circumference: "+ circ(r));
		System.out.println("Area: "+ area(r));


		}


		public static double dia (double r){
			return 2 * r ;
		}

		public static double circ (double r){
			return 2 * r * Math.PI;
		}

		public static double area (double r){
			return Math.PI * Math.pow(r,2);
		}


	
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm your methods are working correctly.
}
