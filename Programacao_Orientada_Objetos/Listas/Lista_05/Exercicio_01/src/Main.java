import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Grupo grupo = new Grupo();
        grupo.adicionarHeroiAoGrupo(new Heroi("Rafael", 10));
        grupo.adicionarHeroiAoGrupo(new Heroi("Mateus", 15));
        grupo.adicionarHeroiAoGrupo(new Heroi("Mateus", 15));
        grupo.adicionarHeroiAoGrupo(new Heroi("Davi", 10));

        System.out.println(grupo.getTotalMoedasDeOuro());

        grupo.removerHeroiDoGrupo("Mateus");

        System.out.println(grupo.getTotalMoedasDeOuro());

        grupo.removerHeroiDoGrupo("Lucas");
        
    }
}