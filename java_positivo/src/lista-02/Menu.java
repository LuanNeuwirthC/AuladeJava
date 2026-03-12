import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int op;
        boolean menu = true;

        int[] vetorInt = {1, 5, 9, 25, 10};
        float[] vetorFloat = {1.5f, 2.5f, 3.5f, 2.0f};

        while (menu) {
            System.out.println("\n--- Escolha um exercicio ---");
            System.out.println("1 - Retorne o PI");
            System.out.println("2 - Fatorial");
            System.out.println("3 - Maior numero do vetor int");
            System.out.println("4 - Soma do vetor float");
            System.out.println("5 - Formatar cliente");
            System.out.println("0 - ENCERRAR");

            op = entrada.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Valor: " + pi());
                    break;
                    
                case 2:
                    System.out.println("Digite um numero entre 1 e 10 para fazer o fatorial:");
                    int fat = entrada.nextInt(); 
                    System.out.println( 
                        (fat > 0 && fat <= 10) ? 
                        "O fatorial é: " + fatorial(fat) : 
                        "Escolha um numero valido entre 1 e 10!"
                    );
                    break;
                    
                case 3:
                    // Chamando a função e passando o vetor como argumento
                    System.out.println("O maior numero do vetor é: " + maiorNumero(vetorInt));
                    break;

                case 4:
                    // EXERCÍCIO 4: Chamando a função de soma
                    System.out.println("A soma do vetor float é: " + somaVetor(vetorFloat));
                    break;

                case 5:
                    // EXERCÍCIO 5: Recebendo dados e formatando
                    entrada.nextLine();
                    
                    System.out.print("Digite o Nome: ");
                    String nome = entrada.nextLine();
                    
                    System.out.print("Digite o Sobrenome: ");
                    String sobrenome = entrada.nextLine();
                    
                    System.out.print("Digite o DDD: ");
                    int ddd = entrada.nextInt();
                    
                    System.out.print("Digite o Telefone: ");
                    int telefone = entrada.nextInt();
                    
                    System.out.println("\n--- Dados Formatados ---");
                    System.out.println(cliente(nome, sobrenome, ddd, telefone));
                    break;

                case 0:
                    menu = false;
                    System.out.println("Encerrando...");
                    break; 
                       
                default:
                    System.out.println("Escolha uma opcao valida");
                    break;
            }
        }
        entrada.close();
    }
    
    // --- FUNÇÕES DOS EXERCÍCIOS ---
    
    // Exercicio 1
    public static float pi(){
        return 3.14f;
    }
    
    // Exercicio 2
    public static int fatorial(int i){
        if (i <= 1) return 1;
        int res = i;
        for (int j = i - 1; j > 1; j--) {
            res *= j;
        }
        return res;
    }
    
    // Exercicio 3
    public static int maiorNumero(int[] vet){
        int res = vet[0]; 
        for (int i : vet) {
            if (i > res) {
                res = i;
            }
        }
        return res;
    }
    
    // Exercicio 4
    public static float somaVetor(float[] vet) {
        float res = 0.0f;
        for (float f : vet) {
            res += f;
        }
        return res;
    }
    
    // Exercicio 5
    public static String cliente(String nome, String sobrenome, int ddd, int telefone) {
        return
         "Nome: " + nome + 
         "\nSobrenome: " + sobrenome + 
         "\nDDD: " + ddd + 
         "\nTelefone: " + telefone;
    }
}