/*
 * Com base na tabela abaixo, escreva um programa que leia o código de um item 
 * e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.*/


import java.util.Scanner;

public class ExercicioIfElse5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codProd = sc.nextInt();
		int qtdProd = sc.nextInt();
		
		double Total = 0;
		if(codProd==1) {
			System.out.println("Cachorro quente");
			System.out.println("Codigo 1");
			Total = qtdProd * 4.0;
		}else {
			if(codProd==2) {
				System.out.println("X-Salada");
				System.out.println("Codigo 2");
				Total = qtdProd * 4.50;
			}else {
				if(codProd==3) {
					System.out.println("X-Bacon");
					System.out.println("Codigo 3");
					Total = qtdProd * 5.00;
				}else {
					if(codProd==4) {
						System.out.println("Torrada Simples");
						System.out.println("Codigo 4");
						Total = qtdProd * 2.00;
					}else {
						if(codProd==5) {
							System.out.println("Refrigerante");
							System.out.println("Codigo 5");
							Total = qtdProd * 1.50;
						}
					}
				}
			}
		}
		
		System.out.printf("Total: R$ %.2f%n", Total);
		
		
		
		
		sc.close();

	}

}
