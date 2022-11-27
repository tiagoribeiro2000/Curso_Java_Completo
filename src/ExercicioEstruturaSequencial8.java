import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

public class ExercicioEstruturaSequencial8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cod1,cod2,qtd1,qtd2;
		double preco1,preco2,total;
		
		cod1=sc.nextInt();
	    qtd1=sc.nextInt();
	    preco1=sc.nextDouble();
	    
	    cod2=sc.nextInt();
	    qtd2=sc.nextInt();
	    preco2=sc.nextDouble();
	   
		total=preco1*qtd1+preco2*qtd2;
		
		System.out.printf("Total =" + "R$%.2f%n",total);

		sc.close();

	}

}
