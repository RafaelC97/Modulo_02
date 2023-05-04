import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livrosNoCatalogo = new ArrayList<>();
    ArrayList<Livro> livrosEmprestados = new ArrayList<>();
    ArrayList<Livro> livrosDisponiveis = new ArrayList<>();
    Bibliotecario bibliotecario = new Bibliotecario();
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(Usuario usuario){
        boolean usuarioValido = true;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuario.cpf.equals(usuarios.get(i).cpf)){
                usuarioValido = false;
            }
        }

        if(!usuarioValido){
            System.out.println("Impossivel realizar cadastro");
            return;
        }

        System.out.println("Cadastro realizado com sucesso");
        usuarios.add(usuario);
    }

    public void emprestar(Usuario usuario, int idLivro){

        if(!validarUsuario(usuario)){
            return;
        }

        boolean idLivroValido = false;
        Livro temporario = new Livro();
        for (int i = 0; i < livrosNoCatalogo.size(); i++) {
            if(idLivro == livrosNoCatalogo.get(i).id){
                temporario = livrosNoCatalogo.get(i);
                idLivroValido = true;
            }
        }

        if(!idLivroValido){
            System.out.println("Livro inválido!");
            return;
        }

        if (temporario.estaEmprestado){
            System.out.println("O livro está emprestado no momento");
            return;
        }

        System.out.println("O livro foi emprestado para o usuário: " + usuario.nome);
    }

    public boolean validarUsuario(Usuario usuario){
        boolean usuarioValido = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuario.cpf.equals(usuarios.get(i).cpf)){
                usuarioValido = true;
            }
        }

        return usuarioValido;
    }

}
