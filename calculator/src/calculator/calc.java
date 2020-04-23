package calculator;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// Auto-generated method stub

		double answer;
		boolean cont = true;
		String op;


		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("Enter the first number: \n");
			double num1 = scan.nextDouble();	
			scan.nextLine();
			System.out.println("Enter a second number: \n");
			double num2 = scan.nextDouble();
			scan.nextLine();

			System.out.println("What operation do you want to do? (+,-,*,/) \n");
			op = scan.nextLine();

			if (op.equals("+")) {
				answer = num1 + num2;
				System.out.println(num1 + op + num2 + " = " + answer);

				System.out.println("Would you like to do another? Y/N \n");
				String again = scan.nextLine().toUpperCase();

				if (again.equals("Y")) {
					cont = true;
				}

				else if (again.equals("N")) {
					cont = false;
				}

				else {
					System.out.println("Please type a valid answer");
				}

			}
			else if (op.equals("-")) {
				answer = num1 - num2;
				System.out.println(num1 + op + num2 + " = " + answer);

				System.out.println("Would you like to do another? Y/N \n");
				String again = scan.nextLine().toUpperCase();

				if (again.equals("Y")) {
					cont = true;
				}

				else if (again.equals("N")) {
					cont = false;
				}

				else {
					System.out.println("Please type a valid answer");
				}
			}
			else if (op.equals("*")) {
				answer = num1 * num2;
				System.out.println(num1 + op + num2 + " = " + answer);

				System.out.println("Would you like to do another? Y/N \n");
				String again = scan.nextLine().toUpperCase();

				if (again.equals("Y")) {
					cont = true;
				}

				else if (again.equals("N")) {
					cont = false;
				}

				else {
					System.out.println("Please type a valid answer");
				}
			}
			else if (op.equals("/")) {
				answer = num1 / num2;
				System.out.println(num1 + op + num2 + " = " + answer);

				System.out.println("Would you like to do another? Y/N \n");
				String again = scan.nextLine().toUpperCase();

				if (again.equals("Y")) {
					cont = true;
				}

				else if (again.equals("N")) {
					cont = false;
				}

				else {
					System.out.println("Please type a valid answer");
				}
			}

			else {
				System.out.println("Please choose a valid operator");
			}



		} while (cont == true);

		System.out.println("Thanks for using \n");



		scan.close();
	}

}
