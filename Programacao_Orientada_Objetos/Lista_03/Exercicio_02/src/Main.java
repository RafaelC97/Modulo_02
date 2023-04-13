public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.nome = "SOLTO";
        musica1.duracaoEmSegundos = 219;
        musica1.popularidade = 9;
        musica1.genero = "RAP";

        Musica musica2 = new Musica();
        musica2.nome = "UFA";
        musica2.duracaoEmSegundos = 351;
        musica2.popularidade = 10;
        musica2.genero = "RAP";

        Musica musica3 = new Musica();
        musica3.nome = "JUNHO DE 94";
        musica3.duracaoEmSegundos = 329;
        musica3.popularidade = 8;
        musica3.genero = "RAP";

        Album album1 = new Album();
        album1.nome = "O MENINO QUE QUERIA SER DEUS";
        album1.nomeArtista = "Djonga";
        album1.musicas.add(musica1);
        album1.musicas.add(musica2);
        album1.musicas.add(musica3);

        Musica musicaMaisPopular = album1.getMusicaMaiorPopularidade();
        Musica menorMusica = album1.getMusicaMenorDuracao();

        System.out.println("A música mais popular do album " + album1.nome + " é: " + musicaMaisPopular.nome
                                + " com " + musicaMaisPopular.popularidade + " pontos de popularidade");
        System.out.println("A música mais curta do album " + album1.nome + " é: " + menorMusica.nome + " com "
                                + menorMusica.duracaoEmSegundos + " segundos de duração");
    }
}