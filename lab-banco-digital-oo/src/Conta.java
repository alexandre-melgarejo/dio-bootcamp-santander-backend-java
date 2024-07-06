
public abstract class Conta implements IConta {

	private static int numeroConta = 1;

	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.numero = numeroConta++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirDadosConta() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	@Override
	public String toString() {
		return "Conta [numero=" + this.getNumero() + 
						", saldo="	+ String.format("Saldo: %.2f", this.saldo) + 
						", cliente=" + this.cliente.getNome() + "]";
	}

}
