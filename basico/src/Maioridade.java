import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("----------------- Programa que diz se eh ou nao maior de idade -----------------");
        System.out.println();

        System.out.print("Digite uma idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        String idadeRevisada = (idade < 18) ? "de menor" : "de maior";

        System.out.print("Você eh " + idadeRevisada);
       sc.close();
    }
}
