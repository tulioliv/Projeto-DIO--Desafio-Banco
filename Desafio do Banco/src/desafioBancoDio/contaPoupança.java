package desafioBancoDio;

public class contaPoupanša extends Conta {
	
	public contaPoupanša(Cliente cliente) {
		super(cliente);
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanša ===");
		super.imprimirInfosComuns();
	}
	

}
