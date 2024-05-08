import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = sc.nextDouble();
        double saque = sc.nextDouble();
        double limiteChequeEspecial = 500;


        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:

        if (saque > saldo) {
            if (saque > limiteChequeEspecial + saldo) {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
            else {
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }
        }

        else {
            System.out.println("Transacao realizada com sucesso.");
        }


        sc.close();
    }
}

