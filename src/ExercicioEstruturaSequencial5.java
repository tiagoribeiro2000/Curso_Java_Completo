import java.util.Scanner;

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


public class ExercicioEstruturaSequencial5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,DIF;
		
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		D=sc.nextInt();
		
		DIF=A * B - C * D;
		
		System.out.println("Diferenca =" + DIF);
		sc.close();

	}

}
