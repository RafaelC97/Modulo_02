public class Heroi {
    private String nome;
    private int ataque;
    private int defesa;
    private int pontos;

    public Heroi(){}

    public Heroi(String nome, int ataque, int defesa, int pontos){
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        if (ataque < 1){
            this.ataque = 1;
            return;
        }
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        if (defesa < 1){
            this.defesa = 1;
            return;
        }
        this.defesa = defesa;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        if (pontos < 1){
            this.pontos = 1;
            return;
        }
        this.pontos = pontos;
    }
}
