/**
 * Agenda de Contatos
• A classe Contato deve ter os atributos nome e telefone.
• A classe Agenda deve gerenciar uma lista de contatos e 
  ter métodos para
adicionar, remover e buscar contatos por nome.
• Deve implementar validação para evitar contatos duplicados.
 */



public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Telefone: " + telefone;
    }
}
