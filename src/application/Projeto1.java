package application;

import java.util.Scanner;

public class Projeto1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double value = 0;
		System.out.print("Enter account number: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();
		System.out.println("Is there a initial deposit (y/n)");
		String a = sc.next();
		if(a.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			 value = sc.nextDouble();
			 
		}
		Banco c = new Banco(n, nome, value);
		System.out.println("Account data: ");
		System.out.println(c);
		System.out.print("Enter a deposit value: ");
		c.adicionaSaldo(sc.nextDouble());
		System.out.println(c);
		
		System.out.print("Enter a withdraw value: ");
		c.removeSaldo(sc.nextDouble());
		System.out.println(c);
	}

}
