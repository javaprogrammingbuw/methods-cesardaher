import java.util.Scanner;


public class Prime {

	public static void main(String[] args){

		System.out.println("Please enter a value:");
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();

		if (isPrime(x) == true){
			System.out.println(x+ " is a prime number");
		} else {
			System.out.println(x+ " is not a prime number");
		}

		findDoublette(x++);

		if (findDoublette(x) != 0){
			System.out.println("The next doublette is " + findDoublette(x));
		} else {
			System.out.println("There are no more doublettes.");
		}
	
	}

	public static boolean isPrime (int x){

		if (x == 1 || x == 2){
			return true;
		}


		for (int n = 2; n < x; n++){

			if (x % n == 0){
				return false;
			}
		}

		return true;

	}

	public static int findDoublette (int x){
		if (x == 3 || x == 5){
			return 3;


		}

		while (x >3 && x < Integer.MAX_VALUE) {
			x++;

			if (isPrime(x) == true && isPrime(x+2) == true){
				return x;

			}
		}

		return 0;

	}
	
	//todo: write a method isPrime which tells you if a given number is a prime or not
	//then, write another method findDoublette which takes an integer value as input and 
	//is looking for the first prime-doublette it findes. A prime-doublette consists of
	//two prime values with the difference of 2 (e.g. 3 and 5).
	//The function should return the smaller one of the doublette. If there exists no
	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
	//the function should return 0.
}
	
