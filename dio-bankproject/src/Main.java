import entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("Agency number: ");
        String agency = sc.nextLine();
        sc.nextLine();

        System.out.println("Holder full name: ");
        String name = sc.nextLine();

        System.out.println("Current balance: ");
        Double balance = sc.nextDouble();

        Account account = new Account(number, agency, name, balance);

        System.out.println(account);


        sc.close();
    }
}