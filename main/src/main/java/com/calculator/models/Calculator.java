package com.calculator.models;

import java.io.Console;
import java.util.Scanner;

public class Calculator {

    /*
     * Our plan is to create a fully fledged calculator, for now this will act as
     * the most basic template
     */

    public static double calculate() {

        Scanner scan;
		scan = new Scanner(System.in);
		String choice = " ";
		double sum = 0;

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
				System.out.println("Press + for Add\nPress - " + "for subtract\nPress / for divide\nPress * to multiply");
				choice = " ";
			}
		}
		return sum;
	}

    

    public int addTwoNumbers(int input1, int input2) {
        int sumOfInput = input1 + input2;
        return sumOfInput;
    }

    public int subtractTwoNumbers(int input1, int input2) {
        int sumOfInput = input1 - input2;
        return sumOfInput;
    }

    public int divideTwoNumbers(int input1, int input2) {
        int sumOfInput = input1 / input2;
        return sumOfInput;
    }

    public int multiplyTwoNumbers(int input1, int input2) {
        int sumOfInput = input1 * input2;
        return sumOfInput;

    }
}