package com.foobar.bar.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CAD_CEP", schema="CEP")
public class CadCep {
	
	@Id
	@Column(name="CEP")
	private Long cep;

	@Column(name="UF", columnDefinition="CHAR")
	private String uf;
	
	@Column(name="LOCAL")
	private String local;

	@Column(name="BAIRRO")
	private String bairro;
	
	@Column(name="LOGRADOURO", columnDefinition="CHAR")
	private String logradouro;
	
	@Column(name="ENDERECO")
	private String endereco;
	
	@Column(name="DE")
	private Long de;
	
	@Column(name="ATE")
	private Long ate;
	
	@Column(name="FL_PAR_IMPAR", length=1, columnDefinition="CHAR")
	private String fl_par_impar;

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
