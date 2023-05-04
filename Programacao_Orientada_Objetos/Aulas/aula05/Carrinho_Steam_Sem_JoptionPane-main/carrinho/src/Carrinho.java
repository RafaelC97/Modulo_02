import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Carrinho {
    private int idCliente;
    private ArrayList<Jogo> jogos;
    private double valorTotal;

    public Carrinho(int idCliente) {
        this.idCliente = idCliente;
        this.jogos = new ArrayList<>();
    }

    public void adicionarProduto(Jogo jogo){
        this.jogos.add(jogo);
        this.valorTotal = this.valorTotal + jogo.getPreco();
        System.out.println("O produto: "+ jogo.getNome()+ " foi adicionado ao carrinho!");
    }

    public void removerProdutoDoCarrinho(int idProduto){
        for (int i = 0; i < jogos.size(); i++) {
            if(jogos.get(i).getId() == idProduto){
                this.valorTotal = this.valorTotal - jogos.get(i).getPreco();
                System.out.println("Produto: " + jogos.get(i).getNome() + " removido com sucesso!");
                jogos.remove(i);
                return;
            }
        }
        System.out.println("O produto informado não existe no carrinho...");
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Jogo> getProdutos() {
        return jogos;
    }

    public void setProdutos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }

    public Double getValorTotal() {

        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
