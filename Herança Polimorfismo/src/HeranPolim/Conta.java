package HeranPolim;

public class Conta {

	protected double saldo;

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void sava(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

}
