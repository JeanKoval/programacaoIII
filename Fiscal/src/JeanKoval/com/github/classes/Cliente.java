package JeanKoval.com.github.classes;

public class Cliente {

	private String nome;
	private CPF cpf;
	
	public Cliente(String nome, CPF documento) {
		this.nome 	   = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CPF getCPF() {
		return cpf;
	}

	public void setCPF(CPF cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: "+this.nome);
		sb.append("\nCPF: "+this.cpf);
		return sb.toString();
	}
}
