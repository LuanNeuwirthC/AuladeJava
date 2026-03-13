//? 2 - Criar uma classe "Livro" com os atributos título, autor e ano de publicação. 
// ? Adicione um
//? método "informacoes" que imprime as informações do livro

import java.util.Scanner;

public class ex02Livro{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Livro livro = new Livro();
        livro.titulo = "A Metamorfose";
        livro.autor = "Franz Kafka";
        livro.anoPublicacao = 1915;


        livro.informacoes();
    }
}