package desafioBancoDio;

public class Main {

	public static void main(String[] args) {
		Cliente marco = new Cliente();
		marco.setNome("Marco Tulio");
		Conta cc = new contaCorrente(marco);
		Conta poupanca = new contaPoupança(marco);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
