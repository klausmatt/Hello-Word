package HeranPolim;

public class TestaContas {
	public static void main(String[] args) {
	    Conta c = new Conta();
	    ContaCorrente cc = new ContaCorrente();
	    ContaPoupan�a cp = new ContaPoupan�a();
	  
	    c.deposita(1000); 
	    cc.deposita(1000); 
	    cp.deposita(1000);
	  
	    c.atualiza(0.01);
	    cc.atualiza(0.01);
	    cp.atualiza(0.01);

	    System.out.println(c.getSaldo());
	    System.out.println(cc.getSaldo());
	    System.out.println(cp.getSaldo());

	  }
	}


