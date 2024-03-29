package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner  sc = new Scanner(System.in);
		//double xA, xB, xC, yA, yB, yC;
		
		Triangle x,y; 
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		

		System.out.println("Enter the measures of triangle Y: ");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		/*
		 * Resolução sem programação orientada a objetos
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		*/
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangule X  area: %.4f%n", areaX);
		System.out.printf("Triangule Y  area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Larger area: X");
	
		}else {
			System.out.printf("Larger area: Y");
		}
		
		sc.close();
	}

}
