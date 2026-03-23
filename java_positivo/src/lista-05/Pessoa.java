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

    private int idade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    private boolean validaEmail() {
        if (this.email == null || this.email.isEmpty()) {
            return false;
        }
        int posicaoArroba = this.email.indexOf("@");
        int posicaoPonto = this.email.lastIndexOf(".");

        return posicaoArroba > 0 && posicaoPonto > posicaoArroba;
    }

    public void adicionarEmail(String email) {
        String emailTemporario = this.email;
        this.email = email;

        if (!validaEmail()) {
            this.email = emailTemporario;
            System.out.println("E-mail inválido. Não foi adicionado.");
        }
    }

    public String getInformacoes() {
        return "Nome: " + nome + " " + sobrenome +
               " | Idade: " + idade() +
               " | email: " + email;
    }

    public boolean maior() {
        return idade() >= 18;
    }
}