/*
 * Nesta aula aprendi sobre 
 * Scanner utilizando
 * next()
 * nextInt()
 * nextDouble()
 * next().charAt(0)
 * Locale
 * Como ler até a quebra de linha: nextLine()
 * Como limpar o buffer de leitura
 * */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaSequencial4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,R,pi=3.14159;
		R=sc.nextDouble();
		
		A=pi*R*R;
		System.out.printf("A área é %.4f%n",A);
		
		
		
		
		
		
		sc.close();

	}

}
