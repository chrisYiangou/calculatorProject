import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

	/*
	 * Our plan is to create a fully fledged calculator, for now this will act as
	 * the most basic template
	 */

	List<Double> sumList = new ArrayList<Double>();

	@SuppressWarnings("resource")
	public double calculate() {

		Scanner scan;
		double sum = 0;
		String choice = " ";

		scan = new Scanner(System.in);

		System.out.println("Please enter your first number");
		double input1 = scan.nextDouble();
		System.out.println("Please enter your second number");
		double input2 = scan.nextDouble();

		System.out.println("Choose to add/subtract/divide/multiply these numbers");

		while (choice.equals(" ")) {

			choice = scan.nextLine();

			if (choice.equals("+")) {
				sum = input1 + input2;
				System.out.println(sum);
			} else if (choice.equals("-")) {
				sum = input1 - input2;
				System.out.println(sum);
			} else if (choice.equals("/")) {
				sum = input1 / input2;
				System.out.println(sum);
			} else if (choice.equals("*")) {
				sum = input1 * input2;
				System.out.println(sum);
			} else {
				System.out.println("\n ------------------------------- \n");
				System.out
						.println("Press + for Add\nPress - " + "for subtract\nPress / for divide\nPress * to multiply");
				choice = " ";
			}
		}
		sumList.add(sum);
		return sum;
	}

	// Creating a function that will be used to use the result of the last and then
	// do additional math

	public double continueWithSum() {

		Scanner scan;
		double sum = sumList.get(sumList.size() - 1);
		String choice = " ";

		scan = new Scanner(System.in);
		System.out.println("Do you want to continue using sum for additional Math Y/N");
		
		while (choice.equals(" ")) {
		
		choice = scan.nextLine();
		
		if (choice.equalsIgnoreCase("y")) {

			double lastSum = sumList.get(sumList.size() - 1);
			System.out.println("Please enter your first number");
			double input1 = scan.nextDouble();

			System.out.println("Choose to add/subtract/divide/multiply these numbers");

			while (choice.equalsIgnoreCase("y")) {

				choice = scan.nextLine();

				if (choice.equals("+")) {
					sum = input1 + lastSum;
					System.out.println(sum);
				} else if (choice.equals("-")) {
					sum = input1 - lastSum;
					System.out.println(sum);
				} else if (choice.equals("/")) {
					sum = input1 / lastSum;
					System.out.println(sum);
				} else if (choice.equals("*")) {
					sum = input1 * lastSum;
					System.out.println(sum);
				} else {
					System.out.println("\n ------------------------------- \n");
					System.out.println(
							"Press + for Add\nPress - " + "for subtract\nPress / for divide\nPress * to multiply");
					choice = "Y".toLowerCase();
				}
			}
		} else if (choice.equalsIgnoreCase("n")) {
			System.out.println("No problem");
		}  else {
			System.out.println("Please enter Y or N");
			choice = " ";
		}
		}
		
		
		scan.close();
		if (sum != sumList.get(sumList.size() - 1)) {
			sumList.add(sum);
			System.out.println("Sum added to Sum List");
		} else {
			System.out.println("Sum is idential to last Sum, not adding to Sum List");
		}
		return sum;

	}

	// Constructors
	public Calculator() {

	}

	// To receive the list
	public List<Double> getSumList() {
		return sumList;
		
		}

	
	// toString used the get method above and formats the sumList in a more preventable way
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Your Sum List contains: [").append(getSumList()).append("]");
		return builder.toString();
	}
	
	
	}

	// Fundamental basic methods below

	// public int addTwoNumbers(int input1, int input2) {
	// int sumOfInput = input1 + input2;
	// return sumOfInput;
	// }

	// public int subtractTwoNumbers(int input1, int input2) {
	// int sumOfInput = input1 - input2;
	// return sumOfInput;
	// }

	// public int divideTwoNumbers(int input1, int input2) {
	// int sumOfInput = input1 / input2;
	// return sumOfInput;
	// }

	// public int multiplyTwoNumbers(int input1, int input2) {
	// int sumOfInput = input1 * input2;
	// return sumOfInput;

	// }

