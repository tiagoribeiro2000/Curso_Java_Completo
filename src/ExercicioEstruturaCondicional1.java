import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/
public class ExercicioEstruturaCondicional1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Numero;
		System.out.println("O número é negativo ?");
		Numero = sc.nextInt();
		if(Numero<0) {
		System.out.println("Negativo");
		}else {
			System.out.println("Não é negativo");
		}
		
		sc.close();
		

	}

}
