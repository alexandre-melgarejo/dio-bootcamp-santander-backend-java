package fabrica.acao;

import fabrica.produtos.Iphone;

public class UtilizacaoIphone {

  public static void main(String[] args) {

    Iphone mobilePhone = new Iphone();

    // Funcoes do AparelhoTelefonico
    System.out.println("\nAparelho Telefonico:");
    mobilePhone.ligar("1234567890");
    mobilePhone.atender();
    mobilePhone.iniciarCorreioVoz();


    // Funcoes do NavegadorInternet
    System.out.println("\nNavegador Internet:");
    mobilePhone.adicionarNovaAba();
    mobilePhone.exibirPagina("https://www.dio.me");
    mobilePhone.atualizarPagina();

    // Funcoes do ReprodutorMusical
    System.out.println("\nReprodutor Musical:");
    mobilePhone.selecionarMusica("Wicked Game");
    mobilePhone.tocar();
    mobilePhone.pausar();

    System.out.println("\nfim da execução\n");
    

  }

}
