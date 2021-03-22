package org.ics.ejb;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({@NamedQuery(name = "Tournament.findAllTournaments", query="SELECT t FROM Tournament t")})
@Table(name = "Tournament")
public class Tournament implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tournamentID;
	private String tournamentName;
	private String sport;
	private Set<Team> teams;
	
	

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

	@ManyToMany(fetch = FetchType.EAGER, mappedBy="tournaments")
	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}
}
