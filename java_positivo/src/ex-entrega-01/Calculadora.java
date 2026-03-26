
/**
 * Implemente uma classe chamada Calculadora que contenha métodos para realizar operações matemáticas  
 * (adição, subtração, multiplicação, divisão, potenciação e fatorial).
 * Regras de Negócio:
 * Não serão aceitos números negativos ou maiores que 50.
 * Os métodos não devem receber parâmetro.
 */




public class Calculadora {
    
    private int num1;
    private int num2;



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

    public double potenciacao(){
        double resultado = 1;

    for (int i = 0; i < num2; i++) {
        resultado *= num1;
        } 
        return resultado;
    }

    public double fatorial() {
        double fat = 1;
        for (int i = 1; i <= num1; i++) {
            fat *= i;
        }
        return fat;
    }
}



















