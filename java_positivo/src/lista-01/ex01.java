/**
 *  01- Crie um vetor de tamanho 10 com números pares e impares, com
    o vetor previamente criado o usuário deverá escolher se serão mostrados
    apenas os números pares ou apenas os números impares, os números
    devem ser exibidos conforme a escolha do usuário
 */

import java.util.Scanner;


public class ex01 {
    public static void main(String[] args) {
        String escolha;
        Scanner entrada = new Scanner(System.in);


        int[] numeros = {23,21,45,78,10,4,9,43,20,1};
        System.out.printf("\nDigite 'par' para ver os números pares, ou 'impar' para ver os impares: ");
        escolha = entrada.next();

          if (escolha.equalsIgnoreCase("par")) {
                System.out.println("\n Os números pares são: ");
            } else {
                System.out.println("\nOs números impares são: ");
            }

        for (int i = 0; i < numeros.length; i++) {

            if (escolha.equalsIgnoreCase("par") && numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " ");
            }
           else if (escolha.equalsIgnoreCase("impar") && numeros[i] % 2 != 0) {
            System.out.println(numeros[i] + " ");
           }
        }
        entrada.close();
    }
}
 