import java.util.ArrayList;

public class Pedido {
    private int id;
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private double preco;

    public Pedido(){}

    public Pedido(int id){
        this.id = id;
    }

    public void adicionarPizza(Pizza pizza){
        pizzas.add(pizza);
        this.preco = this.preco + pizza.getPreco();
    }

    public double getPreco() {
        if(pizzas.size() >= 3){
            return this.preco * 0.85;
        }
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }
}
