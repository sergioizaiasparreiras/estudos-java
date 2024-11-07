import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------ Programa de conversao de m para cm -----------------");
        System.out.println();

        
        double metro = 0.0;
        double cm = 0.0;

        System.out.print("Digite o valor do metro: ");
        double valor = Double.parseDouble(sc.nextLine());


        metro = valor;
        cm = metro * 100;
        System.out.println("A conversao de " + metro + " metros em cm e " + cm );

        sc.close();
    }
}
