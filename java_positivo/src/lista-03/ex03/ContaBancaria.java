package ex03;
public class ContaBancaria {
   
    String titular, nConta;
    double saldo;

    public void infoBanco(){
        System.out.println("Numero da Conta: " + nConta + "\nNome: " + titular + "\nSaldo atual: " + saldo);
        
    }

    public ContaBancaria(String nConta,String titular, Double saldo){
        this.nConta = nConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(Double valor){
        this.saldo = saldo + valor;
    }

    public void sacar(Double valor){
        if (valor > saldo) {
            System.out.println("erro...");
        } else {
            this.saldo = saldo - valor;
        }
    }
    
    public void imprimirValor(){
                System.out.println(saldo);

    }

}
