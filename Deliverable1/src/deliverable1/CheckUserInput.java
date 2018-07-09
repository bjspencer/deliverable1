
package deliverable1;

import java.util.Scanner;

public class CheckUserInput {

	public static void main(String[] args) {

		// scanner to ask user for input

		Scanner scnr = new Scanner(System.in);

		// Storing number in string number1 and number2

		String number1, number2;

		// used to calculate digit total

		int digitTotal = -1;

		// valid number to check if user enter valid number

		boolean validNumber = false;

		// while number is not valid

		while (!validNumber) {

			// prompt user

			System.out.print("Enter first number: ");

			number1 = scnr.nextLine();

			System.out.print("Enter second number: ");

			number2 = scnr.nextLine();

			// check number length

			if (number1.length() == number2.length()) {

				// parse number to integer

				try {

					int num1 = Integer.parseInt(number1);

					int num2 = Integer.parseInt(number2);

					// check if numbers are positive

					if (num1 < 0 || num2 < 0) {

						System.out.println("Please enter positive number");

					} else {

						// passed all validation

						boolean validNumbers = true;

						// loop through digit by digit from left to right and add the number

						for (int i = 0; i < number1.length(); i++) {

							int digit1 = Integer.parseInt(number1.charAt(i) + "");

							int digit2 = Integer.parseInt(number2.charAt(i) + "");

							System.out.println("Sum of digit at " + (i + 1) + " position : " + (digit1 + digit2));

							// if digit total is not equal to calculated one, set indicator to false

							if (digitTotal < 0) {

								digitTotal = digit1 + digit2;

							} else if (digitTotal != digit1 + digit2) {

								validNumbers = false;

							}

						}

						if (validNumbers) {

							System.out.println("Sum of digit at position are same, return result is : " + validNumbers);

						} else {

							System.out.println(
									"Sum of digit at position are not same, return result is : " + validNumbers);

						}

						validNumber = true;

					}

				} catch (Exception e) {

					// if enter number is not digit it will throw exception

					System.out.println("Please enter number only");

				}

			} else {

				System.out.println("Please enter valid number");

			}

		}

		scnr.close();

	}

}
