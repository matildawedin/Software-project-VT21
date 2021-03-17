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
@Table(name = "Team")
public class Team implements Serializable{
	
	private String teamID;
	private String teamName;
	
	private List<TournamentTeam> tournamentTeam;

	@Id
	@Column(name = "teamID")
	public String getTeamID() {
		return teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	@Column(name = "teamName")
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "team")  //behövs fetchType??
	public List<TournamentTeam> getTournamentTeam() {
		return tournamentTeam;
	}

	public void setTournamentTeam(List<TournamentTeam> tournamentTeam) {
		this.tournamentTeam = tournamentTeam;
	}
	

	
}
