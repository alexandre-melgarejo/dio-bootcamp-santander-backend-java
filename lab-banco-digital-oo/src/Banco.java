import java.util.ArrayList;
import java.util.List;

public class Banco {


	private int numero;
	private String nome;
	private List<Agencia> agencias;

	public Banco(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.agencias = new ArrayList<>();
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Agencia> getAgencias() {
		return agencias;
	}

	public void addAgencia(Agencia agencia) {
		this.agencias.add(agencia);
	}

	public void listarAgencias() {
		int i = 1;
		for(Agencia agencia : agencias) {
			System.out.println(i++ + ") " + agencia.toString());
		}
	}

	@Override
	public String toString() {
		return "Banco: " + this.getNumero() + "-" + this.getNome();
	}
	

}
