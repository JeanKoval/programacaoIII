package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import interfaces.Documento;

@Entity
@Table(name = "cpf")
public class CPF implements Documento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "cpf")
	private String cpf;
	
	public CPF() {}
	
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
//		if(cpf.length() != 11) {
//			System.out.print(new Exception("CPF Incorreto, deve contem 11 digitos!"));
//			return false;
//		}
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
