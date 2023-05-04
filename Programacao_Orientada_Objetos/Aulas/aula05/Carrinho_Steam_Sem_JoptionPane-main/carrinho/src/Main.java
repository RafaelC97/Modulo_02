public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Mateus");
        cliente.adicionarJogoAoCarrinho(new Jogo(1, "Sonic Frontiers", 199.99));
        cliente.adicionarJogoAoCarrinho(new Jogo(2, "Dome keeper", 36.49));
        cliente.adicionarJogoAoCarrinho(new Jogo(3, "Dome keeper", 36.49));

        cliente.removerJogoDoCarrinho(3);
        String valorCompra = cliente.getValorCompraFormatado();
        System.out.println("O valor da compra é: " + valorCompra);
    }
}
