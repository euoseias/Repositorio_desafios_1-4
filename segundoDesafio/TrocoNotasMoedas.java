package segundoDesafio;

import java.util.Scanner;

public class TrocoNotasMoedas {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		 double valor = input.nextDouble();
	        int valorInteiro = (int) valor;
	        int valorCentavos = (int) ((valor - valorInteiro) * 100);
		
	        System.out.println("NOTAS:");
	        System.out.println(valorInteiro / 100 + " nota(s) de R$ 100.00");
	        valorInteiro %= 100;
	        System.out.println(valorInteiro / 50 + " nota(s) de R$ 50.00");
	        valorInteiro %= 50;
	        System.out.println(valorInteiro / 20 + " nota(s) de R$ 20.00");
	        valorInteiro %= 20;
	        System.out.println(valorInteiro / 10 + " nota(s) de R$ 10.00");
	        valorInteiro %= 10;
	        System.out.println(valorInteiro / 5 + " nota(s) de R$ 5.00");
	        valorInteiro %= 5;
	        System.out.println(valorInteiro / 2 + " nota(s) de R$ 2.00");
	        valorInteiro %= 2;
	        
	        System.out.println("MOEDAS:");
	        System.out.println(valorInteiro + " moeda(s) de R$ 1.00");
	        System.out.println(valorCentavos / 50 + " moeda(s) de R$ 0.50");
	        valorCentavos %= 50;
	        System.out.println(valorCentavos / 25 + " moeda(s) de R$ 0.25");
	        valorCentavos %= 25;
	        System.out.println(valorCentavos / 10 + " moeda(s) de R$ 0.10");
	        valorCentavos %= 10;
	        System.out.println(valorCentavos / 5 + " moeda(s) de R$ 0.05");
	        valorCentavos %= 5;
	        System.out.println(valorCentavos + " moeda(s) de R$ 0.01");
	        
	        input.close();
	}

}
