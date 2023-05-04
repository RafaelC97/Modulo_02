public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto(1, 200, 50);
        Carro carro = new Carro(2,150,100);

        moto.utilizarHabilidadeEspecial();
        carro.utilizarHabilidadeEspecial();
    }
}