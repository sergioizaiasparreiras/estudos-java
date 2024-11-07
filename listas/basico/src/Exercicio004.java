import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------- Programa para notas do Bimestre --------------------");
        System.out.println();


        System.out.print("Quantos bimestres? ");
        int quantBimestre = Integer.parseInt(sc.nextLine());

        double vetor[] = new double[quantBimestre];
        double soma = 0.0;

        for(int i = 0; i < quantBimestre; i++){
            System.out.print("Nota do " + (i + 1) + " Bimestre:" );
            vetor[i] = sc.nextDouble();
            soma = vetor[i] + vetor[i];
        }

        double media = soma / quantBimestre;

        String resultado = (media >= 7.0) ? "Aprovado" : (media >= 5) ? "Recuperacao" : "Reprovado";
        
        System.out.println("A nota no bimestre eh: " + resultado);

        sc.close();
    }
}
