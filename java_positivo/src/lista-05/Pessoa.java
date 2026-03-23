import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome, sobrenome;
    private LocalDate dataNascimento;
    private String email;


    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

        private boolean validarEmail(String emailTest) {
            if (emailTest == null || emailTest.isEmpty()) {
                return false;
            }
            int posicaoArroba = emailTest.indexOf("@");
            int posicaoPonto = emailTest.indexOf(".");
        }

    
}