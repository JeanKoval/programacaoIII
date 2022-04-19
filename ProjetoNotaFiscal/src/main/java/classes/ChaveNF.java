package classes;

import java.io.IOException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chaves")
public class ChaveNF {
	
	private Integer TAMANHO_CHAVE;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	private String chave;
	
	public ChaveNF() {}
	
	public ChaveNF(String chave) {
		setChave(chave);
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		try {
			validaTamanhoChave(chave);
			this.chave = chave;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Boolean validaTamanhoChave(String chave) throws IOException {
		if(chave.length() != TAMANHO_CHAVE) {
			throw new IOException("Chave deve obrigatoriamente conter 44 digitos...");
		}else {
			return true;			
		}
	}
}
