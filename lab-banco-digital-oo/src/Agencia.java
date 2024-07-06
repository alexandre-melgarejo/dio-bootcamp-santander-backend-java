import java.util.ArrayList;
import java.util.List;

public class Agencia {

  private static int numeroAgencia = 1;

  private int numero;
  private String nome;
  private Banco banco;
  private List<IConta> contas;

  public Agencia(String nome, Banco banco) {
    this.numero = numeroAgencia++;
    this.setNome(nome);
    this.contas = new ArrayList<>();
    banco.addAgencia(this);
  }

  public ContaCorrente addContaCorrente(Cliente cliente) {
    ContaCorrente conta = new ContaCorrente(cliente);
    this.contas.add(conta);
    return conta;
  }

  public ContaPoupanca addContaPoupanca(Cliente cliente) {
    ContaPoupanca conta = new ContaPoupanca(cliente);
    this.contas.add(conta);
    return conta;
  }

  public int getNumero() {
    return this.numero;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Banco getBanco() {
    return banco;
  }

  public void setBanco(Banco banco) {
    this.banco = banco;
  }

  @Override
  public String toString() {
    return "Agencia: " + this.getNumero() + " - " + this.getNome();
  }

  public void listaContas() {

    System.out.println("Agencia: " + this.numero + " - " + this.nome);
    System.out.println("");
    for(IConta conta: contas) {
      conta.imprimirSaldo();
      System.out.println("---");
    }
  
  }
  

  
}
