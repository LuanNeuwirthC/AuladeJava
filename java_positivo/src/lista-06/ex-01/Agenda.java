// Arquivo: Agenda.java
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    // Método para adicionar com validação de duplicidade
    public boolean adicionar(Contato novoContato) {
        for (Contato c : contatos) {
            // Valida ignorando letras maiúsculas/minúsculas
            if (c.getNome().equalsIgnoreCase(novoContato.getNome())) {
                System.out.println("Erro: O contato '" + novoContato.getNome() + "' já existe na agenda!");
                return false; 
            }
        }
        contatos.add(novoContato);
        System.out.println("Contato '" + novoContato.getNome() + "' adicionado com sucesso.");
        return true;
    }

    // Método para buscar por nome
    public Contato buscar(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        System.out.println("Contato '" + nome + "' não encontrado.");
        return null;
    }

    // Método para remover por nome
    public boolean remover(String nome) {
        Contato contatoParaRemover = buscar(nome);
        if (contatoParaRemover != null) {
            contatos.remove(contatoParaRemover);
            System.out.println("Contato '" + nome + "' removido com sucesso.");
            return true;
        }
        return false;
    }

    // Método extra para visualizar toda a agenda
    public void listarContatos() {
        System.out.println("\n--- Lista de Contatos ---");
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            for (Contato c : contatos) {
                System.out.println(c.toString());
            }
        }
        System.out.println("-------------------------\n");
    }
}