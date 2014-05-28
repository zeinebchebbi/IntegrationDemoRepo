package edu.esprit.integration.demo.manged.beans;

import java.util.Scanner;

public class CalculatorManagedBean {

	class AddNumbers {
		public void main(String args[]) {
			int x, y, z;
			System.out.println("Enter two integers to calculate their sum ");
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
			y = in.nextInt();
			z = x + y;
			System.out.println("Sum of entered integers = " + z);
		}
	}

	class SouNumbers {
		public void main(String args[]) {
			int x, y, z;
			System.out.println("Enter two integers to calculate their sum ");
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
			y = in.nextInt();
			z = x - y;
			System.out.println("soustraction of entered integers = " + z);
		}
	}

	class MultiplyDivide {

		public void main(String args[]) {

			int i = 10;
			int j = 2;

			System.out.println("i is " + i);
			System.out.println("j is " + j);

			int k = i / j;
			System.out.println("i/j is " + k);
			k = i * j;
			System.out.println("i * j is " + k);

		}

	}

}
