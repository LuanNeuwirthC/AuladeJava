/** Crie uma classe ContaBancaria que tenha os seguintes atributos privados: 
 *  número da conta
    (int), nome do titular (String), saldo (double).
    • getNumeroConta() e setNumeroConta(int numeroConta)

    A classe deve ter os seguintes métodos públicos:

    • getNomeTitular() e setNomeTitular(String nomeTitular)
    • getSaldo() e setSaldo(double saldo)

    valor seja maior que zero.
    • depositar(double valor): recebe um valor e adiciona ao saldo da conta, desde que o
    •sacar(double valor): recebe um valor e subtrai do saldo da conta, desde que o valor
    seja menor ou igual ao saldo disponível */


    public class Conta { 

        private int numeroConta; 
        private String nomeTitular; 
        private double saldo; 
        private double valorDeposito; 
        private double valorSaque; 
        
    
        public Conta(int numeroConta, String nomeTitular,double saldo, double valorDeposito, double valorSaque){
            this.numeroConta = numeroConta; 
            this.nomeTitular = nomeTitular; 
            this.saldo = saldo; 
            this.valorDeposito = valorDeposito; 
            this.valorSaque = valorSaque;
        }
            
        public int getnumeroConta(){ 
            return numeroConta; 
         }
        public String getnomeTitular(){ 
            return nomeTitular; 
         }
        public double getsaldo(){ 
            return saldo; 
        } 
        public double getvalorDeposito(){
             return valorDeposito; 
        }
        public double getvalorSaque(){
             return valorSaque; 
        }
       
        public void setnumeroConta(int numeroConta, String nomeTitular, double saldo, double valorDeposito, double valorSaque){ 
            this.numeroConta = numeroConta; 
            this.nomeTitular = nomeTitular; 
            this.saldo = saldo; 
            this.valorDeposito = valorDeposito; 
            this.valorSaque = valorSaque; 
        }
        public int setnumeroConta(){ 
             return numeroConta;
        }
        public String setnomeTitular(){ 
             return nomeTitular; 
        }
        public double setsaldo(){ 
             return saldo;
        }
        public double setvalorDeposito(){
             return valorDeposito; 
        }
        public double setvalorSaque(){
             return valorSaque; 
        }
    
        public void sacar(double valor){ 
            if (valor > 0 && valor <= saldo){ 
                 saldo -= valor; 
             System.out.println("Saque realizado com sucesso"); 
            }else{ 
              System.out.println("Valor de saque invalido ou saldo insuficiente"); 
    
              }
            }
        
    
        public void depositar(double valor){ 
             if (valor > 0){ 
                saldo += valor;
                 System.out.println("Deposito realizado com sucesso"); 
             }else{ 
                System.out.println("Valor de deposito invalido"); 
          }
             System.out.println("Saldo atual: "+ saldo); 
    
             }
        }
