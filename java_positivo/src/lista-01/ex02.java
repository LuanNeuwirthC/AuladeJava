/**
 * 2 – Crie um sistema que receba os seguintes valores:
 * A porcentagem do IPI a ser acrescido no valor dos produtos
 * 
 *    código do produto 1
 *    O valor unitário do produto 1
 *    A quantidade do produto 1
 * 
 *    O código do produto 2
 *    O valor unitário do produto 2
 *    A quantidade do produto 2
 * 
 * Com todos os parâmetros informados o sistema deve calcular o valor
 * total a ser pago e apresentar o resultado detalhado.
 * Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a porcentagem do IPI (ex: 10): ");
        double ipi = entrada.nextDouble();

// PRODUTO 1
        System.out.println("Digite o código do produto 1: ");
        int cod1 = entrada.nextInt(); 

        System.out.println("Digite o valor unitário do produto 1: ");
        double valor1 = entrada.nextDouble(); 

        System.out.println("Digite a quantidade do produto 1: ");
        int qtd01 = entrada.nextInt();

// PRODUTO 2 
        System.out.println("Digite o código do produto 2: ");
        int cod2 = entrada.nextInt();

        System.out.println("Digite o valor unitário do produto 2: ");
        double valor2 = entrada.nextDouble(); 

        System.out.println("Digite a quantidade do produto 2: ");
        int qtd02 = entrada.nextInt();

        double valorTotal = (valor1*qtd01 + valor2*qtd02)*(ipi/100 + 1);
        System.out.println("\n--- DETALHAMENTO DA NOTA ---");
        System.out.println("Produto: " + cod1 + " | Subtotal: R$ " + (valor1 * qtd01));
        System.out.println("Produto: " + cod2 + " | Subtotal: R$ " + (valor2 * qtd02));
        System.out.println("Imposto IPI aplicado: " + ipi + "%");
        System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f\n", valorTotal);
    }
}