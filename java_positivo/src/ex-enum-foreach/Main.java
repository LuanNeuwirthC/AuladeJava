import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\n===Dias da semana===");
        System.out.println("Digite um dia da semana para descobrir se ele é util ou não: ");
        
        String entrada = s.nextLine().toUpperCase();


       for (DiasDaSemana d : DiasDaSemana.values()) {
            if (d.name().equals(entrada)) {
                if (d.isUtil()) {
                    System.out.println(d + " é um dia útil.");
                } else {
                    System.out.println(d + " é fim de semana/não é um dia util.");
                }
            }
        }

        System.out.println("\n=== Lista de Dias Úteis ===");
        for (DiasDaSemana d : DiasDaSemana.values()) {
            if (d.isUtil()) {
                System.out.println(d);
            }
        }
        System.out.println("\n=== Lista de Fins de Semana ===");
        for (DiasDaSemana d : DiasDaSemana.values()) {
            if (!d.isUtil()) {
                System.out.println(d);
            }
        }
        System.out.println("\n=== SISTEMA SOLAR ===");
        System.out.println("Digite o nome de um planeta: ");
        String entrada1 = s.nextLine().toUpperCase();

        Planetas escolhido = null;

        for (Planetas p : Planetas.values()) {
            if (p.name().equals(entrada1)) {
                escolhido = p;
                
            }
        }

        if (escolhido != null) {
            System.out.println("\nPlaneta: " + escolhido.name());
            System.out.println("Raio: " + escolhido.raio + " km");
            System.out.println("Massa: " + escolhido.massa + " x 10^23 kg");

            // 2. Mostrar planetas com MAIOR massa
            System.out.println("\n--- Planetas com massa MAIOR que " + escolhido.name() + " ---");
            for (Planetas p : Planetas.values()) {
                if (p.massa > escolhido.massa) {
                    System.out.println("- " + p.name() + " (Massa: " + p.massa + ")");
                }
            }

            // 3. Mostrar planetas com MENOR massa
            System.out.println("\n--- Planetas com massa MENOR que " + escolhido.name() + " ---");
            for (Planetas p : Planetas.values()) {
                if (p.massa < escolhido.massa) {
                    System.out.println("- " + p.name() + " (Massa: " + p.massa + ")");
                }
            }

        } else {
            System.out.println("Planeta não encontrado. Digite nomes como TERRA, JUPITER, etc.");
        }

    }
}
