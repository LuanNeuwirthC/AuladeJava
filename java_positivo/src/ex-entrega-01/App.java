import java.util.Scanner;

public class App {
    
    // Atributos da classe: armazenam os valores para que os métodos não precisem de parâmetros
    private int num1;
    private int num2;

    // Método para ler os valores e aplicar a regra de validação (0 a 50)
    public void lerValores() {
        Scanner scanner = new Scanner(System.in);
        this.num1 = pedirNumeroValido(scanner, "primeiro");
        this.num2 = pedirNumeroValido(scanner, "segundo");
    }

    // Método auxiliar para garantir que o número não seja negativo nem maior que 50
    private int pedirNumeroValido(Scanner scanner, String ordem) {
        int numero;
        while (true) {
            System.out.print("Digite o " + ordem + " número (0 a 50): ");
            numero = scanner.nextInt();
            
            if (numero >= 0 && numero <= 50) {
                break; // Número válido, sai do loop
            } else {
                System.out.println("Erro: Número inválido! Deve ser entre 0 e 50.");
            }
        }
        return numero;
    }

    // --- Operações Matemáticas (Sem parâmetros!) ---

    public int somar() {
        return num1 + num2;
    }

    public int subtrair() {
        return num1 - num2;
    }

    public int multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0; 
        }
        return (double) num1 / num2;
    }

    public double potenciar() {
        return Math.pow(num1, num2);
    }

    // O fatorial é calculado sobre um único número. 
    // Como exemplo, vamos calcular o fatorial do num1.
    public double fatorial() {
        double fat = 1; // Usando double porque fatorial de números grandes (ex: 50) cresce muito rápido
        for (int i = 1; i <= num1; i++) {
            fat *= i;
        }
        return fat;
    }

    // --- Método Principal ---
    public static void main(String[] args) {
        App calc = new App();

        calc.lerValores();

        System.out.println("\n--- Resultados ---");
        System.out.println("Soma: " + calc.somar());
        System.out.println("Subtração: " + calc.subtrair());
        System.out.println("Multiplicação: " + calc.multiplicar());
        System.out.println("Divisão: " + calc.dividir());
        System.out.println("Potenciação (" + calc.num1 + "^" + calc.num2 + "): " + calc.potenciar());
        System.out.println("Fatorial do 1º número (" + calc.num1 + "!): " + calc.fatorial());
    }
}