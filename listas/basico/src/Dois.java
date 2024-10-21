import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------- Programa que imprime um numero -------------------");
        System.out.println();

        System.out.println("Digite um numero: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.printf("O número informado foi [ %d ] ", num);

        sc.close();
    }
}
