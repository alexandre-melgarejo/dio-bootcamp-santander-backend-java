
public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco(1, "Santander DIO");

		Agencia agencia1 = new Agencia("Matriz", banco);
		Agencia agencia2 = new Agencia("Filial", banco);


		Cliente clVanessa = new Cliente("Vanessa");
		Cliente clGabriela = new Cliente("Gabriela");
		Cliente clAlexandre = new Cliente("Alexandre");
		
		ContaCorrente ccVanessa = agencia1.addContaCorrente(clVanessa);
		ContaPoupanca cpAlexandre = agencia1.addContaPoupanca(clAlexandre);
		ContaCorrente ccGabriela = agencia2.addContaCorrente(clGabriela);

		ccVanessa.depositar(100);
		cpAlexandre.depositar(80);
		ccGabriela.depositar(250);

		ccGabriela.transferir(20, cpAlexandre);

		cpAlexandre.sacar(50);

		banco.listarAgencias();
		
		System.out.println("----- Listagem de Contas -----");
		for(Agencia agencia: banco.getAgencias()) {
			// System.out.println("***" + agencia.toString() + "***");
			agencia.listaContas();
			System.out.println("------------------");
		}

	}

}
