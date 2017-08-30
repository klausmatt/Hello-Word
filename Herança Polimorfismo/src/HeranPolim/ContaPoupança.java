package HeranPolim;

public class ContaPoupança extends Conta {
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
}
