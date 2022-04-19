package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import interfaces.Documento;

@Entity
@Table(name = "cnpj")
public class CNPJ implements Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "cnpj")
	private String cnpj;

	public CNPJ() {}
	
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
