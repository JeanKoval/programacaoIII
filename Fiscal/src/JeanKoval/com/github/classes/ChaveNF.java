package JeanKoval.com.github.classes;

import java.io.IOException;

public class ChaveNF {
	
	public final Integer TAMANHO_CHAVE = 44;
	public String chave;
	
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
