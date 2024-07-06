
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("=== Dados Conta Poupanca ===");
		super.imprimirDadosConta();
	}
}
