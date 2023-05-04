import java.util.Scanner;

public class Main {

    static double calculaMedia(double[] valores){
        double somaValores = 0.0;

        for (int i = 0; i < valores.length; i++) {
            somaValores = somaValores + valores[i];
        }

        return somaValores / valores.length;
    }

    static double verificaMaiorValor(double[] valores){
        double maiorValor = 0.0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maiorValor){
                maiorValor = valores[i];
            }
        }

        return maiorValor;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de participantes da pesquisa:");
        int participantesDaPesquisa = scanner.nextInt();

        double[] salariosCidadaos = new double[participantesDaPesquisa];
        double[] quantidadeDeFilhos = new double[participantesDaPesquisa];

        for (int i = 0; i < salariosCidadaos.length; i++) {
            System.out.println("Digite o salário do " + (i+1) + "º cidadão:");
            salariosCidadaos[i] = scanner.nextDouble();
            System.out.println("Digite a quantidade de filhos que o " + (i+1) + " cidadão tem:");
            quantidadeDeFilhos[i] = scanner.nextInt();
        }

        double mediaSalarial = calculaMedia(salariosCidadaos);
        System.out.printf("A media salárial dos participantes da pesquisa é de: %.2f R$\n", mediaSalarial);
        double mediaFilhos = calculaMedia(quantidadeDeFilhos);
        System.out.println("A media de filhos dos participantes da pesquisa é de: " + mediaFilhos);
        double maiorSalario = verificaMaiorValor(salariosCidadaos);
        System.out.println("O maior salário entre os participantes é de: " + maiorSalario + " R$");
    }
}