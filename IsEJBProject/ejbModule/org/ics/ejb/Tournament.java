package org.ics.ejb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({@NamedQuery(name = "Tournament.findAllTournaments", query="SELECT t FROM Tournament t")})
@Table(name = "Tournament")
public class Tournament implements Serializable {

	private String tournamentID;
	private String tournamentName;
	private String sport;
	
	

	@Id
	@Column(name = "tournamentID")
	public String getTournamentID() {
		return tournamentID;
	}

	public void setTournamentID(String tournamentID) {
		this.tournamentID = tournamentID;
	}

	@Column(name = "tournamentName")
	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	@Column(name = "sport")
	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
}
