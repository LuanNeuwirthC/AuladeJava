
public class Main {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        // Testando a adição
        minhaAgenda.adicionar(new Contato("Ana Silva", "(41) 99999-1111"));
        minhaAgenda.adicionar(new Contato("Carlos Souza", "(41) 98888-2222"));

        // Testando a validação de duplicidade
        minhaAgenda.adicionar(new Contato("Ana Silva", "(41) 97777-3333"));

        minhaAgenda.listarContatos();

        // Testando a busca
        System.out.println("Buscando Carlos:");
        Contato encontrado = minhaAgenda.buscar("Carlos Souza");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getTelefone());
        }

        // Testando a remoção
        minhaAgenda.remover("Ana Silva");
        
        minhaAgenda.listarContatos();
    }
}