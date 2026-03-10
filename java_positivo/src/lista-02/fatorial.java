/**
 * Escreva uma função que recebe um inteiro e retorna o fatorial dele
 */

import java.util.Scanner;

public class fatorial {
    
    public static int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        
        int fatorial = calcularFatorial(numero);
        System.out.println("O número fatorial é: " + numero + "! = " + fatorial);
        scanner.close();
    }
}
