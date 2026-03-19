import java.util.Scanner;

public class App {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sua Conta ===");

        // Criando o objeto
        Conta conta1 = new Conta(
            1312,
            "Luan",
            10.0,
            0,
            0); 
        
        System.out.println("Numero da Conta: " + conta1.getnumeroConta());
        System.out.println("Nome do Titular: " + conta1.getnomeTitular());
        System.out.println("Saldo: " + conta1.getsaldo());

        for (int i = 0; i < 1; i++) { 
            System.out.println("\n==== Deposito ====");
            System.out.print("Escolha um valor para depositar: ");
            double valor = scanner.nextDouble(); 
          
            conta1.depositar(valor);
            System.out.println("Saldo atualizado: " + conta1.getsaldo());

            System.out.println("\n==== Saque ===="); 
            System.out.print("Escolha um valor para sacar: "); 
            double valorSaque = scanner.nextDouble();  
            conta1.sacar(valorSaque); 
            System.out.println("Saldo atualizado: " + conta1.getsaldo()); 
        }
        
        scanner.close();
    }
}