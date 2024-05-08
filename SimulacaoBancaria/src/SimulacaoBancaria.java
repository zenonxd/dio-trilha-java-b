import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;

        loop: while (true) {

            int opcao = sc.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            switch (opcao) {
                case 0: {
                    System.out.println("Programa encerrado.");
                    break loop;
                }
                case 1: {
                    int valor = sc.nextInt();
                    saldo += valor;
                    System.out.println("Saldo atual: " + saldo);
                    continue;
                }
                case 2: {
                    int valor = sc.nextInt();
                    if (saldo - valor < 0) {
                        System.out.println("Saldo insuficiente.");
                    }
                    else {
                        saldo -= valor;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    continue;
                }
                case 3: {
                    System.out.println("Saldo atual: " + saldo);
                    continue;
                }

                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
}
