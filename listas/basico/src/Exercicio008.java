/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------- Programa Para saber o Salario ------------------");
        System.out.println();

        System.out.print("Quanto voce ganha por hora? ");
        double salario = Double.parseDouble(sc.nextLine());
        
        System.out.print("Quantas horas trabalha por mês? ");
        double horasPorMes = Double.parseDouble(sc.nextLine());

                

        sc.close();
    }
    public static Double valorPorHora(double valor){
        return 
    }
}
