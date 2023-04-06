import java.util.Scanner;

public class Main {

    public static String categoriaNadador(int idade){

        String categoria;

        if (idade >= 5 && idade <= 7){
            categoria = "Infantil A";
        }else if (idade >= 8 && idade <= 10){
            categoria = "Infantil B";
        }else if (idade >= 11 && idade <= 13){
            categoria = "Juvenil A";
        }else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil B";
        }else{
            categoria = "Adulto";
        }
        return categoria;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();
        String categoria = categoriaNadador(idade);

        System.out.println("O nadador pertence a categoria: " + categoria);
    }

}