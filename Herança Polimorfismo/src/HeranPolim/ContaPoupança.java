package HeranPolim;

public class ContaPoupan�a extends Conta {
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
}
