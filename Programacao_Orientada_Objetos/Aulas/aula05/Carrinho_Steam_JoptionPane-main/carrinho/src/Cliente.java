import java.text.DecimalFormat;

public class Cliente {
    private int id;
    private String nome;
    private Carrinho carrinho;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.carrinho = new Carrinho(id);
    }

    public void adicionarProdutoAoCarrinho(Jogo jogo){
        carrinho.adicionarProduto(jogo);
    }

    public void removerProdutoDoCarrinho(int idProduto){
        carrinho.removerProdutoDoCarrinho(idProduto);
    }

    public String getValorCompraFormatado(){
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        return decimalFormat.format(carrinho.getValorTotal());
    }
}
