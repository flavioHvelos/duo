package com.luizalabs.duo.root.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class MovPedidoPK implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Long codfil;

	private Long tipoped;

	private Long numpedven;

	public MovPedidoPK() {
	}
	public Long getCodfil() {
		return codfil;
	}
	public void setCodfil(Long codfil) {
		this.codfil = codfil;
	}	
	public Long getTipoped() {
		return tipoped;
	}
	public void setTipoped(Long tipoped) {
		this.tipoped = tipoped;
	}
	public Long getNumpedven() {
		return numpedven;
	}
	public void setNumpedven(Long numpedven) {
		this.numpedven = numpedven;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MovPedidoPK)) {
			return false;
		}
		MovPedidoPK castOther = (MovPedidoPK)other;
		return 
			(this.codfil == castOther.codfil)
			&& (this.tipoped == castOther.tipoped)
			&& (this.numpedven == castOther.numpedven);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.codfil ^ (this.codfil >>> 32)));
		hash = hash * prime + ((int) (this.tipoped ^ (this.tipoped >>> 32)));
		hash = hash * prime + ((int) (this.numpedven ^ (this.numpedven >>> 32)));
		
		return hash;
	}
}
