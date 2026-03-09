/**
 * 3 – Crie uma calculadora com as seguintes operações:
 
        1 - Soma
        2 - Divisão
        3 - Subtração
        4 - Multiplicação
        5 - Potenciação

    Para utilizar a calculadora deverá ser criado um menu quando o
    usuário digitar o número correspondente a operação (Conforme exemplo
    acima) ao digitar a operação deverão ser solicitados 2 números, em seguida
    o resultado da operação escolhida deverá ser exibido e o menu exibido
    novamente, até que o usuário digite 0 para encerrar.
 */


import java.util.Scanner;

  public class ex03 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int opcao;

          do {
              System.out.println("\n=== CALCULADORA ===");
              System.out.println("[ 1 ] - Soma");
              System.out.println("[ 2 ]- Divisão");
              System.out.println("[ 3 ]- Subtração");
              System.out.println("[ 4 ]- Multiplicação");
              System.out.println("[ 5 ]- Potenciação");
              System.out.println("[ 0 ]- Sair");
              System.out.print("\nEscolha uma operação: ");

              opcao = scanner.nextInt();

              if (opcao == 0) {
                  System.out.println("Encerrando a calculadora...");
                  break;
              }

              if (opcao < 1 || opcao > 5) {
                  System.out.println("Opção inválida!");
                  continue;
              }

              System.out.print("Digite o primeiro número: ");
              double num1 = scanner.nextDouble();

              System.out.print("Digite o segundo número: ");
              double num2 = scanner.nextDouble();

              double resultado = 0;

              switch (opcao) {
                  case 1:
                    resultado = num1 + num2;
                      System.out.printf("Resultado: %.2f + %.2f = %.2f%n", num1, num2, resultado);
                      break;
                  case 2:
                      if (num2 == 0) {
                          System.out.println("Erro: Divisão por zero não é permitida!");
                      } else {
                          resultado = num1 / num2;
                          System.out.printf("Resultado: %.2f / %.2f = %.2f%n", num1, num2, resultado);
                      }
                      break;

                  case 3:
                    resultado = num1 - num2;
                      System.out.printf("Resultado: %.2f - %.2f = %.2f%n", num1, num2, resultado);
                      break;

                  case 4:
                    resultado = num1 * num2;
                      System.out.printf("Resultado: %.2f * %.2f = %.2f%n", num1, num2, resultado);
                      break;

                  case 5:
                    resultado = 1;
                        for (int i = 0; i < (int) num2; i++) {
                            resultado *= num1;
                        }
                        System.out.printf("Resultado: %.2f ^ %.2f = %.2f%n", num1, num2, resultado);
                      break;
              }
          } while (opcao != 0);
          scanner.close();
      }
  }
