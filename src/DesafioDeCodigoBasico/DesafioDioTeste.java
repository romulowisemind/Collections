package DesafioDeCodigoBasico;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDioTeste {
    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        Scanner entrada = new Scanner(System.in);
//        int codigo1 = entrada.nextInt();
//        int quantidade1 = entrada.nextInt();
//        double valor1 = entrada.nextDouble();
//
//        int codigo2 = entrada.nextInt();
//        int quantidade2 = entrada.nextInt();
//        double valor2 = entrada.nextDouble();
//
//        double total = quantidade1 * valor1 + quantidade2 * valor2;
//
//        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));


        // Abaixo segue um exemplo de código que você pode ou não utilizar:

        Scanner leitor = new Scanner(System.in);

        int T = leitor.nextInt();
        int[] N = new int[1000];
        int i;
        int j = 0;

        for (i = 0; i < N.length; i++) {
                if (j < T) {
                    N[i] =j;
                    j++;
                } else {
                    j = 1;
                    N[i] = 0;
                }
            System.out.println("N[" + i + "] = " + N[i]);

        }
    }
}
