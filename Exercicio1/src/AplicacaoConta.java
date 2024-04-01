public class AplicacaoConta {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(100);
		Conta conta2 = new Conta(-50);

		// Operações na conta1
		conta1.credito(50);
		conta1.debito(20);

		// Operações na conta2
		conta2.credito(200);
		conta2.debito(250);

		// Exibindo os saldos finais
		System.out.println("Saldo da conta 1: " + conta1.getSaldo());
		System.out.println("Saldo da conta 2: " + conta2.getSaldo());
	}
}