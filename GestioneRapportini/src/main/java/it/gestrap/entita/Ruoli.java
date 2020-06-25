package it.gestrap.entita;
// Generated 23 giu 2020, 22:40:43 by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Ruoli generated by hbm2java
 */
@Entity
@Table(name = "ruoli", catalog = "gestionerapportini", uniqueConstraints = @UniqueConstraint(columnNames = "acronimo"))
public class Ruoli implements java.io.Serializable {

	private Integer id;
	private String acronimo;
	private String descrizione;
	private Set<Dipendenti> dipendentis = new HashSet<Dipendenti>(0);

	public Ruoli() {
	}

	public Ruoli(String acronimo, String descrizione) {
		this.acronimo = acronimo;
		this.descrizione = descrizione;
	}

	public Ruoli(String acronimo, String descrizione, Set<Dipendenti> dipendentis) {
		this.acronimo = acronimo;
		this.descrizione = descrizione;
		this.dipendentis = dipendentis;
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

	@Column(name = "acronimo", unique = true, nullable = false, length = 7)
	public String getAcronimo() {
		return this.acronimo;
	}

	public void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	@Column(name = "descrizione", nullable = false, length = 30)
	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ruoli")
	public Set<Dipendenti> getDipendentis() {
		return this.dipendentis;
	}

	public void setDipendentis(Set<Dipendenti> dipendentis) {
		this.dipendentis = dipendentis;
	}

}
