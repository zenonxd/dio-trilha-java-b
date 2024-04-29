import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};


        double baseSalary = 2000.0;
        double amountWanted = valorPretendido();

        for (int i=0; i<5; i++) {
            System.out.println("O canditado: " + candidatos[i] + "solicitou este valor de salário R$ " + amountWanted);
            if (amountWanted < baseSalary) {
                System.out.println("O canditado: " + candidatos[i] + " foi selecionado para a vaga.");
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

}