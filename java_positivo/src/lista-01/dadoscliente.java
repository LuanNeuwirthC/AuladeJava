/**
 * Escreva uma função que receba os dados de um cliente e retorne eles
formatados, mostrado um dado por linha.
Exemplo
Nome: João
Sobrenome: Silva
DDD: 41
Telefone: 12346543
 */
import java.util.Scanner;

public class dadoscliente {
    
    public static String formatarDadosCliente(String nome, String sobrenome, int ddd, int telefone) {
        return "Nome: " + nome + "\n" +
               "Sobrenome: " + sobrenome + "\n" +
               "DDD: " + ddd + "\n" +
               "Telefone: " + telefone;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.print("Digite o DDD: ");
        int ddd = scanner.nextInt();
        
        System.out.print("Digite o telefone: ");
        int telefone = scanner.nextInt();
        
        System.out.println("\nDados do Cliente:");
        System.out.println(formatarDadosCliente(nome, sobrenome, ddd, telefone));
        
        scanner.close();
    }
}
