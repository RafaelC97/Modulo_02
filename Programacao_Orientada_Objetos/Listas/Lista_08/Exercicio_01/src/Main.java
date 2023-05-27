public class Main {

    public static void main(String[] args){
        try {
            Grupo grupo = new Grupo();
            grupo.adicionarHeroi(new Heroi(1, "Lyn", Arma.ESPADA));
            grupo.adicionarHeroi(new Heroi(2, "Marcus", Arma.LANCA));
            grupo.adicionarHeroi(new Heroi(3, "Dorcas", Arma.MACHADO));
            grupo.adicionarHeroi(new Heroi(4, "Marcus", Arma.LANCA));
        }catch(NomeRepetididoException exception){
            System.out.println("Os herois não podem ter nome repetido");
        }
    }

}
