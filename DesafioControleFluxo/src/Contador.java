
// Desafio Controle de Fluxo: Contador

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        int parametroUm;
        int parametroDois;

        try (Scanner terminal = new Scanner(System.in)) {

            System.out.println("Digite o primeiro parâmetro:");
            parametroUm = terminal.nextInt();
            
            System.out.println("Digite o segundo parâmetro:");
            parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro.\n");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida regra dos parametros (parametroUm não pode ser maior do que parametroUm)
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        final String TEXTO_EXIBIR_CONTAGEM = "Imprimindo o número %d";

        int contagem = parametroDois - parametroUm;

        for (int x = 1; x <= contagem; x++) {

            System.out.println(String.format(TEXTO_EXIBIR_CONTAGEM, x));

        }

    }
}
