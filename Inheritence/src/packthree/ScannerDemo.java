package packthree;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		System.out.println("What's your name");
		String name= scanner.nextLine();
		System.out.println("Hello,"+name+"!!");

		System.out.println("Enter a number A");
		int a=scanner.nextInt();
		System.out.println("");

		System.out.println("Enter a number B");
		int b=scanner.nextInt();

		int sum=a+b;
		System.out.println("Sum of two numbers is:"+sum);
		scanner.close();

	}

}