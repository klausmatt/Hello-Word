package HeranPolim;

public class ContaPoupanša extends Conta {
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
}
