import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            exibirOpcoes();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: //Deposito
                    exibirFormOperacao("DEPÓSITO");
                    double valorDeposito = scanner.nextDouble();
                    if (!validarInput(valorDeposito)) {
                        continue;
                    }
                    saldo += valorDeposito;
                    exibirSaldo(saldo);
                    break;
                case 2: //Saque
                    exibirFormOperacao("SAQUE");
                    double valorSaque = scanner.nextDouble();
                    if (!validarInput(valorSaque)) {
                        continue;
                    }
                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                        exibirSaldo(saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3: //Consulta saldo
                    exibirCabecalhoOperacao("CONSULTA SALDO");
                    exibirSaldo(saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
        scanner.close();
    }

    private static void exibirOpcoes() {
        System.out.println("\nEscolha uma opcao\n");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("0. Encerrar"); // Exibido "0" para atender a lógica
    }

    private static void exibirCabecalhoOperacao(String operacao) {
        System.out.println("\n" + operacao.toUpperCase());
        System.out.println("-".repeat(operacao.length()) + "\n");
    }

    private static void exibirFormOperacao(String operacao) {
        exibirCabecalhoOperacao(operacao);
        System.out.println(String.format("Informe o valor para %s:", operacao.toLowerCase()));
    }

    private static void exibirSaldo(double valorSaldo) {
        final String TEXTO_SALDO_ATUAL = "Saldo atual: %.1f";
        System.out.println(String.format(TEXTO_SALDO_ATUAL, valorSaldo));
    }

    private static boolean validarInput(double valorMovimento) {
        boolean result = (valorMovimento > 0); // Valor do movimento deve ser > zero
        if (!result) {
            System.out.println("** O valor informado deve ser maior que zero **");
        }
        return result;
    }


}