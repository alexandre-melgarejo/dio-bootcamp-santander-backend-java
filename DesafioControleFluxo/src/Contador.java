// Desafio Controle de Fluxo: Contador

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Contador {
    public static void main(String[] args) throws Exception {

        int parametroUm;
        int parametroDois;
        String reinicia = "S";

        try (Scanner terminal = new Scanner(System.in)) {

            // Laço para executar indefinidamente
            do {

                System.out.println("Bootcamp DIO Santander 2024 - Backend Java");
                System.out.println("Desafio Controle de Fluxo: Contador");
                System.out.println("------------------------------------------");
                System.out.println("[Pressione Ctrl+C para sair]\n");

                System.out.println("Digite o primeiro parâmetro:");
                parametroUm = terminal.nextInt();
            
                System.out.println("Digite o segundo parâmetro:");
                parametroDois = terminal.nextInt();

                System.out.println("-------");
                contar(parametroUm, parametroDois);
                System.out.println("-------");

                System.out.println("Deseja executar novamente (S/N) ?");
                reinicia = terminal.next();

            } while (reinicia.equalsIgnoreCase("S"));

            // Encerrado normalmente
            System.out.println("\nObrigado por Utilizar o Contador!\n");

        } catch (ParametrosInvalidosException e) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro.\n");
        } catch (NoSuchElementException e) {
            System.out.println("\nObrigado por Utilizar o Contador!\n");
        } catch (Exception e) {
            System.out.println("Falha crítica: " + e.getMessage());
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
