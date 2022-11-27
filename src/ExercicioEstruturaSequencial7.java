import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/

public class ExercicioEstruturaSequencial7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);

		int numfuc, hrtrabalho;
		double salHora, salario;

		numfuc = sc.nextInt();
		hrtrabalho = sc.nextInt();
		salHora = sc.nextDouble();
		salario = hrtrabalho * salHora;

		System.out.println("Número do funcionário = " + numfuc);
		System.out.printf("O salário do funcionário é = " + "U$%.2f%n", +salario);

		sc.close();

	}

}
