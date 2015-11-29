import java.util.Scanner;

class BasicMaths{
	public static void main(String[] args) {
		double x, y;
		String operation;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		x = in.nextFloat();

		System.out.println("Enter another number: ");
		y = in.nextFloat();

		System.out.println("Choose the letter for your desired action:");
		System.out.println("        A) Add");
		System.out.println("        B) Subtract");
		System.out.println("        C) Multiply");
		System.out.println("        D) Divide");
		System.out.println("        E) Power");
		System.out.println("        F) Factorial");

		operation = in.next().toLowerCase();

		if (operation.equals("a")) {
			add(x, y);
		} else if (operation.equals("b")) {
			System.out.println("Subtract first number by second? Y/N");
			operation = in.next().toLowerCase();
			if (operation.equals("y")) {
				subtract(x, y);
			} else {
				subtract(y, x);
			}
		} else if (operation.equals("c")) {
			multiply(x, y);
		} else if (operation.equals("d")) {
			System.out.println("Divide first number by second? Y/N");
			operation = in.next().toLowerCase();
			if (operation.equals("y")) {
				divide(x, y);
			} else {
				divide(y, x);
			}
		} else if (operation.equals("e")) {
			System.out.println("The first number to the power of the second? Y/N");
			operation=in.next().toLowerCase();
			if (operation.equals("y")) {
				power(x, y);
			} else {
				power(y, x);
			}
		} else if (operation.equals("f")) {
			System.out.println("Take factorial of first number? Y/N");
			operation = in.next().toLowerCase();
			if (operation.equals("y")) {
				System.out.println(factorial(x));
			} else {
				System.out.println(factorial(y));
			}
		}

		in.close();
	}

  // Takes two double numbers and prints out the sum of the numbers.
	static void add(double x, double y) {
		System.out.println(x + y);
	}

  // Takes two double numbers and prints out the difference of the first number minus the second number.
	static void subtract(double x, double y) {
		System.out.println(x - y);
	}

  // Takes two double numbers and prints out the product of the numbers.
	static void multiply(double x, double y) {
		System.out.println(x * y);
	}

  // Takes two double numbers and prints out the quotient of the first number divided by the second.
	static void divide(double x, double y) {
		System.out.println(x / y);
	}

  // Takes two double numbers and prints out the answer of first number to the power of second number.
	static void power(double x, double y) {
		System.out.println(Math.pow(x, y));
	}

  // Takes one double number and prints out the factorial of that number.
	static double factorial(double x) {
		double factorialnumbers = 1;
		while (x > 0) {
			factorialnumbers = factorialnumbers * x--;
		}

		return factorialnumbers;
	}
}
