
public class Cliente {

	private String nome;
	private String endereco;
	private String bairro;
	private String cidade;
	private String estado;
	private StringBuilder clienteBuilder;
	
//sobre cargas de métedos
	
	
	public Cliente(String string) {
		// TODO Auto-generated constructor stub
	}


	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public void setNome(String nome) {
		this.nome = nome;
		clienteBuilder = new StringBuilder();
		setNome(nome);
	}
	

	public String getNome() {
		return nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}
}
