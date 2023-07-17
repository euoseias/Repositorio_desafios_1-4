package terceiroDesafio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPares {

	 public static int contarPares(int k, int[] arr) {
	        Map<Integer, Integer> mapa = new HashMap<>();
	        int contadorPares = 0;

	        for (int num : arr) {
	            // Verifica se existe um par para o número atual
	            if (mapa.containsKey(num - k)) {
	                contadorPares += mapa.get(num - k); // Incrementa o contador com a quantidade de pares existentes
	            }

	            // Verifica se existe um par para o número atual
	            if (mapa.containsKey(num + k)) {
	                contadorPares += mapa.get(num + k); // Incrementa o contador com a quantidade de pares existentes
	            }

	            // Incrementa a contagem do número atual no mapa
	            mapa.put(num, mapa.getOrDefault(num, 0) + 1);
	        }

	        return contadorPares;
	    }

	    public static void main(String[] args) {
	        int k = 1;
	        int[] arr = {1, 2, 3, 4};
	        int resultado = contarPares(k, arr);
	        System.out.println("Número de pares: " + resultado);
	    }
	}
	


