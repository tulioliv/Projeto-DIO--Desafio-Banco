package desafioBancoDio;

public class contaPoupan�a extends Conta {
	
	public contaPoupan�a(Cliente cliente) {
		super(cliente);
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
	

}
