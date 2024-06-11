
// Desafio: Simulando Uma Conta Bancária Através Do Terminal/Console

import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        final String MENSAGEM_TEMPLATE = "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n";

        Scanner inputData = new Scanner(System.in);

        System.out.println("Por favor, digite o seu Nome Completo !");
        String nomeTitular = inputData.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = inputData.nextLine();

        System.out.println("Por favor, digite o número da Conta-Corrente !");
        int numeroConta = inputData.nextInt();

        System.out.println("Por favor, digite o seu Saldo !");
        double saldoConta = inputData.nextDouble();

        System.out.println("\nSeja bem vindo(a) ao Banco Bootcamp Santander DIO 2024\n");
        System.out.println(String.format(MENSAGEM_TEMPLATE, nomeTitular, numeroAgencia, numeroConta, saldoConta));
        
        inputData.close();

    }

    /**
     * 
     * Fontes de pesquisa:
     * - https://www.dio.me/articles/guia-rapido-utilizando-a-funcao-scanner-em-java
     * - https://www.developer.com/java/java-string-format-method/
     * 
     */
}
