import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Mateus");
        Catalogo catalogo = new Catalogo();

        boolean desejaInserirMaisProdutos = true;

        while(desejaInserirMaisProdutos){
           String resposta = JOptionPane
                   .showInputDialog("Digite o id do jogo que deseja colocar no carrinho\n\n" + catalogo.getCatalogoFormatado() + "\n");

           int indiceJogoEscolhido = Integer.parseInt(resposta) - 1;

           Jogo jogo = catalogo.getJogos().get(indiceJogoEscolhido);
           cliente.adicionarProdutoAoCarrinho(jogo);

           String repetirProcesso = JOptionPane.showInputDialog("Deseja inserir mais jogos no carrinho? [s]sim, [n]não");
           if(!repetirProcesso.equals("s")){
               desejaInserirMaisProdutos = false;
           }
        }

        JOptionPane.showMessageDialog(null, "O valor total da compra é: " + cliente.getValorCompraFormatado() + "R$");

    }
}
