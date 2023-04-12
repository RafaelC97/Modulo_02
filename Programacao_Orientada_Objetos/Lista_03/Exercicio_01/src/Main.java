public class Main {
    public static void main(String[] args) {

        Inimigo inimigo1 = new Inimigo();
        inimigo1.nome = "Goblin Verde";
        inimigo1.ataque = 7;

        Inimigo inimigo2 = new Inimigo();
        inimigo2.nome = "Goblin Azul";
        inimigo2.ataque = 10;

        Inimigo boss1 = new Inimigo();
        boss1.nome = "Goblin Furioso";
        boss1.ataque = 25;

        Mapa mapa1 = new Mapa();
        mapa1.nome = "Vilarejo Guaianases";
        mapa1.inimigos.add(inimigo1);
        mapa1.inimigos.add(inimigo2);
        mapa1.inimigos.add(boss1);

        Inimigo inimigoComMaiorAtaque = mapa1.getInimigoMaiorAtaque();
        
    }
}