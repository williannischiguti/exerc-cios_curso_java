package arrays_lists;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		
		int [][] mat = new int [n][n];
		
		for (int i = 0; i < mat.length; i++) { // linha da matriz
			for (int j = 0; j < mat[i].length; j++) { //coluna da matriz
				mat [i][j] = sc.nextInt(); // alimentando a matriz com números inteiros na linha e coluna
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " "); // impriminndo a diagonal principal da matriz
		}
		System.out.println();
		
		int count = 0;
		for (int i = 0; i<mat.length; i++) {
			for  (int j = 0; j<mat[i].length; j++) { 
				if (mat [i][j] < 0)          // contador para somar os números negativos na matriz
					count++;
			}
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();
	}

}
