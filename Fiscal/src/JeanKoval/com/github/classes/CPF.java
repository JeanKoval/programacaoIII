package JeanKoval.com.github.classes;

import JeanKoval.com.github.interfaces.Documento;

public class CPF implements Documento {
	
	private String cpf;
	
	public CPF(String cpf) {
		setCpf(cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(isValid()) {
			this.cpf = cpf;
		}			
	}

	@Override
	public Boolean isValid() {
		if(cpf.length() != 11) {
			System.out.print(new Exception("CPF Incorreto, deve contem 11 digitos!"));
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return cpf;
	}

	@Override
	public String getDocumentoFormatado() {
		// TODO Auto-generated method stub
		return null;
	}

}
