package fabrica.produtos;

import fabrica.funcionalidades.AparelhoTelefonico;
import fabrica.funcionalidades.NavegadorInternet;
import fabrica.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

  // Aparelho Telefonico
  public void atender() {
    System.out.println("Atendendo");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  public void ligar(String numero) {
    System.out.println("Ligando para " + numero);
  }

  //AparelhoTelefonico
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  public void atualizarPagina() {
    System.out.println("Atualizando página");
  }

  public void exibirPagina(String url) {
    System.out.println("Exibindo página " + url);
  }  
  
  // ReprodutorMusical
  public void pausar() {
    System.out.println("Pausando");
  }

  public void selecionarMusica(String musica) {
    System.out.println("Selecionando musica " + musica);
  }

  public void tocar() {
    System.out.println("Tocando");
  }

}
