//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class ExercicioIfElse2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Numero;
		Numero = sc.nextInt();
		if(Numero % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		
		
		
		
		
		sc.close();

	}

}
