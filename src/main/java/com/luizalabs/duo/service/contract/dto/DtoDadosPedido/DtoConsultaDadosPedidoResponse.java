package com.luizalabs.duo.service.contract.dto.DtoDadosPedido;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.luizalabs.util.spring.DtoResponseBase;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize
public class DtoConsultaDadosPedidoResponse extends DtoResponseBase{
	 
	 private BigDecimal status;
	 private BigDecimal sitcarga;
	 private Long codfil;
	 private BigDecimal filorig;
	 private BigDecimal codfiltransffat;
	 private String fllibfat;
	 private Long tipoped;
	 private BigDecimal codcli;
	 private BigDecimal codclipres;
	 private BigDecimal tpnota;
     private Date dtpedido;
	

	public BigDecimal getStatus() {
		return status;
	}
	public void setStatus(BigDecimal status) {
		this.status = status;
	}
	public BigDecimal getSitcarga() {
		return sitcarga;
	}
	public void setSitcarga(BigDecimal sitcarga) {
		this.sitcarga = sitcarga;
	}
	public Long getCodfil() {
		return codfil;
	}
	public void setCodfil(Long codfil) {
		this.codfil = codfil;
	}
	public BigDecimal getFilorig() {
		return filorig;
	}
	public void setFilorig(BigDecimal filorig) {
		this.filorig = filorig;
	}
	public BigDecimal getCodfiltransffat() {
		return codfiltransffat;
	}
	public void setCodfiltransffat(BigDecimal codfiltransffat) {
		this.codfiltransffat = codfiltransffat;
	}
	public String getFllibfat() {
		return fllibfat;
	}
	public void setFllibfat(String fllibfat) {
		this.fllibfat = fllibfat;
	}
	public Long getTipoped() {
		return tipoped;
	}
	public void setTipoped(Long tipoped) {
		this.tipoped = tipoped;
	}
	public BigDecimal getCodcli() {
		return codcli;
	}
	public void setCodcli(BigDecimal codcli) {
		this.codcli = codcli;
	}
	public BigDecimal getCodclipres() {
		return codclipres;
	}
	public void setCodclipres(BigDecimal codclipres) {
		this.codclipres = codclipres;
	}
	public BigDecimal getTpnota() {
		return tpnota;
	}
	public void setTpnota(BigDecimal tpnota) {
		this.tpnota = tpnota;
	}
	public Date getDtpedido() {
		return dtpedido;
	}
	public void setDtpedido(Date dtpedido) {
		this.dtpedido = dtpedido;
	}
     
}
	 
 
