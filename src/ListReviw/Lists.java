package ListReviw;

import java.util.Scanner;

public class Lists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int rented = sc.nextInt();

		Aluno[] arr = new Aluno[10];
		for(int i=0; i<rented;i++) {
			System.out.println();
			System.out.println("Rent #"+i+":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			arr[room] = new Aluno(name,email, room);
			
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i=0; i<10; i++) {
			if(arr[i] != null) {
				System.out.println(i + ": " +arr[i]);
			}
		}

	}

}
