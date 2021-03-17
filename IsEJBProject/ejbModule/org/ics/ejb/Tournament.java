package org.ics.ejb;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Tournament")
public class Tournament implements Serializable {

	private String tournamentID;
	private String tournamentName;
	private String sport;
	
	private List<TournamentTeam> tournamentTeam;
	

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

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "tournament")
	public List<TournamentTeam> getTournamentTeam() {
		return tournamentTeam;
	}

	public void setTournamentTeam(List<TournamentTeam> tournamentTeam) {
		this.tournamentTeam = tournamentTeam;
	}
	
	
}
