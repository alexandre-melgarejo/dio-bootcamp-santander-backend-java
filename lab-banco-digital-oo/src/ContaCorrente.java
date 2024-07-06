
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("=== Dados Conta Corrente ===");
		super.imprimirDadosConta();
	}
	
}
