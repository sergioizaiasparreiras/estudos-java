import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------- Programa que Area do Circulo ---------------- ");
        System.out.println();

        System.out.print("Digite o valor do raio do circulo ");
        double raio = Double.parseDouble(sc.nextLine());

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("Um circulo de raio %.1f tem a area de: %.2f\n", raio, area);
        sc.close();
    }
}
