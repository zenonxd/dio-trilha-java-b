import Cliente.Cliente;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupança;

public class Main {
    public static void main(String[] args) {
        Cliente olavo = new Cliente();
        olavo.setName("Olavo");

        Conta cc = new ContaCorrente(olavo);
        Conta pp = new ContaPoupança(olavo);

        cc.depositar(100);
        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}