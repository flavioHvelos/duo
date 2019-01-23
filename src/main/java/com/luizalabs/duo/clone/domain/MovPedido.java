package com.luizalabs.duo.clone.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="MOV_PEDIDO", schema="GEMCO")
public class MovPedido implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MovPedidoPK id;
	
	private BigDecimal autorizac;

	private BigDecimal carencia;

	private String chaveacesent;

	private String chaveacessoref;

	private String ciffob;

	private String codagrup;

	private BigDecimal codaval;

	private BigDecimal codcampfid;

	private BigDecimal codcanal;

	private BigDecimal codcargo;

	private BigDecimal codcli;

	private BigDecimal codclient;

	private BigDecimal codclipres;

	private BigDecimal codclipublicidade;

	private BigDecimal codcon;

	private BigDecimal codconvenio;

	private String coddevol;

	private BigDecimal codendclipublicidade;

	private String codentregaobjeto;

	private BigDecimal codfilcob;

	private BigDecimal codfilcross;

	private BigDecimal codfilsimpfat;

	private BigDecimal codfilsolic;

	private BigDecimal codfiltransffat;

	private String codfonte;

	private BigDecimal codfunc;

	private BigDecimal codfunclib;

	private String codjust;

	private BigDecimal codlista;

	private BigDecimal codlistapresente;

	private BigDecimal codmensag;

	private String codmodal;

	private String codmodelo;

	private BigDecimal codmontag;

	private BigDecimal codnatop;

	private BigDecimal codnatopcli;

	private BigDecimal codnatopcompl;

	private BigDecimal codocorent;

	private BigDecimal codreserva;

	private BigDecimal codret;

	private BigDecimal codrota;

	private BigDecimal codseguradora;

	private String codsitcredped;

	private BigDecimal codsup;

	private BigDecimal codtransp;

	private BigDecimal codtranspred;

	private BigDecimal codtrk;

	private BigDecimal codturno;

	private BigDecimal coduser;

	private BigDecimal coduserprzpedido;

	private BigDecimal coduservenda;

	private BigDecimal codvendr;

	private BigDecimal codvendrlib;

	private String condpgto;

	private String condpgtoori;

	private String condpgtoprazo;

	private String confrefcom;

	private String confrefpes;

	private String confsalario;

	private BigDecimal contrato;

	private BigDecimal cpfaval;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datent;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datenvio;

	@Temporal(TemporalType.TIMESTAMP)
	private Date datret;

	private String defcli;

	private BigDecimal digcontrafin;

	private BigDecimal dignumautcred;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtalter;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtaprovcred;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtarq;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtbloqueio;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtcancela;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtconscred;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtdevol;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtefetivacao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtemiscont;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dtentrega;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DTENTREGA_ORIGINAL")
	private Date dtentregaOriginal;

	@Temporal(TemporalType.DATE)
	private Date dtentregaagendada;

	@Temporal(TemporalType.DATE)
	private Date dtentregaprevista;

	@Temporal(TemporalType.DATE)
	private Date dtenvioseg;

	@Temporal(TemporalType.DATE)
	private Date dtlibcom;

	@Temporal(TemporalType.DATE)
	private Date dtlibcre;

	@Temporal(TemporalType.DATE)
	private Date dtlibfat;

	@Temporal(TemporalType.DATE)
	private Date dtlimite;

	@Temporal(TemporalType.DATE)
	private Date dtmontag;

	@Temporal(TemporalType.DATE)
	private Date dtnasccli;

	@Temporal(TemporalType.DATE)
	private Date dtnotadevol;

	@Temporal(TemporalType.DATE)
	private Date dtnotasimpfat;

	@Temporal(TemporalType.DATE)
	private Date dtpagto;

	@Temporal(TemporalType.DATE)
	private Date dtpedcli;

	@Temporal(TemporalType.DATE)
	private Date dtpedido;

	@Temporal(TemporalType.DATE)
	private Date dtretassistec;

	@Temporal(TemporalType.DATE)
	private Date dtretorno;

	@Temporal(TemporalType.DATE)
	private Date dttransffat;

	@Temporal(TemporalType.DATE)
	private Date dtvalid;

	private BigDecimal dvconta;

	private String emusorotei;

	private String encomenda;

	private BigDecimal endclient;

	private BigDecimal endclipres;

	private BigDecimal endcob;

	private BigDecimal endent;

	private BigDecimal endfat;

	private BigDecimal endrisco;

	private String envia;

	private String externalorderid;

	private BigDecimal filorig;

	private String flagrupatransffat;

	private String flaguardaestoque;

	private String flatualiza;

	private String flatufuturo;

	private String flatulogico;

	private String flbancontrato;

	private String flbxestoque;

	private String flbxnrserie;

	private String flcartaoespecial;

	private String flclientedda;

	private String flconsfinal;

	private String flcredlista;

	private String fldescaracterizado;

	private String fldestentrega;

	private String fldevol;

	private String flentrada;

	private String flentregaagendada;

	private String flentvar;

	private String flenvfin;

	private String flenvseg;

	private String flestat;

	private String flestornocxa;

	private String flfatcdst;

	private String flfatparcial;

	private String flfatura;

	private String flfreteurg;

	private String flgeracred;

	private String flgeranfvendacd;

	private String flinstalaterceiro;

	private String flint;

	private String flintibm;

	private String flintlibpedven;

	private String flinttms;

	private String flipiicms;

	private String flipisub;

	private String fljuntapv;

	private String fllibfat;

	private String flmontagem;

	private String flmultiped;

	private String flnfmanual;

	private String flos;

	private String flosgerada;

	private String flpedorigem;

	private String flpedtransflog;

	private String flprestamista;

	private String flprestconjuge;

	private String flproccdsubst;

	private String flprzpedido;

	private String flrelvisita;

	private String flreplica;

	private String flretira;

	private String flricms;

	private String flroteiroy;

	private String flseguro;

	private String flsitcredlista;

	private String flsituacaoinss;

	private BigDecimal flstatuspedpdv;

	private String flsubstituto;

	private String fltpcli;

	private String fltpvenda;

	private String fltransfanexoaut;

	private String fltransffatnf;

	private String fltransfprod;

	private String flutilizatecnico;

	private String flutilpedido;

	private String flverbadesc;

	private String gatesystem1;

	private String gatesystem2;

	private String gatesystem3;

	private String guia;

	@Temporal(TemporalType.DATE)
	private Date hrcancelamento;

	private BigDecimal hrduracao;

	@Temporal(TemporalType.DATE)
	private Date hrentrega;

	@Temporal(TemporalType.DATE)
	private Date hrlibcre;

	@Temporal(TemporalType.DATE)
	private Date hrmontag;

	@Temporal(TemporalType.DATE)
	private Date hrpedido;

	@Column(name="IDENT_LIBCRED")
	private String identLibcred;

	private String identproc;

	private String integracrc;

	private String intflmov;

	private String intflnfml;

	@Column(name="\"LOCAL\"")
	private BigDecimal local;

	private String localsaida;

	private BigDecimal ltcontr;

	private String mensagemcartao;

	private BigDecimal motrec;

	private BigDecimal nivellibefet;

	private BigDecimal nivellibprev;

	private String nmger;

	private String nome;

	private String nomearq;

	private String nomeaval;

	private BigDecimal npedcli;

	private String npedcliint;

	private BigDecimal nrcancdev;

	private BigDecimal nrvolume;

	private BigDecimal numajudantes;

	private BigDecimal numautcred;

	private String numcartao;

	private BigDecimal numcontra;

	private BigDecimal numcontrafin;

	private String numcontraseg;

	private BigDecimal numcotacons;

	private BigDecimal numcxa;

	private BigDecimal numdav;

	private BigDecimal numgrupocons;

	private BigDecimal numlote;

	private BigDecimal numnotadevol;

	private BigDecimal numnotaent;

	private BigDecimal numnotasimpfat;

	private String numpedcli;

	private String numpedcomcli;

	private BigDecimal numpedprinc;

	private BigDecimal numpedprincsite;

	private BigDecimal numpedsolic;

	private String numpedvenclisite;

	private BigDecimal numpedvensite;

	private BigDecimal numppfpremio;

	private BigDecimal numpreped;

	private BigDecimal numprepedven;

	private BigDecimal numpvpaf;

	private BigDecimal numrecdevol;

	private BigDecimal numreserva;

	private String numtabpreco;

	private BigDecimal numvenda;

	private String obs;

	private String obsavalista;

	private String obsavs;

	private String obscre;

	private String obsdevol;

	private String obsvendr;

	private BigDecimal opelibcom;

	private BigDecimal opelibcre;

	private BigDecimal ordemprdlib;

	private BigDecimal origem;

	private String pgtblq;

	private BigDecimal pjuros;

	private BigDecimal pjurosori;

	private BigDecimal pmargrent;

	private BigDecimal praca;

	private String processo;

	@Column(name="PROG_CANC")
	private String progCanc;

	private BigDecimal qtprc;

	private BigDecimal rebate;

	private BigDecimal rebateori;

	private BigDecimal redutorbaseicms;

	private BigDecimal regracreditscore;

	private String representante;

	private String respexterno;

	private String respinterno;

	private String restbanc;

	private BigDecimal score;

	private BigDecimal seqarq;

	private BigDecimal seqconta;

	private BigDecimal seqsubpraca;

	private String seriecontrafin;

	private String seriedevol;

	private String serieent;

	private String seriesimpfat;

	private BigDecimal setor;

	private BigDecimal sitcarga;

	private BigDecimal sitenc;

	private BigDecimal situatef;

	private String spc;

	private BigDecimal status;

	private BigDecimal statusavs;

	private BigDecimal statusppf;

	private BigDecimal statusppfpremio;

	private BigDecimal statusrotei;

	private BigDecimal sttrans;

	private BigDecimal subpraca;

	private String telefone;

	private String tempconta;

	private BigDecimal tipopedsolic;

	private BigDecimal totcupompromocional;

	private String tpcontrato;

	private BigDecimal tpfrete;

	private BigDecimal tpfunclibefet;

	private BigDecimal tpfunclibprev;

	private String tpmultidevol;

	private BigDecimal tpnota;

	private String tpnotaent;

	private BigDecimal tpnotasimpfat;

	private String tporigped;

	private String tpped;

	private String turnoagendado;

	private String turnoentr;

	@Column(name="USERID_LIBFORMA")
	private String useridLibforma;

	private BigDecimal vlacrecdesctot;

	private BigDecimal vlbaseicms;

	private BigDecimal vlbaseicmsf;

	private BigDecimal vlbaseicmssub;

	private BigDecimal vlbaseipi;

	private BigDecimal vldescfrete;

	private BigDecimal vldesconto;

	private BigDecimal vldescontoconju;

	private BigDecimal vldespaces;

	private BigDecimal vldespfin;

	private BigDecimal vlentrada;

	private BigDecimal vlfrete;

	private BigDecimal vlfreteorig;

	private BigDecimal vlfreteterceiro;

	private BigDecimal vlicm;

	private BigDecimal vlicmret;

	private BigDecimal vlii;

	private BigDecimal vliof;

	private BigDecimal vlirrf;

	private BigDecimal vlisento;

	private BigDecimal vljuros;

	private BigDecimal vljurosfin;

	private BigDecimal vlmercad;

	private BigDecimal vlmontagem;

	private BigDecimal vlmontagorig;

	private BigDecimal vloutdesp;

	private BigDecimal vloutras;

	private BigDecimal vlpiscofinscsll;

	private BigDecimal vlprc;

	private BigDecimal vlrebate;

	private BigDecimal vlseguro;

	private BigDecimal vltac;

	private BigDecimal vltarbancaria;

	private BigDecimal vltotal;

	private BigDecimal vltotalind;

	private BigDecimal vltotcomissup;

	private BigDecimal vltotcomisvend;

	private BigDecimal vltotitemacum;

	private BigDecimal vltxboleto;

	private BigDecimal vlvdliq;

	private BigDecimal vlvdvista;

	public MovPedido() {
	}

	public BigDecimal getAutorizac() {
		return autorizac;
	}

	public void setAutorizac(BigDecimal autorizac) {
		this.autorizac = autorizac;
	}

	public BigDecimal getCarencia() {
		return carencia;
	}

	public void setCarencia(BigDecimal carencia) {
		this.carencia = carencia;
	}

	public String getChaveacesent() {
		return chaveacesent;
	}

	public void setChaveacesent(String chaveacesent) {
		this.chaveacesent = chaveacesent;
	}

	public String getChaveacessoref() {
		return chaveacessoref;
	}

	public void setChaveacessoref(String chaveacessoref) {
		this.chaveacessoref = chaveacessoref;
	}

	public String getCiffob() {
		return ciffob;
	}

	public void setCiffob(String ciffob) {
		this.ciffob = ciffob;
	}

	public String getCodagrup() {
		return codagrup;
	}

	public void setCodagrup(String codagrup) {
		this.codagrup = codagrup;
	}

	public BigDecimal getCodaval() {
		return codaval;
	}

	public void setCodaval(BigDecimal codaval) {
		this.codaval = codaval;
	}

	public BigDecimal getCodcampfid() {
		return codcampfid;
	}

	public void setCodcampfid(BigDecimal codcampfid) {
		this.codcampfid = codcampfid;
	}

	public BigDecimal getCodcanal() {
		return codcanal;
	}

	public void setCodcanal(BigDecimal codcanal) {
		this.codcanal = codcanal;
	}

	public BigDecimal getCodcargo() {
		return codcargo;
	}

	public void setCodcargo(BigDecimal codcargo) {
		this.codcargo = codcargo;
	}

	public BigDecimal getCodcli() {
		return codcli;
	}

	public void setCodcli(BigDecimal codcli) {
		this.codcli = codcli;
	}

	public BigDecimal getCodclient() {
		return codclient;
	}

	public void setCodclient(BigDecimal codclient) {
		this.codclient = codclient;
	}

	public BigDecimal getCodclipres() {
		return codclipres;
	}

	public void setCodclipres(BigDecimal codclipres) {
		this.codclipres = codclipres;
	}

	public BigDecimal getCodclipublicidade() {
		return codclipublicidade;
	}

	public void setCodclipublicidade(BigDecimal codclipublicidade) {
		this.codclipublicidade = codclipublicidade;
	}

	public BigDecimal getCodcon() {
		return codcon;
	}

	public void setCodcon(BigDecimal codcon) {
		this.codcon = codcon;
	}

	public BigDecimal getCodconvenio() {
		return codconvenio;
	}

	public void setCodconvenio(BigDecimal codconvenio) {
		this.codconvenio = codconvenio;
	}

	public String getCoddevol() {
		return coddevol;
	}

	public void setCoddevol(String coddevol) {
		this.coddevol = coddevol;
	}

	public BigDecimal getCodendclipublicidade() {
		return codendclipublicidade;
	}

	public void setCodendclipublicidade(BigDecimal codendclipublicidade) {
		this.codendclipublicidade = codendclipublicidade;
	}

	public String getCodentregaobjeto() {
		return codentregaobjeto;
	}

	public void setCodentregaobjeto(String codentregaobjeto) {
		this.codentregaobjeto = codentregaobjeto;
	}

	public BigDecimal getCodfilcob() {
		return codfilcob;
	}

	public void setCodfilcob(BigDecimal codfilcob) {
		this.codfilcob = codfilcob;
	}

	public BigDecimal getCodfilcross() {
		return codfilcross;
	}

	public void setCodfilcross(BigDecimal codfilcross) {
		this.codfilcross = codfilcross;
	}

	public BigDecimal getCodfilsimpfat() {
		return codfilsimpfat;
	}

	public void setCodfilsimpfat(BigDecimal codfilsimpfat) {
		this.codfilsimpfat = codfilsimpfat;
	}

	public BigDecimal getCodfilsolic() {
		return codfilsolic;
	}

	public void setCodfilsolic(BigDecimal codfilsolic) {
		this.codfilsolic = codfilsolic;
	}

	public BigDecimal getCodfiltransffat() {
		return codfiltransffat;
	}

	public void setCodfiltransffat(BigDecimal codfiltransffat) {
		this.codfiltransffat = codfiltransffat;
	}

	public String getCodfonte() {
		return codfonte;
	}

	public void setCodfonte(String codfonte) {
		this.codfonte = codfonte;
	}

	public BigDecimal getCodfunc() {
		return codfunc;
	}

	public void setCodfunc(BigDecimal codfunc) {
		this.codfunc = codfunc;
	}

	public BigDecimal getCodfunclib() {
		return codfunclib;
	}

	public void setCodfunclib(BigDecimal codfunclib) {
		this.codfunclib = codfunclib;
	}

	public String getCodjust() {
		return codjust;
	}

	public void setCodjust(String codjust) {
		this.codjust = codjust;
	}

	public BigDecimal getCodlista() {
		return codlista;
	}

	public void setCodlista(BigDecimal codlista) {
		this.codlista = codlista;
	}

	public BigDecimal getCodlistapresente() {
		return codlistapresente;
	}

	public void setCodlistapresente(BigDecimal codlistapresente) {
		this.codlistapresente = codlistapresente;
	}

	public BigDecimal getCodmensag() {
		return codmensag;
	}

	public void setCodmensag(BigDecimal codmensag) {
		this.codmensag = codmensag;
	}

	public String getCodmodal() {
		return codmodal;
	}

	public void setCodmodal(String codmodal) {
		this.codmodal = codmodal;
	}

	public String getCodmodelo() {
		return codmodelo;
	}

	public void setCodmodelo(String codmodelo) {
		this.codmodelo = codmodelo;
	}

	public BigDecimal getCodmontag() {
		return codmontag;
	}

	public void setCodmontag(BigDecimal codmontag) {
		this.codmontag = codmontag;
	}

	public BigDecimal getCodnatop() {
		return codnatop;
	}

	public void setCodnatop(BigDecimal codnatop) {
		this.codnatop = codnatop;
	}

	public BigDecimal getCodnatopcli() {
		return codnatopcli;
	}

	public void setCodnatopcli(BigDecimal codnatopcli) {
		this.codnatopcli = codnatopcli;
	}

	public BigDecimal getCodnatopcompl() {
		return codnatopcompl;
	}

	public void setCodnatopcompl(BigDecimal codnatopcompl) {
		this.codnatopcompl = codnatopcompl;
	}

	public BigDecimal getCodocorent() {
		return codocorent;
	}

	public void setCodocorent(BigDecimal codocorent) {
		this.codocorent = codocorent;
	}

	public BigDecimal getCodreserva() {
		return codreserva;
	}

	public void setCodreserva(BigDecimal codreserva) {
		this.codreserva = codreserva;
	}

	public BigDecimal getCodret() {
		return codret;
	}

	public void setCodret(BigDecimal codret) {
		this.codret = codret;
	}

	public BigDecimal getCodrota() {
		return codrota;
	}

	public void setCodrota(BigDecimal codrota) {
		this.codrota = codrota;
	}

	public BigDecimal getCodseguradora() {
		return codseguradora;
	}

	public void setCodseguradora(BigDecimal codseguradora) {
		this.codseguradora = codseguradora;
	}

	public String getCodsitcredped() {
		return codsitcredped;
	}

	public void setCodsitcredped(String codsitcredped) {
		this.codsitcredped = codsitcredped;
	}

	public BigDecimal getCodsup() {
		return codsup;
	}

	public void setCodsup(BigDecimal codsup) {
		this.codsup = codsup;
	}

	public BigDecimal getCodtransp() {
		return codtransp;
	}

	public void setCodtransp(BigDecimal codtransp) {
		this.codtransp = codtransp;
	}

	public BigDecimal getCodtranspred() {
		return codtranspred;
	}

	public void setCodtranspred(BigDecimal codtranspred) {
		this.codtranspred = codtranspred;
	}

	public BigDecimal getCodtrk() {
		return codtrk;
	}

	public void setCodtrk(BigDecimal codtrk) {
		this.codtrk = codtrk;
	}

	public BigDecimal getCodturno() {
		return codturno;
	}

	public void setCodturno(BigDecimal codturno) {
		this.codturno = codturno;
	}

	public BigDecimal getCoduser() {
		return coduser;
	}

	public void setCoduser(BigDecimal coduser) {
		this.coduser = coduser;
	}

	public BigDecimal getCoduserprzpedido() {
		return coduserprzpedido;
	}

	public void setCoduserprzpedido(BigDecimal coduserprzpedido) {
		this.coduserprzpedido = coduserprzpedido;
	}

	public BigDecimal getCoduservenda() {
		return coduservenda;
	}

	public void setCoduservenda(BigDecimal coduservenda) {
		this.coduservenda = coduservenda;
	}

	public BigDecimal getCodvendr() {
		return codvendr;
	}

	public void setCodvendr(BigDecimal codvendr) {
		this.codvendr = codvendr;
	}

	public BigDecimal getCodvendrlib() {
		return codvendrlib;
	}

	public void setCodvendrlib(BigDecimal codvendrlib) {
		this.codvendrlib = codvendrlib;
	}

	public String getCondpgto() {
		return condpgto;
	}

	public void setCondpgto(String condpgto) {
		this.condpgto = condpgto;
	}

	public String getCondpgtoori() {
		return condpgtoori;
	}

	public void setCondpgtoori(String condpgtoori) {
		this.condpgtoori = condpgtoori;
	}

	public String getCondpgtoprazo() {
		return condpgtoprazo;
	}

	public void setCondpgtoprazo(String condpgtoprazo) {
		this.condpgtoprazo = condpgtoprazo;
	}

	public String getConfrefcom() {
		return confrefcom;
	}

	public void setConfrefcom(String confrefcom) {
		this.confrefcom = confrefcom;
	}

	public String getConfrefpes() {
		return confrefpes;
	}

	public void setConfrefpes(String confrefpes) {
		this.confrefpes = confrefpes;
	}

	public String getConfsalario() {
		return confsalario;
	}

	public void setConfsalario(String confsalario) {
		this.confsalario = confsalario;
	}

	public BigDecimal getContrato() {
		return contrato;
	}

	public void setContrato(BigDecimal contrato) {
		this.contrato = contrato;
	}

	public BigDecimal getCpfaval() {
		return cpfaval;
	}

	public void setCpfaval(BigDecimal cpfaval) {
		this.cpfaval = cpfaval;
	}

	public Date getDatent() {
		return datent;
	}

	public void setDatent(Date datent) {
		this.datent = datent;
	}

	public Date getDatenvio() {
		return datenvio;
	}

	public void setDatenvio(Date datenvio) {
		this.datenvio = datenvio;
	}

	public Date getDatret() {
		return datret;
	}

	public void setDatret(Date datret) {
		this.datret = datret;
	}

	public String getDefcli() {
		return defcli;
	}

	public void setDefcli(String defcli) {
		this.defcli = defcli;
	}

	public BigDecimal getDigcontrafin() {
		return digcontrafin;
	}

	public void setDigcontrafin(BigDecimal digcontrafin) {
		this.digcontrafin = digcontrafin;
	}

	public BigDecimal getDignumautcred() {
		return dignumautcred;
	}

	public void setDignumautcred(BigDecimal dignumautcred) {
		this.dignumautcred = dignumautcred;
	}

	public Date getDtalter() {
		return dtalter;
	}

	public void setDtalter(Date dtalter) {
		this.dtalter = dtalter;
	}

	public Date getDtaprovcred() {
		return dtaprovcred;
	}

	public void setDtaprovcred(Date dtaprovcred) {
		this.dtaprovcred = dtaprovcred;
	}

	public Date getDtarq() {
		return dtarq;
	}

	public void setDtarq(Date dtarq) {
		this.dtarq = dtarq;
	}

	public Date getDtbloqueio() {
		return dtbloqueio;
	}

	public void setDtbloqueio(Date dtbloqueio) {
		this.dtbloqueio = dtbloqueio;
	}

	public Date getDtcancela() {
		return dtcancela;
	}

	public void setDtcancela(Date dtcancela) {
		this.dtcancela = dtcancela;
	}

	public Date getDtconscred() {
		return dtconscred;
	}

	public void setDtconscred(Date dtconscred) {
		this.dtconscred = dtconscred;
	}

	public Date getDtdevol() {
		return dtdevol;
	}

	public void setDtdevol(Date dtdevol) {
		this.dtdevol = dtdevol;
	}

	public Date getDtefetivacao() {
		return dtefetivacao;
	}

	public void setDtefetivacao(Date dtefetivacao) {
		this.dtefetivacao = dtefetivacao;
	}

	public Date getDtemiscont() {
		return dtemiscont;
	}

	public void setDtemiscont(Date dtemiscont) {
		this.dtemiscont = dtemiscont;
	}

	public Date getDtentrega() {
		return dtentrega;
	}

	public void setDtentrega(Date dtentrega) {
		this.dtentrega = dtentrega;
	}

	public Date getDtentregaOriginal() {
		return dtentregaOriginal;
	}

	public void setDtentregaOriginal(Date dtentregaOriginal) {
		this.dtentregaOriginal = dtentregaOriginal;
	}

	public Date getDtentregaagendada() {
		return dtentregaagendada;
	}

	public void setDtentregaagendada(Date dtentregaagendada) {
		this.dtentregaagendada = dtentregaagendada;
	}

	public Date getDtentregaprevista() {
		return dtentregaprevista;
	}

	public void setDtentregaprevista(Date dtentregaprevista) {
		this.dtentregaprevista = dtentregaprevista;
	}

	public Date getDtenvioseg() {
		return dtenvioseg;
	}

	public void setDtenvioseg(Date dtenvioseg) {
		this.dtenvioseg = dtenvioseg;
	}

	public Date getDtlibcom() {
		return dtlibcom;
	}

	public void setDtlibcom(Date dtlibcom) {
		this.dtlibcom = dtlibcom;
	}

	public Date getDtlibcre() {
		return dtlibcre;
	}

	public void setDtlibcre(Date dtlibcre) {
		this.dtlibcre = dtlibcre;
	}

	public Date getDtlibfat() {
		return dtlibfat;
	}

	public void setDtlibfat(Date dtlibfat) {
		this.dtlibfat = dtlibfat;
	}

	public Date getDtlimite() {
		return dtlimite;
	}

	public void setDtlimite(Date dtlimite) {
		this.dtlimite = dtlimite;
	}

	public Date getDtmontag() {
		return dtmontag;
	}

	public void setDtmontag(Date dtmontag) {
		this.dtmontag = dtmontag;
	}

	public Date getDtnasccli() {
		return dtnasccli;
	}

	public void setDtnasccli(Date dtnasccli) {
		this.dtnasccli = dtnasccli;
	}

	public Date getDtnotadevol() {
		return dtnotadevol;
	}

	public void setDtnotadevol(Date dtnotadevol) {
		this.dtnotadevol = dtnotadevol;
	}

	public Date getDtnotasimpfat() {
		return dtnotasimpfat;
	}

	public void setDtnotasimpfat(Date dtnotasimpfat) {
		this.dtnotasimpfat = dtnotasimpfat;
	}

	public Date getDtpagto() {
		return dtpagto;
	}

	public void setDtpagto(Date dtpagto) {
		this.dtpagto = dtpagto;
	}

	public Date getDtpedcli() {
		return dtpedcli;
	}

	public void setDtpedcli(Date dtpedcli) {
		this.dtpedcli = dtpedcli;
	}

	public Date getDtpedido() {
		return dtpedido;
	}

	public void setDtpedido(Date dtpedido) {
		this.dtpedido = dtpedido;
	}

	public Date getDtretassistec() {
		return dtretassistec;
	}

	public void setDtretassistec(Date dtretassistec) {
		this.dtretassistec = dtretassistec;
	}

	public Date getDtretorno() {
		return dtretorno;
	}

	public void setDtretorno(Date dtretorno) {
		this.dtretorno = dtretorno;
	}

	public Date getDttransffat() {
		return dttransffat;
	}

	public void setDttransffat(Date dttransffat) {
		this.dttransffat = dttransffat;
	}

	public Date getDtvalid() {
		return dtvalid;
	}

	public void setDtvalid(Date dtvalid) {
		this.dtvalid = dtvalid;
	}

	public BigDecimal getDvconta() {
		return dvconta;
	}

	public void setDvconta(BigDecimal dvconta) {
		this.dvconta = dvconta;
	}

	public String getEmusorotei() {
		return emusorotei;
	}

	public void setEmusorotei(String emusorotei) {
		this.emusorotei = emusorotei;
	}

	public String getEncomenda() {
		return encomenda;
	}

	public void setEncomenda(String encomenda) {
		this.encomenda = encomenda;
	}

	public BigDecimal getEndclient() {
		return endclient;
	}

	public void setEndclient(BigDecimal endclient) {
		this.endclient = endclient;
	}

	public BigDecimal getEndclipres() {
		return endclipres;
	}

	public void setEndclipres(BigDecimal endclipres) {
		this.endclipres = endclipres;
	}

	public BigDecimal getEndcob() {
		return endcob;
	}

	public void setEndcob(BigDecimal endcob) {
		this.endcob = endcob;
	}

	public BigDecimal getEndent() {
		return endent;
	}

	public void setEndent(BigDecimal endent) {
		this.endent = endent;
	}

	public BigDecimal getEndfat() {
		return endfat;
	}

	public void setEndfat(BigDecimal endfat) {
		this.endfat = endfat;
	}

	public BigDecimal getEndrisco() {
		return endrisco;
	}

	public void setEndrisco(BigDecimal endrisco) {
		this.endrisco = endrisco;
	}

	public String getEnvia() {
		return envia;
	}

	public void setEnvia(String envia) {
		this.envia = envia;
	}

	public String getExternalorderid() {
		return externalorderid;
	}

	public void setExternalorderid(String externalorderid) {
		this.externalorderid = externalorderid;
	}

	public BigDecimal getFilorig() {
		return filorig;
	}

	public void setFilorig(BigDecimal filorig) {
		this.filorig = filorig;
	}

	public String getFlagrupatransffat() {
		return flagrupatransffat;
	}

	public void setFlagrupatransffat(String flagrupatransffat) {
		this.flagrupatransffat = flagrupatransffat;
	}

	public String getFlaguardaestoque() {
		return flaguardaestoque;
	}

	public void setFlaguardaestoque(String flaguardaestoque) {
		this.flaguardaestoque = flaguardaestoque;
	}

	public String getFlatualiza() {
		return flatualiza;
	}

	public void setFlatualiza(String flatualiza) {
		this.flatualiza = flatualiza;
	}

	public String getFlatufuturo() {
		return flatufuturo;
	}

	public void setFlatufuturo(String flatufuturo) {
		this.flatufuturo = flatufuturo;
	}

	public String getFlatulogico() {
		return flatulogico;
	}

	public void setFlatulogico(String flatulogico) {
		this.flatulogico = flatulogico;
	}

	public String getFlbancontrato() {
		return flbancontrato;
	}

	public void setFlbancontrato(String flbancontrato) {
		this.flbancontrato = flbancontrato;
	}

	public String getFlbxestoque() {
		return flbxestoque;
	}

	public void setFlbxestoque(String flbxestoque) {
		this.flbxestoque = flbxestoque;
	}

	public String getFlbxnrserie() {
		return flbxnrserie;
	}

	public void setFlbxnrserie(String flbxnrserie) {
		this.flbxnrserie = flbxnrserie;
	}

	public String getFlcartaoespecial() {
		return flcartaoespecial;
	}

	public void setFlcartaoespecial(String flcartaoespecial) {
		this.flcartaoespecial = flcartaoespecial;
	}

	public String getFlclientedda() {
		return flclientedda;
	}

	public void setFlclientedda(String flclientedda) {
		this.flclientedda = flclientedda;
	}

	public String getFlconsfinal() {
		return flconsfinal;
	}

	public void setFlconsfinal(String flconsfinal) {
		this.flconsfinal = flconsfinal;
	}

	public String getFlcredlista() {
		return flcredlista;
	}

	public void setFlcredlista(String flcredlista) {
		this.flcredlista = flcredlista;
	}

	public String getFldescaracterizado() {
		return fldescaracterizado;
	}

	public void setFldescaracterizado(String fldescaracterizado) {
		this.fldescaracterizado = fldescaracterizado;
	}

	public String getFldestentrega() {
		return fldestentrega;
	}

	public void setFldestentrega(String fldestentrega) {
		this.fldestentrega = fldestentrega;
	}

	public String getFldevol() {
		return fldevol;
	}

	public void setFldevol(String fldevol) {
		this.fldevol = fldevol;
	}

	public String getFlentrada() {
		return flentrada;
	}

	public void setFlentrada(String flentrada) {
		this.flentrada = flentrada;
	}

	public String getFlentregaagendada() {
		return flentregaagendada;
	}

	public void setFlentregaagendada(String flentregaagendada) {
		this.flentregaagendada = flentregaagendada;
	}

	public String getFlentvar() {
		return flentvar;
	}

	public void setFlentvar(String flentvar) {
		this.flentvar = flentvar;
	}

	public String getFlenvfin() {
		return flenvfin;
	}

	public void setFlenvfin(String flenvfin) {
		this.flenvfin = flenvfin;
	}

	public String getFlenvseg() {
		return flenvseg;
	}

	public void setFlenvseg(String flenvseg) {
		this.flenvseg = flenvseg;
	}

	public String getFlestat() {
		return flestat;
	}

	public void setFlestat(String flestat) {
		this.flestat = flestat;
	}

	public String getFlestornocxa() {
		return flestornocxa;
	}

	public void setFlestornocxa(String flestornocxa) {
		this.flestornocxa = flestornocxa;
	}

	public String getFlfatcdst() {
		return flfatcdst;
	}

	public void setFlfatcdst(String flfatcdst) {
		this.flfatcdst = flfatcdst;
	}

	public String getFlfatparcial() {
		return flfatparcial;
	}

	public void setFlfatparcial(String flfatparcial) {
		this.flfatparcial = flfatparcial;
	}

	public String getFlfatura() {
		return flfatura;
	}

	public void setFlfatura(String flfatura) {
		this.flfatura = flfatura;
	}

	public String getFlfreteurg() {
		return flfreteurg;
	}

	public void setFlfreteurg(String flfreteurg) {
		this.flfreteurg = flfreteurg;
	}

	public String getFlgeracred() {
		return flgeracred;
	}

	public void setFlgeracred(String flgeracred) {
		this.flgeracred = flgeracred;
	}

	public String getFlgeranfvendacd() {
		return flgeranfvendacd;
	}

	public void setFlgeranfvendacd(String flgeranfvendacd) {
		this.flgeranfvendacd = flgeranfvendacd;
	}

	public String getFlinstalaterceiro() {
		return flinstalaterceiro;
	}

	public void setFlinstalaterceiro(String flinstalaterceiro) {
		this.flinstalaterceiro = flinstalaterceiro;
	}

	public String getFlint() {
		return flint;
	}

	public void setFlint(String flint) {
		this.flint = flint;
	}

	public String getFlintibm() {
		return flintibm;
	}

	public void setFlintibm(String flintibm) {
		this.flintibm = flintibm;
	}

	public String getFlintlibpedven() {
		return flintlibpedven;
	}

	public void setFlintlibpedven(String flintlibpedven) {
		this.flintlibpedven = flintlibpedven;
	}

	public String getFlinttms() {
		return flinttms;
	}

	public void setFlinttms(String flinttms) {
		this.flinttms = flinttms;
	}

	public String getFlipiicms() {
		return flipiicms;
	}

	public void setFlipiicms(String flipiicms) {
		this.flipiicms = flipiicms;
	}

	public String getFlipisub() {
		return flipisub;
	}

	public void setFlipisub(String flipisub) {
		this.flipisub = flipisub;
	}

	public String getFljuntapv() {
		return fljuntapv;
	}

	public void setFljuntapv(String fljuntapv) {
		this.fljuntapv = fljuntapv;
	}

	public String getFllibfat() {
		return fllibfat;
	}

	public void setFllibfat(String fllibfat) {
		this.fllibfat = fllibfat;
	}

	public String getFlmontagem() {
		return flmontagem;
	}

	public void setFlmontagem(String flmontagem) {
		this.flmontagem = flmontagem;
	}

	public String getFlmultiped() {
		return flmultiped;
	}

	public void setFlmultiped(String flmultiped) {
		this.flmultiped = flmultiped;
	}

	public String getFlnfmanual() {
		return flnfmanual;
	}

	public void setFlnfmanual(String flnfmanual) {
		this.flnfmanual = flnfmanual;
	}

	public String getFlos() {
		return flos;
	}

	public void setFlos(String flos) {
		this.flos = flos;
	}

	public String getFlosgerada() {
		return flosgerada;
	}

	public void setFlosgerada(String flosgerada) {
		this.flosgerada = flosgerada;
	}

	public String getFlpedorigem() {
		return flpedorigem;
	}

	public void setFlpedorigem(String flpedorigem) {
		this.flpedorigem = flpedorigem;
	}

	public String getFlpedtransflog() {
		return flpedtransflog;
	}

	public void setFlpedtransflog(String flpedtransflog) {
		this.flpedtransflog = flpedtransflog;
	}

	public String getFlprestamista() {
		return flprestamista;
	}

	public void setFlprestamista(String flprestamista) {
		this.flprestamista = flprestamista;
	}

	public String getFlprestconjuge() {
		return flprestconjuge;
	}

	public void setFlprestconjuge(String flprestconjuge) {
		this.flprestconjuge = flprestconjuge;
	}

	public String getFlproccdsubst() {
		return flproccdsubst;
	}

	public void setFlproccdsubst(String flproccdsubst) {
		this.flproccdsubst = flproccdsubst;
	}

	public String getFlprzpedido() {
		return flprzpedido;
	}

	public void setFlprzpedido(String flprzpedido) {
		this.flprzpedido = flprzpedido;
	}

	public String getFlrelvisita() {
		return flrelvisita;
	}

	public void setFlrelvisita(String flrelvisita) {
		this.flrelvisita = flrelvisita;
	}

	public String getFlreplica() {
		return flreplica;
	}

	public void setFlreplica(String flreplica) {
		this.flreplica = flreplica;
	}

	public String getFlretira() {
		return flretira;
	}

	public void setFlretira(String flretira) {
		this.flretira = flretira;
	}

	public String getFlricms() {
		return flricms;
	}

	public void setFlricms(String flricms) {
		this.flricms = flricms;
	}

	public String getFlroteiroy() {
		return flroteiroy;
	}

	public void setFlroteiroy(String flroteiroy) {
		this.flroteiroy = flroteiroy;
	}

	public String getFlseguro() {
		return flseguro;
	}

	public void setFlseguro(String flseguro) {
		this.flseguro = flseguro;
	}

	public String getFlsitcredlista() {
		return flsitcredlista;
	}

	public void setFlsitcredlista(String flsitcredlista) {
		this.flsitcredlista = flsitcredlista;
	}

	public String getFlsituacaoinss() {
		return flsituacaoinss;
	}

	public void setFlsituacaoinss(String flsituacaoinss) {
		this.flsituacaoinss = flsituacaoinss;
	}

	public BigDecimal getFlstatuspedpdv() {
		return flstatuspedpdv;
	}

	public void setFlstatuspedpdv(BigDecimal flstatuspedpdv) {
		this.flstatuspedpdv = flstatuspedpdv;
	}

	public String getFlsubstituto() {
		return flsubstituto;
	}

	public void setFlsubstituto(String flsubstituto) {
		this.flsubstituto = flsubstituto;
	}

	public String getFltpcli() {
		return fltpcli;
	}

	public void setFltpcli(String fltpcli) {
		this.fltpcli = fltpcli;
	}

	public String getFltpvenda() {
		return fltpvenda;
	}

	public void setFltpvenda(String fltpvenda) {
		this.fltpvenda = fltpvenda;
	}

	public String getFltransfanexoaut() {
		return fltransfanexoaut;
	}

	public void setFltransfanexoaut(String fltransfanexoaut) {
		this.fltransfanexoaut = fltransfanexoaut;
	}

	public String getFltransffatnf() {
		return fltransffatnf;
	}

	public void setFltransffatnf(String fltransffatnf) {
		this.fltransffatnf = fltransffatnf;
	}

	public String getFltransfprod() {
		return fltransfprod;
	}

	public void setFltransfprod(String fltransfprod) {
		this.fltransfprod = fltransfprod;
	}

	public String getFlutilizatecnico() {
		return flutilizatecnico;
	}

	public void setFlutilizatecnico(String flutilizatecnico) {
		this.flutilizatecnico = flutilizatecnico;
	}

	public String getFlutilpedido() {
		return flutilpedido;
	}

	public void setFlutilpedido(String flutilpedido) {
		this.flutilpedido = flutilpedido;
	}

	public String getFlverbadesc() {
		return flverbadesc;
	}

	public void setFlverbadesc(String flverbadesc) {
		this.flverbadesc = flverbadesc;
	}

	public String getGatesystem1() {
		return gatesystem1;
	}

	public void setGatesystem1(String gatesystem1) {
		this.gatesystem1 = gatesystem1;
	}

	public String getGatesystem2() {
		return gatesystem2;
	}

	public void setGatesystem2(String gatesystem2) {
		this.gatesystem2 = gatesystem2;
	}

	public String getGatesystem3() {
		return gatesystem3;
	}

	public void setGatesystem3(String gatesystem3) {
		this.gatesystem3 = gatesystem3;
	}

	public String getGuia() {
		return guia;
	}

	public void setGuia(String guia) {
		this.guia = guia;
	}

	public Date getHrcancelamento() {
		return hrcancelamento;
	}

	public void setHrcancelamento(Date hrcancelamento) {
		this.hrcancelamento = hrcancelamento;
	}

	public BigDecimal getHrduracao() {
		return hrduracao;
	}

	public void setHrduracao(BigDecimal hrduracao) {
		this.hrduracao = hrduracao;
	}

	public Date getHrentrega() {
		return hrentrega;
	}

	public void setHrentrega(Date hrentrega) {
		this.hrentrega = hrentrega;
	}

	public Date getHrlibcre() {
		return hrlibcre;
	}

	public void setHrlibcre(Date hrlibcre) {
		this.hrlibcre = hrlibcre;
	}

	public Date getHrmontag() {
		return hrmontag;
	}

	public void setHrmontag(Date hrmontag) {
		this.hrmontag = hrmontag;
	}

	public Date getHrpedido() {
		return hrpedido;
	}

	public void setHrpedido(Date hrpedido) {
		this.hrpedido = hrpedido;
	}

	public String getIdentLibcred() {
		return identLibcred;
	}

	public void setIdentLibcred(String identLibcred) {
		this.identLibcred = identLibcred;
	}

	public String getIdentproc() {
		return identproc;
	}

	public void setIdentproc(String identproc) {
		this.identproc = identproc;
	}

	public String getIntegracrc() {
		return integracrc;
	}

	public void setIntegracrc(String integracrc) {
		this.integracrc = integracrc;
	}

	public String getIntflmov() {
		return intflmov;
	}

	public void setIntflmov(String intflmov) {
		this.intflmov = intflmov;
	}

	public String getIntflnfml() {
		return intflnfml;
	}

	public void setIntflnfml(String intflnfml) {
		this.intflnfml = intflnfml;
	}

	public BigDecimal getLocal() {
		return local;
	}

	public void setLocal(BigDecimal local) {
		this.local = local;
	}

	public String getLocalsaida() {
		return localsaida;
	}

	public void setLocalsaida(String localsaida) {
		this.localsaida = localsaida;
	}

	public BigDecimal getLtcontr() {
		return ltcontr;
	}

	public void setLtcontr(BigDecimal ltcontr) {
		this.ltcontr = ltcontr;
	}

	public String getMensagemcartao() {
		return mensagemcartao;
	}

	public void setMensagemcartao(String mensagemcartao) {
		this.mensagemcartao = mensagemcartao;
	}

	public BigDecimal getMotrec() {
		return motrec;
	}

	public void setMotrec(BigDecimal motrec) {
		this.motrec = motrec;
	}

	public BigDecimal getNivellibefet() {
		return nivellibefet;
	}

	public void setNivellibefet(BigDecimal nivellibefet) {
		this.nivellibefet = nivellibefet;
	}

	public BigDecimal getNivellibprev() {
		return nivellibprev;
	}

	public void setNivellibprev(BigDecimal nivellibprev) {
		this.nivellibprev = nivellibprev;
	}

	public String getNmger() {
		return nmger;
	}

	public void setNmger(String nmger) {
		this.nmger = nmger;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomearq() {
		return nomearq;
	}

	public void setNomearq(String nomearq) {
		this.nomearq = nomearq;
	}

	public String getNomeaval() {
		return nomeaval;
	}

	public void setNomeaval(String nomeaval) {
		this.nomeaval = nomeaval;
	}

	public BigDecimal getNpedcli() {
		return npedcli;
	}

	public void setNpedcli(BigDecimal npedcli) {
		this.npedcli = npedcli;
	}

	public String getNpedcliint() {
		return npedcliint;
	}

	public void setNpedcliint(String npedcliint) {
		this.npedcliint = npedcliint;
	}

	public BigDecimal getNrcancdev() {
		return nrcancdev;
	}

	public void setNrcancdev(BigDecimal nrcancdev) {
		this.nrcancdev = nrcancdev;
	}

	public BigDecimal getNrvolume() {
		return nrvolume;
	}

	public void setNrvolume(BigDecimal nrvolume) {
		this.nrvolume = nrvolume;
	}

	public BigDecimal getNumajudantes() {
		return numajudantes;
	}

	public void setNumajudantes(BigDecimal numajudantes) {
		this.numajudantes = numajudantes;
	}

	public BigDecimal getNumautcred() {
		return numautcred;
	}

	public void setNumautcred(BigDecimal numautcred) {
		this.numautcred = numautcred;
	}

	public String getNumcartao() {
		return numcartao;
	}

	public void setNumcartao(String numcartao) {
		this.numcartao = numcartao;
	}

	public BigDecimal getNumcontra() {
		return numcontra;
	}

	public void setNumcontra(BigDecimal numcontra) {
		this.numcontra = numcontra;
	}

	public BigDecimal getNumcontrafin() {
		return numcontrafin;
	}

	public void setNumcontrafin(BigDecimal numcontrafin) {
		this.numcontrafin = numcontrafin;
	}

	public String getNumcontraseg() {
		return numcontraseg;
	}

	public void setNumcontraseg(String numcontraseg) {
		this.numcontraseg = numcontraseg;
	}

	public BigDecimal getNumcotacons() {
		return numcotacons;
	}

	public void setNumcotacons(BigDecimal numcotacons) {
		this.numcotacons = numcotacons;
	}

	public BigDecimal getNumcxa() {
		return numcxa;
	}

	public void setNumcxa(BigDecimal numcxa) {
		this.numcxa = numcxa;
	}

	public BigDecimal getNumdav() {
		return numdav;
	}

	public void setNumdav(BigDecimal numdav) {
		this.numdav = numdav;
	}

	public BigDecimal getNumgrupocons() {
		return numgrupocons;
	}

	public void setNumgrupocons(BigDecimal numgrupocons) {
		this.numgrupocons = numgrupocons;
	}

	public BigDecimal getNumlote() {
		return numlote;
	}

	public void setNumlote(BigDecimal numlote) {
		this.numlote = numlote;
	}

	public BigDecimal getNumnotadevol() {
		return numnotadevol;
	}

	public void setNumnotadevol(BigDecimal numnotadevol) {
		this.numnotadevol = numnotadevol;
	}

	public BigDecimal getNumnotaent() {
		return numnotaent;
	}

	public void setNumnotaent(BigDecimal numnotaent) {
		this.numnotaent = numnotaent;
	}

	public BigDecimal getNumnotasimpfat() {
		return numnotasimpfat;
	}

	public void setNumnotasimpfat(BigDecimal numnotasimpfat) {
		this.numnotasimpfat = numnotasimpfat;
	}

	public String getNumpedcli() {
		return numpedcli;
	}

	public void setNumpedcli(String numpedcli) {
		this.numpedcli = numpedcli;
	}

	public String getNumpedcomcli() {
		return numpedcomcli;
	}

	public void setNumpedcomcli(String numpedcomcli) {
		this.numpedcomcli = numpedcomcli;
	}

	public BigDecimal getNumpedprinc() {
		return numpedprinc;
	}

	public void setNumpedprinc(BigDecimal numpedprinc) {
		this.numpedprinc = numpedprinc;
	}

	public BigDecimal getNumpedprincsite() {
		return numpedprincsite;
	}

	public void setNumpedprincsite(BigDecimal numpedprincsite) {
		this.numpedprincsite = numpedprincsite;
	}

	public BigDecimal getNumpedsolic() {
		return numpedsolic;
	}

	public void setNumpedsolic(BigDecimal numpedsolic) {
		this.numpedsolic = numpedsolic;
	}

	public String getNumpedvenclisite() {
		return numpedvenclisite;
	}

	public void setNumpedvenclisite(String numpedvenclisite) {
		this.numpedvenclisite = numpedvenclisite;
	}

	public BigDecimal getNumpedvensite() {
		return numpedvensite;
	}

	public void setNumpedvensite(BigDecimal numpedvensite) {
		this.numpedvensite = numpedvensite;
	}

	public BigDecimal getNumppfpremio() {
		return numppfpremio;
	}

	public void setNumppfpremio(BigDecimal numppfpremio) {
		this.numppfpremio = numppfpremio;
	}

	public BigDecimal getNumpreped() {
		return numpreped;
	}

	public void setNumpreped(BigDecimal numpreped) {
		this.numpreped = numpreped;
	}

	public BigDecimal getNumprepedven() {
		return numprepedven;
	}

	public void setNumprepedven(BigDecimal numprepedven) {
		this.numprepedven = numprepedven;
	}

	public BigDecimal getNumpvpaf() {
		return numpvpaf;
	}

	public void setNumpvpaf(BigDecimal numpvpaf) {
		this.numpvpaf = numpvpaf;
	}

	public BigDecimal getNumrecdevol() {
		return numrecdevol;
	}

	public void setNumrecdevol(BigDecimal numrecdevol) {
		this.numrecdevol = numrecdevol;
	}

	public BigDecimal getNumreserva() {
		return numreserva;
	}

	public void setNumreserva(BigDecimal numreserva) {
		this.numreserva = numreserva;
	}

	public String getNumtabpreco() {
		return numtabpreco;
	}

	public void setNumtabpreco(String numtabpreco) {
		this.numtabpreco = numtabpreco;
	}

	public BigDecimal getNumvenda() {
		return numvenda;
	}

	public void setNumvenda(BigDecimal numvenda) {
		this.numvenda = numvenda;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getObsavalista() {
		return obsavalista;
	}

	public void setObsavalista(String obsavalista) {
		this.obsavalista = obsavalista;
	}

	public String getObsavs() {
		return obsavs;
	}

	public void setObsavs(String obsavs) {
		this.obsavs = obsavs;
	}

	public String getObscre() {
		return obscre;
	}

	public void setObscre(String obscre) {
		this.obscre = obscre;
	}

	public String getObsdevol() {
		return obsdevol;
	}

	public void setObsdevol(String obsdevol) {
		this.obsdevol = obsdevol;
	}

	public String getObsvendr() {
		return obsvendr;
	}

	public void setObsvendr(String obsvendr) {
		this.obsvendr = obsvendr;
	}

	public BigDecimal getOpelibcom() {
		return opelibcom;
	}

	public void setOpelibcom(BigDecimal opelibcom) {
		this.opelibcom = opelibcom;
	}

	public BigDecimal getOpelibcre() {
		return opelibcre;
	}

	public void setOpelibcre(BigDecimal opelibcre) {
		this.opelibcre = opelibcre;
	}

	public BigDecimal getOrdemprdlib() {
		return ordemprdlib;
	}

	public void setOrdemprdlib(BigDecimal ordemprdlib) {
		this.ordemprdlib = ordemprdlib;
	}

	public BigDecimal getOrigem() {
		return origem;
	}

	public void setOrigem(BigDecimal origem) {
		this.origem = origem;
	}

	public String getPgtblq() {
		return pgtblq;
	}

	public void setPgtblq(String pgtblq) {
		this.pgtblq = pgtblq;
	}

	public BigDecimal getPjuros() {
		return pjuros;
	}

	public void setPjuros(BigDecimal pjuros) {
		this.pjuros = pjuros;
	}

	public BigDecimal getPjurosori() {
		return pjurosori;
	}

	public void setPjurosori(BigDecimal pjurosori) {
		this.pjurosori = pjurosori;
	}

	public BigDecimal getPmargrent() {
		return pmargrent;
	}

	public void setPmargrent(BigDecimal pmargrent) {
		this.pmargrent = pmargrent;
	}

	public BigDecimal getPraca() {
		return praca;
	}

	public void setPraca(BigDecimal praca) {
		this.praca = praca;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public String getProgCanc() {
		return progCanc;
	}

	public void setProgCanc(String progCanc) {
		this.progCanc = progCanc;
	}

	public BigDecimal getQtprc() {
		return qtprc;
	}

	public void setQtprc(BigDecimal qtprc) {
		this.qtprc = qtprc;
	}

	public BigDecimal getRebate() {
		return rebate;
	}

	public void setRebate(BigDecimal rebate) {
		this.rebate = rebate;
	}

	public BigDecimal getRebateori() {
		return rebateori;
	}

	public void setRebateori(BigDecimal rebateori) {
		this.rebateori = rebateori;
	}

	public BigDecimal getRedutorbaseicms() {
		return redutorbaseicms;
	}

	public void setRedutorbaseicms(BigDecimal redutorbaseicms) {
		this.redutorbaseicms = redutorbaseicms;
	}

	public BigDecimal getRegracreditscore() {
		return regracreditscore;
	}

	public void setRegracreditscore(BigDecimal regracreditscore) {
		this.regracreditscore = regracreditscore;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getRespexterno() {
		return respexterno;
	}

	public void setRespexterno(String respexterno) {
		this.respexterno = respexterno;
	}

	public String getRespinterno() {
		return respinterno;
	}

	public void setRespinterno(String respinterno) {
		this.respinterno = respinterno;
	}

	public String getRestbanc() {
		return restbanc;
	}

	public void setRestbanc(String restbanc) {
		this.restbanc = restbanc;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public BigDecimal getSeqarq() {
		return seqarq;
	}

	public void setSeqarq(BigDecimal seqarq) {
		this.seqarq = seqarq;
	}

	public BigDecimal getSeqconta() {
		return seqconta;
	}

	public void setSeqconta(BigDecimal seqconta) {
		this.seqconta = seqconta;
	}

	public BigDecimal getSeqsubpraca() {
		return seqsubpraca;
	}

	public void setSeqsubpraca(BigDecimal seqsubpraca) {
		this.seqsubpraca = seqsubpraca;
	}

	public String getSeriecontrafin() {
		return seriecontrafin;
	}

	public void setSeriecontrafin(String seriecontrafin) {
		this.seriecontrafin = seriecontrafin;
	}

	public String getSeriedevol() {
		return seriedevol;
	}

	public void setSeriedevol(String seriedevol) {
		this.seriedevol = seriedevol;
	}

	public String getSerieent() {
		return serieent;
	}

	public void setSerieent(String serieent) {
		this.serieent = serieent;
	}

	public String getSeriesimpfat() {
		return seriesimpfat;
	}

	public void setSeriesimpfat(String seriesimpfat) {
		this.seriesimpfat = seriesimpfat;
	}

	public BigDecimal getSetor() {
		return setor;
	}

	public void setSetor(BigDecimal setor) {
		this.setor = setor;
	}

	public BigDecimal getSitcarga() {
		return sitcarga;
	}

	public void setSitcarga(BigDecimal sitcarga) {
		this.sitcarga = sitcarga;
	}

	public BigDecimal getSitenc() {
		return sitenc;
	}

	public void setSitenc(BigDecimal sitenc) {
		this.sitenc = sitenc;
	}

	public BigDecimal getSituatef() {
		return situatef;
	}

	public void setSituatef(BigDecimal situatef) {
		this.situatef = situatef;
	}

	public String getSpc() {
		return spc;
	}

	public void setSpc(String spc) {
		this.spc = spc;
	}

	public BigDecimal getStatus() {
		return status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	public BigDecimal getStatusavs() {
		return statusavs;
	}

	public void setStatusavs(BigDecimal statusavs) {
		this.statusavs = statusavs;
	}

	public BigDecimal getStatusppf() {
		return statusppf;
	}

	public void setStatusppf(BigDecimal statusppf) {
		this.statusppf = statusppf;
	}

	public BigDecimal getStatusppfpremio() {
		return statusppfpremio;
	}

	public void setStatusppfpremio(BigDecimal statusppfpremio) {
		this.statusppfpremio = statusppfpremio;
	}

	public BigDecimal getStatusrotei() {
		return statusrotei;
	}

	public void setStatusrotei(BigDecimal statusrotei) {
		this.statusrotei = statusrotei;
	}

	public BigDecimal getSttrans() {
		return sttrans;
	}

	public void setSttrans(BigDecimal sttrans) {
		this.sttrans = sttrans;
	}

	public BigDecimal getSubpraca() {
		return subpraca;
	}

	public void setSubpraca(BigDecimal subpraca) {
		this.subpraca = subpraca;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTempconta() {
		return tempconta;
	}

	public void setTempconta(String tempconta) {
		this.tempconta = tempconta;
	}
	
	public BigDecimal getTipopedsolic() {
		return tipopedsolic;
	}

	public void setTipopedsolic(BigDecimal tipopedsolic) {
		this.tipopedsolic = tipopedsolic;
	}

	public BigDecimal getTotcupompromocional() {
		return totcupompromocional;
	}

	public void setTotcupompromocional(BigDecimal totcupompromocional) {
		this.totcupompromocional = totcupompromocional;
	}

	public String getTpcontrato() {
		return tpcontrato;
	}

	public void setTpcontrato(String tpcontrato) {
		this.tpcontrato = tpcontrato;
	}

	public BigDecimal getTpfrete() {
		return tpfrete;
	}

	public void setTpfrete(BigDecimal tpfrete) {
		this.tpfrete = tpfrete;
	}

	public BigDecimal getTpfunclibefet() {
		return tpfunclibefet;
	}

	public void setTpfunclibefet(BigDecimal tpfunclibefet) {
		this.tpfunclibefet = tpfunclibefet;
	}

	public BigDecimal getTpfunclibprev() {
		return tpfunclibprev;
	}

	public void setTpfunclibprev(BigDecimal tpfunclibprev) {
		this.tpfunclibprev = tpfunclibprev;
	}

	public String getTpmultidevol() {
		return tpmultidevol;
	}

	public void setTpmultidevol(String tpmultidevol) {
		this.tpmultidevol = tpmultidevol;
	}

	public BigDecimal getTpnota() {
		return tpnota;
	}

	public void setTpnota(BigDecimal tpnota) {
		this.tpnota = tpnota;
	}

	public String getTpnotaent() {
		return tpnotaent;
	}

	public void setTpnotaent(String tpnotaent) {
		this.tpnotaent = tpnotaent;
	}

	public BigDecimal getTpnotasimpfat() {
		return tpnotasimpfat;
	}

	public void setTpnotasimpfat(BigDecimal tpnotasimpfat) {
		this.tpnotasimpfat = tpnotasimpfat;
	}

	public String getTporigped() {
		return tporigped;
	}

	public void setTporigped(String tporigped) {
		this.tporigped = tporigped;
	}

	public String getTpped() {
		return tpped;
	}

	public void setTpped(String tpped) {
		this.tpped = tpped;
	}

	public String getTurnoagendado() {
		return turnoagendado;
	}

	public void setTurnoagendado(String turnoagendado) {
		this.turnoagendado = turnoagendado;
	}

	public String getTurnoentr() {
		return turnoentr;
	}

	public void setTurnoentr(String turnoentr) {
		this.turnoentr = turnoentr;
	}

	public String getUseridLibforma() {
		return useridLibforma;
	}

	public void setUseridLibforma(String useridLibforma) {
		this.useridLibforma = useridLibforma;
	}

	public BigDecimal getVlacrecdesctot() {
		return vlacrecdesctot;
	}

	public void setVlacrecdesctot(BigDecimal vlacrecdesctot) {
		this.vlacrecdesctot = vlacrecdesctot;
	}

	public BigDecimal getVlbaseicms() {
		return vlbaseicms;
	}

	public void setVlbaseicms(BigDecimal vlbaseicms) {
		this.vlbaseicms = vlbaseicms;
	}

	public BigDecimal getVlbaseicmsf() {
		return vlbaseicmsf;
	}

	public void setVlbaseicmsf(BigDecimal vlbaseicmsf) {
		this.vlbaseicmsf = vlbaseicmsf;
	}

	public BigDecimal getVlbaseicmssub() {
		return vlbaseicmssub;
	}

	public void setVlbaseicmssub(BigDecimal vlbaseicmssub) {
		this.vlbaseicmssub = vlbaseicmssub;
	}

	public BigDecimal getVlbaseipi() {
		return vlbaseipi;
	}

	public void setVlbaseipi(BigDecimal vlbaseipi) {
		this.vlbaseipi = vlbaseipi;
	}

	public BigDecimal getVldescfrete() {
		return vldescfrete;
	}

	public void setVldescfrete(BigDecimal vldescfrete) {
		this.vldescfrete = vldescfrete;
	}

	public BigDecimal getVldesconto() {
		return vldesconto;
	}

	public void setVldesconto(BigDecimal vldesconto) {
		this.vldesconto = vldesconto;
	}

	public BigDecimal getVldescontoconju() {
		return vldescontoconju;
	}

	public void setVldescontoconju(BigDecimal vldescontoconju) {
		this.vldescontoconju = vldescontoconju;
	}

	public BigDecimal getVldespaces() {
		return vldespaces;
	}

	public void setVldespaces(BigDecimal vldespaces) {
		this.vldespaces = vldespaces;
	}

	public BigDecimal getVldespfin() {
		return vldespfin;
	}

	public void setVldespfin(BigDecimal vldespfin) {
		this.vldespfin = vldespfin;
	}

	public BigDecimal getVlentrada() {
		return vlentrada;
	}

	public void setVlentrada(BigDecimal vlentrada) {
		this.vlentrada = vlentrada;
	}

	public BigDecimal getVlfrete() {
		return vlfrete;
	}

	public void setVlfrete(BigDecimal vlfrete) {
		this.vlfrete = vlfrete;
	}

	public BigDecimal getVlfreteorig() {
		return vlfreteorig;
	}

	public void setVlfreteorig(BigDecimal vlfreteorig) {
		this.vlfreteorig = vlfreteorig;
	}

	public BigDecimal getVlfreteterceiro() {
		return vlfreteterceiro;
	}

	public void setVlfreteterceiro(BigDecimal vlfreteterceiro) {
		this.vlfreteterceiro = vlfreteterceiro;
	}

	public BigDecimal getVlicm() {
		return vlicm;
	}

	public void setVlicm(BigDecimal vlicm) {
		this.vlicm = vlicm;
	}

	public BigDecimal getVlicmret() {
		return vlicmret;
	}

	public void setVlicmret(BigDecimal vlicmret) {
		this.vlicmret = vlicmret;
	}

	public BigDecimal getVlii() {
		return vlii;
	}

	public void setVlii(BigDecimal vlii) {
		this.vlii = vlii;
	}

	public BigDecimal getVliof() {
		return vliof;
	}

	public void setVliof(BigDecimal vliof) {
		this.vliof = vliof;
	}

	public BigDecimal getVlirrf() {
		return vlirrf;
	}

	public void setVlirrf(BigDecimal vlirrf) {
		this.vlirrf = vlirrf;
	}

	public BigDecimal getVlisento() {
		return vlisento;
	}

	public void setVlisento(BigDecimal vlisento) {
		this.vlisento = vlisento;
	}

	public BigDecimal getVljuros() {
		return vljuros;
	}

	public void setVljuros(BigDecimal vljuros) {
		this.vljuros = vljuros;
	}

	public BigDecimal getVljurosfin() {
		return vljurosfin;
	}

	public void setVljurosfin(BigDecimal vljurosfin) {
		this.vljurosfin = vljurosfin;
	}

	public BigDecimal getVlmercad() {
		return vlmercad;
	}

	public void setVlmercad(BigDecimal vlmercad) {
		this.vlmercad = vlmercad;
	}

	public BigDecimal getVlmontagem() {
		return vlmontagem;
	}

	public void setVlmontagem(BigDecimal vlmontagem) {
		this.vlmontagem = vlmontagem;
	}

	public BigDecimal getVlmontagorig() {
		return vlmontagorig;
	}

	public void setVlmontagorig(BigDecimal vlmontagorig) {
		this.vlmontagorig = vlmontagorig;
	}

	public BigDecimal getVloutdesp() {
		return vloutdesp;
	}

	public void setVloutdesp(BigDecimal vloutdesp) {
		this.vloutdesp = vloutdesp;
	}

	public BigDecimal getVloutras() {
		return vloutras;
	}

	public void setVloutras(BigDecimal vloutras) {
		this.vloutras = vloutras;
	}

	public BigDecimal getVlpiscofinscsll() {
		return vlpiscofinscsll;
	}

	public void setVlpiscofinscsll(BigDecimal vlpiscofinscsll) {
		this.vlpiscofinscsll = vlpiscofinscsll;
	}

	public BigDecimal getVlprc() {
		return vlprc;
	}

	public void setVlprc(BigDecimal vlprc) {
		this.vlprc = vlprc;
	}

	public BigDecimal getVlrebate() {
		return vlrebate;
	}

	public void setVlrebate(BigDecimal vlrebate) {
		this.vlrebate = vlrebate;
	}

	public BigDecimal getVlseguro() {
		return vlseguro;
	}

	public void setVlseguro(BigDecimal vlseguro) {
		this.vlseguro = vlseguro;
	}

	public BigDecimal getVltac() {
		return vltac;
	}

	public void setVltac(BigDecimal vltac) {
		this.vltac = vltac;
	}

	public BigDecimal getVltarbancaria() {
		return vltarbancaria;
	}

	public void setVltarbancaria(BigDecimal vltarbancaria) {
		this.vltarbancaria = vltarbancaria;
	}

	public BigDecimal getVltotal() {
		return vltotal;
	}

	public void setVltotal(BigDecimal vltotal) {
		this.vltotal = vltotal;
	}

	public BigDecimal getVltotalind() {
		return vltotalind;
	}

	public void setVltotalind(BigDecimal vltotalind) {
		this.vltotalind = vltotalind;
	}

	public BigDecimal getVltotcomissup() {
		return vltotcomissup;
	}

	public void setVltotcomissup(BigDecimal vltotcomissup) {
		this.vltotcomissup = vltotcomissup;
	}

	public BigDecimal getVltotcomisvend() {
		return vltotcomisvend;
	}

	public void setVltotcomisvend(BigDecimal vltotcomisvend) {
		this.vltotcomisvend = vltotcomisvend;
	}

	public BigDecimal getVltotitemacum() {
		return vltotitemacum;
	}

	public void setVltotitemacum(BigDecimal vltotitemacum) {
		this.vltotitemacum = vltotitemacum;
	}

	public BigDecimal getVltxboleto() {
		return vltxboleto;
	}

	public void setVltxboleto(BigDecimal vltxboleto) {
		this.vltxboleto = vltxboleto;
	}

	public BigDecimal getVlvdliq() {
		return vlvdliq;
	}

	public void setVlvdliq(BigDecimal vlvdliq) {
		this.vlvdliq = vlvdliq;
	}

	public BigDecimal getVlvdvista() {
		return vlvdvista;
	}

	public void setVlvdvista(BigDecimal vlvdvista) {
		this.vlvdvista = vlvdvista;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public MovPedidoPK getId() {
		return id;
	}

	public void setId(MovPedidoPK id) {
		this.id = id;
	}

}
