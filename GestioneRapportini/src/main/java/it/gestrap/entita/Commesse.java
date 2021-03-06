package it.gestrap.entita;
// Generated 30 giu 2020, 16:48:26 by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Commesse generated by hbm2java
 */
@Entity
@Table(name = "commesse", catalog = "gestionerapportini", uniqueConstraints = @UniqueConstraint(columnNames = "codcommessa"))
public class Commesse implements java.io.Serializable {

	private Integer id;
	private Clienti clienti;
	private TipoCommesse tipocommesse;
	private String codcommessa;
	private String descrizione;
	private Date datainserimento;
	private int ngiorni;
	private int tariffa;
	private int importo;
	private BigDecimal sconto;
	private Set<Rapportini> rapportinis = new HashSet<Rapportini>(0);
	private Set<Comdip> comdips = new HashSet<Comdip>(0);

	public Commesse() {
	}

	public Commesse(Clienti clienti, TipoCommesse tipocommesse, String codcommessa, Date datainserimento, int ngiorni,
			int tariffa, int importo) {
		this.clienti = clienti;
		this.tipocommesse = tipocommesse;
		this.codcommessa = codcommessa;
		this.datainserimento = datainserimento;
		this.ngiorni = ngiorni;
		this.tariffa = tariffa;
		this.importo = importo;
	}

	public Commesse(Clienti clienti, TipoCommesse tipocommesse, String codcommessa, String descrizione,
			Date datainserimento, int ngiorni, int tariffa, int importo, BigDecimal sconto, Set<Rapportini> rapportinis,
			Set<Comdip> comdips) {
		this.clienti = clienti;
		this.tipocommesse = tipocommesse;
		this.codcommessa = codcommessa;
		this.descrizione = descrizione;
		this.datainserimento = datainserimento;
		this.ngiorni = ngiorni;
		this.tariffa = tariffa;
		this.importo = importo;
		this.sconto = sconto;
		this.rapportinis = rapportinis;
		this.comdips = comdips;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idclienti", nullable = false)
	public Clienti getClienti() {
		return this.clienti;
	}

	public void setClienti(Clienti clienti) {
		this.clienti = clienti;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtipocommessa", nullable = false)
	public TipoCommesse getTipocommesse() {
		return this.tipocommesse;
	}

	public void setTipocommesse(TipoCommesse tipocommesse) {
		this.tipocommesse = tipocommesse;
	}

	@Column(name = "codcommessa", unique = true, nullable = false, length = 10)
	public String getCodcommessa() {
		return this.codcommessa;
	}

	public void setCodcommessa(String codcommessa) {
		this.codcommessa = codcommessa;
	}

	@Column(name = "descrizione", length = 45)
	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datainserimento", nullable = false, length = 10)
	public Date getDatainserimento() {
		return this.datainserimento;
	}

	public void setDatainserimento(Date datainserimento) {
		this.datainserimento = datainserimento;
	}

	@Column(name = "ngiorni", nullable = false)
	public int getNgiorni() {
		return this.ngiorni;
	}

	public void setNgiorni(int ngiorni) {
		this.ngiorni = ngiorni;
	}

	@Column(name = "tariffa", nullable = false)
	public int getTariffa() {
		return this.tariffa;
	}

	public void setTariffa(int tariffa) {
		this.tariffa = tariffa;
	}

	@Column(name = "importo", nullable = false)
	public int getImporto() {
		return this.importo;
	}

	public void setImporto(int importo) {
		this.importo = importo;
	}

	@Column(name = "sconto", precision = 2)
	public BigDecimal getSconto() {
		return this.sconto;
	}

	public void setSconto(BigDecimal sconto) {
		this.sconto = sconto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "commesse")
	public Set<Rapportini> getRapportinis() {
		return this.rapportinis;
	}

	public void setRapportinis(Set<Rapportini> rapportinis) {
		this.rapportinis = rapportinis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "commesse")
	public Set<Comdip> getComdips() {
		return this.comdips;
	}

	public void setComdips(Set<Comdip> comdips) {
		this.comdips = comdips;
	}

}
