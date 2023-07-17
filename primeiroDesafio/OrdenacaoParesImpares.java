package primeiroDesafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdenacaoParesImpares {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 // Leitura do número de linhas de entrada
		System.out.println("Informe o numero de linha de entrada");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        
      // Leitura dos valores e separação entre pares e ímpares
        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o valor
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }
        
     // Ordenação dos pares em ordem crescente
        Collections.sort(pares);

        // Ordenação dos ímpares em ordem decrescente
        Collections.sort(impares, Comparator.reverseOrder());

        // Impressão dos pares
        System.out.println("Impressão dos pares");
        for (int valor : pares) {
            System.out.println(valor);
        }

        // Impressão dos ímpares
        System.out.println("Impressão dos ímpares");
        for (int valor : impares) {
            System.out.println(valor);
        }

	}

}
