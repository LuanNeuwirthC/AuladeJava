import java.util.Scanner;

/**
 * 1 - Criar uma classe "Pessoa" com os atributos nome e idade. 
 *      Adicione um método "apresentar" que imprime o nome e idade da pessoa
 */

public class ex01Pessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

      
        
        System.out.println("Digite seu nome: ");  
        pessoa.nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        pessoa.idade = entrada.nextInt();

        
        pessoa.apresentar();
        entrada.close();
    }
}


    
