package JeanKoval.com.github.classes;

import JeanKoval.com.github.interfaces.Documento;

public class CNPJ implements Documento {

	private String cnpj;

	public CNPJ(String cnpj) {
		setCnpj(cnpj);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		if(isValid()) {
			this.cnpj = cnpj;			
		}
	}
	
	@Override
	public Boolean isValid() {
//		if(cnpj.length()!=14) {
//			System.out.print(new Exception("CNPJ Incorreto, deve contam 14 digitos!"));
//			return false;
//		}
		return true;
	}
	
	@Override
	public String toString() {
		return cnpj;
	}

	@Override
	public String getDocumentoFormatado() {
		// TODO Auto-generated method stub
		return null;
	}

}
