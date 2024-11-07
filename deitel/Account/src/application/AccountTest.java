package application;

import java.util.Scanner;
import entities.Account;

public class AccountTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Account myAccount = new Account(null);

        // exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // solicita e lê o nome
        System.out.print("Please enter the name: ");
        String theName = sc.nextLine();
        myAccount.setName(theName);
        System.out.println();

        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Name in object myAccount is: %s%n%n", myAccount.getName());
        sc.close();
    }
}
