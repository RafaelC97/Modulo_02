public class Main {
    public static void main(String[] args) {

        Mapa mapa1 = new Mapa("Vilarejo Guaianases", 10, 10);
        mapa1.adicionaInimigo(new Inimigo("Goblin Verde", 7, 3, 2));
        mapa1.adicionaInimigo(new Inimigo("Goblin Azul", 10, 5, 5));
        mapa1.adicionaInimigo(new Inimigo("Goblin Furioso", 25, 20, 30));
        mapa1.adicionaInimigo(new Inimigo("Goblin Gripado", -10, -10, -10));

        Inimigo inimigoComMaiorAtaque = mapa1.getInimigoMaiorAtaque();

        System.out.println("Você está no " + mapa1.getNome() + " e o inimigo com maior ataque deste mapa é: "
                            + inimigoComMaiorAtaque.getNome() + " com " + inimigoComMaiorAtaque.getAtaque() + " de ataque.");
    }
}