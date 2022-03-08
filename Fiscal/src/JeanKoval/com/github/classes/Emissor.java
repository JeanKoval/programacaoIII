package JeanKoval.com.github.classes;

public class Emissor {

	private String nome;
	private CNPJ cnpj;
	
	public Emissor(String nome, CNPJ cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CNPJ getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(CNPJ cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: "+this.nome);
		sb.append("\nCNPJ: "+this.cnpj);
		return sb.toString();
	}
}
