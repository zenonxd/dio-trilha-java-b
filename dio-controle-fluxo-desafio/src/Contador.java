import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if (parametroUm > parametroDois) {
            throw new RuntimeException("O segundo paramêtro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        for (int i=0; i<=contagem; i++) {
                System.out.println("Imprimindo número: " + i);
        }
        //realizar o for para imprimir os números com base na variável contagem
    }
}