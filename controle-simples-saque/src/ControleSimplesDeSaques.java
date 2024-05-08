import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double limiteDiario = sc.nextDouble();

        // TODO: Crie um loop 'for' para iterar sobre os saques:

        for (int i=0; i<= limiteDiario; i++) {
            // TODO: Solicite ao usuário o valor do saque:
            double saque = sc.nextDouble();
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (saque < limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                System.out.println("Transacoes encerradas.");
            }
            else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            }
        }


        // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:


        // TODO: Informe que o saque foi realizado e mostre o limite restante:

        sc.close();
    }
}
