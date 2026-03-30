/**
 * A classe Produto deve ter os atributos código, nome e preço.
• A classe CadastroProdutos deve gerenciar uma lista de produtos e ter
métodos para adicionar, remover e buscar produtos por código.
• Deve implementar validação para evitar produtos com o mesmo nome.
• Deve implementar método para gerar o código do produto
automaticamente
 */

public class Produto {

    private int codigo = 0;
    private String nome;
    private double preco;
    
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Produtos [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
    }


    

}
