package it.gestrap.entita;
// Generated 30 giu 2020, 16:48:26 by Hibernate Tools 5.1.10.Final

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

/**
 * Profilo generated by hbm2java
 */

@Entity
@Table(name = "profilo", catalog = "gestionerapportini")
public class Profilo implements java.io.Serializable {

	private Integer id;
	private String profilo;
	private Set<Dipendenti> dipendentis = new HashSet<Dipendenti>(0);

	public Profilo() {
	}

	public Profilo(String profilo) {
		this.profilo = profilo;
	}

	public Profilo(String profilo, Set<Dipendenti> dipendentis) {
		this.profilo = profilo;
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

	@Column(name = "profilo", nullable = false, length = 20)
	public String getProfilo() {
		return this.profilo;
	}

	public void setProfilo(String profilo) {
		this.profilo = profilo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "profilo")
	public Set<Dipendenti> getDipendentis() {
		return this.dipendentis;
	}

	public void setDipendentis(Set<Dipendenti> dipendentis) {
		this.dipendentis = dipendentis;
	}

}
