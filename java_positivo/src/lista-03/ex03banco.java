//**
// Criar uma classe "ContaBancaria" com os atributos titular, número da conta e saldo.
// Adicione métodos para depositar, sacar e imprimir o saldo da conta
//** 


public class ex03banco {
    public static void main(String[] args) {

    ContaBancaria conta01 = new ContaBancaria ("001", "Amanda", 5000.0);
    ContaBancaria conta02 = new ContaBancaria ("002", "Luan", 6000.0);

    conta01.infoBanco();
        System.out.println("-".repeat(20));
    conta02.infoBanco();
        System.out.println("-".repeat(20));

    conta01.depositar(4000.0);
        System.out.println("-".repeat(20));

    conta01.infoBanco();
        System.out.println("-".repeat(20));

    conta02.sacar(900.0);

    System.out.println("SEU SALDO ATUAL É DE: ");
        conta02.imprimirValor();
    }
}
