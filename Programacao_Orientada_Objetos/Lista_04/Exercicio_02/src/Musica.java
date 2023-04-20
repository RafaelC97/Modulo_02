public class Musica {

    private String nome;
    private int duracaoEmSegundos;
    private int popularidade;
    private String genero;

    public Musica(){}

    public Musica(String nome, int duracaoEmSegundos, int popularidade, String genero){
        this.nome = nome;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.popularidade = popularidade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public int getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
