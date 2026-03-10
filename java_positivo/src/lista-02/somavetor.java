
/**
 * Escreva uma função que recebe um vetor de float e retorna a soma de
    todas as posições dele
 */
import java.util.Scanner;

public class somavetor {

    public static float somarVetor(float[] vetor) {
        float soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        float[] vetor = new float[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para posicao " + i + ": ");
            vetor[i] = scanner.nextFloat();
        }
        
        float resultado = somarVetor(vetor);
        System.out.println("A soma dos elementos do vetor e: " + resultado);
        scanner.close();
    }
}
