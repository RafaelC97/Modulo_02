public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.nome = "Rafael";
        usuario1.cpf = "12345678910";

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.cadastrarUsuario(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.nome = "Leticia";
        usuario2.cpf = "12345678911";

        biblioteca.cadastrarUsuario(usuario2);
    }
}
