import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a data de nascimento (ex: 25/12/1990): ");
        String dataDigitada = scanner.nextLine();
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd][dd-MM-yyyy][dd.MM.yyyy]");
        LocalDate dataNascimento = LocalDate.parse(dataDigitada, formatador);

        Pessoa cliente = new Pessoa(nome, sobrenome, dataNascimento);

        System.out.print("Digite o e-mail: ");
        cliente.adicionarEmail(scanner.nextLine());

        System.out.println("\n" + cliente.getInformacoes());
        System.out.println("É maior de idade? " + cliente.maior());

        scanner.close();
    }
}