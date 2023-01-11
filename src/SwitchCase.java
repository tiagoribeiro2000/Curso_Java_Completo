import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia = null ;
		/*
		if(x==1) {
			Dia = "Domingo";
		}else if (x == 2) {
			Dia = "Segunda";
		}else if(x == 3) {
			Dia = "Terça";
		}else if(x== 4) {
			Dia = "Quarta";
		}else if(x==5) {
			Dia = "Quinta";
		}else if(x==6) {
			Dia = "Sexta";
		}else if(x==7) {
			Dia = "Sábado";
		}else {
			Dia = "Valor invalido";
		}
		*/
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		
		}
		
		System.out.println("Dia da semana: " + dia );
		
	
		sc.close();

	}

}
