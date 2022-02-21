package JeanKoval.com.github.classes;

public class Cliente {

	private String nome;
	private String documento;
	
	public Cliente(String nome, String documento) {
		this.nome 	   = nome;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: "+this.nome);
		sb.append("\nDocumento: "+this.documento);
		return sb.toString();
	}
}
