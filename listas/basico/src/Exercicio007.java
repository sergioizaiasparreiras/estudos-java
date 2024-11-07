/*
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio007{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------- Programa Area de um Quadrado ---------------------");
        System.out.println();

        System.out.print("Digite os dados de um quadrado, lado e altura: ");
        double lado = Double.parseDouble(sc.nextLine());

        System.out.println("A area do quadrado e: " + areaQuadrado(lado));

        System.out.println("O valor da area do quadrado dobrado e: " + valorDobrado(areaQuadrado(lado)));

        sc.close();
    }

    public static double areaQuadrado(double lado){
        return Math.pow(lado, 2);
    }
    public static double valorDobrado(double valor){
        return valor * 2;
    }

}