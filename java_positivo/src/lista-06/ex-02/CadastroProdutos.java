import java.util.ArrayList;
import java.util.List;

public class CadastroProdutos {
    
    private List<Produto> produtos;
    private int proximoCodigo = 1;

    public CadastroProdutos(){
        this.produtos = new ArrayList<>();
    }

//evitar produtos com mesmo nome

    public boolean adicionar(Produto novoProduto){

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase (novoProduto.getNome())) {
                System.out.println("Erro: o produto " + novoProduto.getNome() + "já existe");
                return false;
            }
        }
    novoProduto.setCodigo(proximoCodigo);
    proximoCodigo++;

        //adiciona novo produto a lista
        produtos.add(novoProduto);
        System.out.println("Produto " + novoProduto.getCodigo() + " adicionado com sucesso");
        return true;
    }
//buscar por codigo
    public Produto buscar(int codigo){
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        System.out.println("Produto" + codigo + " nao encontrado.");
        return null;
    }
//remover
    public boolean remover(int codigo){
            Produto removeProduto = buscar(codigo);
            if (removeProduto != null) {
                produtos.remove(removeProduto);
                System.out.println("Produto " + codigo + " foi removido");
                return true;
            }
            return false;
    }


     public void listarProduto() {
        System.out.println("\n--- Lista de produtos ---");
        if (produtos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto.toString());
            }
        }
        System.out.println("-------------------------\n");
    }
}
