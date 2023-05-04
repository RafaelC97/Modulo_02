public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1);

        pedido.adicionarPizza(new Pizza("Calabresa", 30.00));
        pedido.adicionarPizza(new Pizza("Portuguesa", 35.00));
        pedido.adicionarPizza(new Pizza("Mussarela", 30.00));

        System.out.println(pedido.getPreco());
    }
}
