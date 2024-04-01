
public class Conta {
	
	private double saldo;

	public Conta(double saldoInicial) {
		
		if (saldoInicial < 0) {
			System.out.println("Erro: Saldo inicial não pode ser negativo. Inicializando saldo com 0.");
			this.saldo = 0;
		} else {
			this.saldo = saldoInicial;
		}
	}

	public void credito(double valor) {
		this.saldo += valor;
	}

	public void debito(double valor) {
		if (valor > this.saldo) {
			System.out.println("Erro: Saldo insuficiente para realizar o débito.");
		} else {
			this.saldo -= valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
}