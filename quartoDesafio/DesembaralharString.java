package quartoDesafio;

import java.util.Scanner;

public class DesembaralharString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casosTeste = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha após o número de casos de teste

        for (int i = 0; i < casosTeste; i++) {
            String linha = sc.nextLine();
            String linhaDecifrada = decifrarLinha(linha);
            System.out.println(linhaDecifrada);
        }

        sc.close();
    }

    public static String decifrarLinha(String linha) {
        int tamanho = linha.length();
        int metade = tamanho / 2;
        StringBuilder linhaDecifrada = new StringBuilder();

        for (int i = metade - 1; i >= 0; i--) {
            linhaDecifrada.append(linha.charAt(i));
        }

        for (int i = tamanho - 1; i >= metade; i--) {
            linhaDecifrada.append(linha.charAt(i));
        }

        return linhaDecifrada.toString();
    }
}
