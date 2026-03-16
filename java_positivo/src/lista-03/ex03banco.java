//**  Criar uma classe "ContaBancaria" com os atributos titular, número da conta e saldo.
//**  Adicione métodos para depositar, sacar e imprimir o saldo da conta

import java.util.Scanner;

public class ex03banco {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num;
    boolean menu = true;
    String numeroConta;
    ContaBancaria contaSelecionada = null;



    ContaBancaria conta01 = new ContaBancaria ("01", "Maria", 5000.0);
    ContaBancaria conta02 = new ContaBancaria ("02", "José", 2000.0);
   

        while (menu) {
            System.out.println("\n---Escolha uma Opção---");
            System.out.println("[1] Digite 1 para ver as contas disponiveis");
            System.out.println("[2] Digite 2 e escolha o numero da conta que deseja fazer operações");
            System.out.println("[0] ENCERRAR PROGRAMA...");

            num = entrada.nextInt();

            switch (num) {
                case 1:
                    conta01.infoBanco();
                    System.out.println("-".repeat(20));
                    conta02.infoBanco();
                break;

                case 2:
                    System.out.println("Digite o numero da conta [01] ou [02]");
                    numeroConta = entrada.next();
                if (numeroConta.equals("01")) {
                    contaSelecionada = conta01;
                    System.out.println("\nConta 01 selecionada......");
                    conta01.infoBanco();
                    System.out.println("-".repeat(20));

                } else if (numeroConta.equals("02")) {
                    contaSelecionada = conta02;
                } else {
                    System.out.println("Conta não encontrada!!!");
                break;
                }


                System.out.println("\n--- OPERAÇÕES: " + contaSelecionada.titular + " ---");
                    System.out.println("[1] Depositar");
                    System.out.println("[2] Sacar");
                    System.out.println("[3] Ver Saldo da conta");
                    int operacao = entrada.nextInt();
                

                    if (operacao == 1) {
                        System.out.println("Valor do deposito: ");
                        double valor = entrada.nextDouble();
                        contaSelecionada.depositar(valor);
                        System.out.println("Depósito de: R$" + valor + " foi realizado");
                    } else if(operacao == 2) {
                        System.out.println("Valor do saque: ");
                        double valor = entrada.nextDouble();
                        contaSelecionada.sacar(valor);
                        System.out.println("O valor de: R$" + valor + " foi sacado");
                    } else if (operacao == 3) {
                        System.out.println("O saldo atual é de: ");
                        contaSelecionada.imprimirValor();
                    } break;
                    
               case 0:
                    System.out.println("Encerrando...");
                    menu = false; 
    
             }
        }
    }        
}
