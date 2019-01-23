package com.luizalabs.duo.clone.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAD_CEP", schema="CEP")
public class CadCep {
	
	@Id
	@Column(name="CEP")
	public Long cep;

	@Column(name="UF", columnDefinition="CHAR")
	public String uf;
	
	@Column(name="LOCAL")
	public String local;

	@Column(name="BAIRRO")
	public String bairro;
	
	@Column(name="LOGRADOURO", columnDefinition="CHAR")
	public String logradouro;
	
	@Column(name="ENDERECO")
	public String endereco;
	
	@Column(name="DE")
	public Long de;
	
	@Column(name="ATE")
	public Long ate;
	
	@Column(name="FL_PAR_IMPAR", length=1, columnDefinition="CHAR")
	public String fl_par_impar;

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Long getDe() {
		return de;
	}

	public void setDe(Long de) {
		this.de = de;
	}

	public Long getAte() {
		return ate;
	}

	public void setAte(Long ate) {
		this.ate = ate;
	}

	public String getFl_par_impar() {
		return fl_par_impar;
	}

	public void setFl_par_impar(String fl_par_impar) {
		this.fl_par_impar = fl_par_impar;
	}
	
	

}
