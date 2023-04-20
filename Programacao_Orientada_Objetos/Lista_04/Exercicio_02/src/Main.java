public class Main {
    public static void main(String[] args) {

        Album album1 = new Album("O MENINO QUE QUERIA SER DEUS", "Djonga");
        album1.adicionarMusica(new Musica("SOLTO", 219, 9,"RAP"));
        album1.adicionarMusica(new Musica("UFA", 351, 10, "RAP"));
        album1.adicionarMusica(new Musica("JUNHO DE 94", 329, 8, "RAP"));

        Musica musicaMaisPopular = album1.getMusicaMaiorPopularidade();
        Musica menorMusica = album1.getMusicaMenorDuracao();

        System.out.println("Informações do album: " + album1.getNome());
        System.out.println("Música mais popular: " + musicaMaisPopular.getNome()
                            + " com " + musicaMaisPopular.getPopularidade() + " pontos de popularidade");
        System.out.println("Música mais curta: " + menorMusica.getNome() + " com "
                            + menorMusica.getDuracaoEmSegundos() + " segundos de duração");
        System.out.println("Duração do album é de: " + album1.getDuracao());
    }
}