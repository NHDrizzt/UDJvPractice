package Matrix;

import java.util.Scanner;

public class Matrixes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), count=0;
		int[][] mat = new int[a][a];
		int[] ar=new int[a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				mat[i][j] = sc.nextInt();
				if(i==j) {
					ar[i]=mat[i][j];
					
				}
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Main diagonal: ");
		for(int x: ar) {
			System.out.print(x+ " ");
		}
		System.out.println("\nNegative Numbers: "+ count);
	}

}
