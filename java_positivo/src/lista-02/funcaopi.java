import java.util.Scanner;

public class funcaopi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        System.out.println("Digite '1' para retornar o numero de pi");
        opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println(pi());
                break;
        
            default:
                break;
        }
    }
    
    public static float pi() {
        return 3.14f;
    }
}

