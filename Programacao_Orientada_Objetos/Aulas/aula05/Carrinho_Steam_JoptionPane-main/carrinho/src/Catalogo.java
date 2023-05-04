import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Jogo> jogos;

    public Catalogo(){
        preencheCatalogo();
    }

    private void preencheCatalogo(){
        this.jogos = new ArrayList<>();
        this.jogos.add(new Jogo(1, "Passpartout 2: The Lost Artist", 73.99));
        this.jogos.add(new Jogo(2, "Fear & Hunger", 16.59));
        this.jogos.add(new Jogo(3, "Hades", 36.99));
        this.jogos.add(new Jogo(4, "Dome Keeper", 38.49));
        this.jogos.add(new Jogo(5, "Dome Keeper", 38.49));
        this.jogos.add(new Jogo(6, "Grand Theft Auto V", 38.63));
    }
    
    public String getCatalogoFormatado(){
        StringBuilder catalogoFormatado = new StringBuilder();
        for (int i = 0; i < jogos.size(); i++) {
            catalogoFormatado
                    .append(jogos.get(i).getId())
                    .append(". ")
                    .append(jogos.get(i).getNome())
                    .append(" - ")
                    .append(jogos.get(i).getPreco())
                    .append("R$\n");
                    
        }
        return catalogoFormatado.toString();
    }

    public ArrayList<Jogo> getJogos(){
        return this.jogos;
    }
}
