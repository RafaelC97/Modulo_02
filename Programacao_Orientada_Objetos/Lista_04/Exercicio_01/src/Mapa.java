import java.util.ArrayList;

public class Mapa {
    private String nome;
    private int altura;
    private int largura;
    private ArrayList<Inimigo> inimigos = new ArrayList<>();
    private ArrayList<Heroi> herois = new ArrayList<>();

    public Mapa(){}
    public Mapa(String nome, int altura, int largura){
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
    }

    public void adicionaInimigo(Inimigo inimigo){
        if (inimigo.getAtaque() < 1){
            inimigo.setAtaque(inimigo.getAtaque());
        }
        if (inimigo.getDefesa() < 1){
            inimigo.setDefesa(inimigo.getDefesa());
        }
        inimigos.add(inimigo);
    }

    public Inimigo getInimigoMaiorAtaque(){
        int maiorAtaqueInimigo = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < inimigos.size() ; i++) {
            if (inimigos.get(i).getAtaque() > maiorAtaqueInimigo){
                maiorAtaqueInimigo = inimigos.get(i).getAtaque();
                index = i;
            }
        }

        return inimigos.get(index);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public ArrayList<Inimigo> getInimigos() {
        return inimigos;
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

}
