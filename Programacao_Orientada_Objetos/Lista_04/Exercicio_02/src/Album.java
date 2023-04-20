import java.util.ArrayList;

public class Album {

    private String nome;
    private String nomeArtista;
    private int duracaoEmSegundos;
    private String duracao;
    private ArrayList<Musica> musicas = new ArrayList<>();

    public Album(){}

    public Album(String nome, String nomeArtista){
        this.nome = nome;
        this.nomeArtista = nomeArtista;
    }

    public void adicionarMusica(Musica musica){
        musicas.add(musica);
        this.duracaoEmSegundos = this.duracaoEmSegundos + musica.getDuracaoEmSegundos();
    }

    public Musica getMusicaMaiorPopularidade(){
        int maiorPopularidade = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getPopularidade() > maiorPopularidade){
                maiorPopularidade = musicas.get(i).getPopularidade();
                index = i;
            }
        }
        return musicas.get(index);
    }
    public Musica getMusicaMenorDuracao(){
        int menorDuracao = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getDuracaoEmSegundos() < menorDuracao) {
                menorDuracao = musicas.get(i).getDuracaoEmSegundos();
                index = i;
            }
        }
        return musicas.get(index);
    }

    public String duracao(int duracaoEmSegundos){
        int hora = this.duracaoEmSegundos/3600;
        this.duracaoEmSegundos = this.duracaoEmSegundos %  3600;
        int minutos = this.duracaoEmSegundos/60;
        this.duracaoEmSegundos = this.duracaoEmSegundos %  60;
        this.duracao = hora+":"+minutos+":"+this.duracaoEmSegundos;
        return duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public String getDuracao() {
        return duracao(this.duracaoEmSegundos);
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }
}
