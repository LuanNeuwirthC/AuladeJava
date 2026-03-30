public class App {
    public static void main(String[] args) {
     CadastroProdutos meusProdutos = new CadastroProdutos();

        meusProdutos.adicionar(new Produto(0, "celular", 1234));
        meusProdutos.adicionar(new Produto(0, "sada", 1234));
        meusProdutos.adicionar(new Produto(0, "asdsa", 34));
        meusProdutos.adicionar(new Produto(0, "gfdh", 124));
        meusProdutos.adicionar(new Produto(0, "rtyt", 134));
        meusProdutos.adicionar(new Produto(0, "cvvbv", 1234));
        meusProdutos.adicionar(new Produto(0, "eredfs", 1234));
        meusProdutos.adicionar(new Produto(0, "qwew", 34));
        meusProdutos.adicionar(new Produto(0, "rgf", 124));


        meusProdutos.listarProduto();


        meusProdutos.remover(4);

        Produto produto = meusProdutos.buscar(7);
        if (produto != null) {
            System.out.println("encontrado: " + produto.getNome());
        }


        meusProdutos.remover(2);
    }
}
