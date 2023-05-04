public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2,5);
        Triangulo triangulo = new Triangulo(2, 5);

        double areaQuadrado = quadrado.calcularArea(quadrado.getBase(), quadrado.getAltura());
        double areaTriangulo = triangulo.calcularArea(triangulo.getBase(), triangulo.getAltura());

        System.out.println(areaQuadrado);
        System.out.println(areaTriangulo);
    }
}