package formatarcep;

import java.util.Scanner;

public class FormatarCep {

  public static void main(String[] args) {

    final String MENSAGEM_CEP_FORMATADO = "Cep formatado: %s \n";
    String cep;
    String cepFormatado;

    Scanner scanner = new Scanner(System.in);

    do {

      System.out.println("Informe o cep a formatar (vazio p/sair):");
      cep = scanner.nextLine();

      // Cep vazio encerra o programa
      if (cep.isEmpty()) {
        System.out.println("Obrigado por utilizar o formatador de CEP.\n");
        break;
      }

      try {
        cepFormatado = formatarCep(cep);
        System.out.println(String.format(MENSAGEM_CEP_FORMATADO, cepFormatado));

      } catch (CepInvalidoException e) {
        System.out.println("\nO CEP informado deve ter 8 digitos.\n");

      } catch (Exception e) {
        e.printStackTrace();

      }
  
    } while (true);

    scanner.close();

  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if(cep.length() != 8) {
      throw new CepInvalidoException();
    }
    return cep.substring(0, 5).concat("-") + cep.substring(5);
  }

}
