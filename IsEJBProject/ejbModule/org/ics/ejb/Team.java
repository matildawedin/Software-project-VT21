package org.ics.ejb;

import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.*;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@NamedQueries({
	@NamedQuery(name = "Team.findAllTeams()",
			query="SELECT t FROM Team t"),
	 @NamedQuery(name="Team.generateID()",
query= "SELECT teamID FROM Team"),
})
@Table(name = "Team")

public class Team implements Serializable{
	
	private String teamID;
	private String teamName;
	private Set<Tournament> tournaments;
	
	
	@Id
	@Column(name = "teamID")
	public String getTeamID() {
		return teamID;
	}
	public void setTeamID(String teamID)	{
		this.teamID= teamID;
	}

	@Column(name = "teamName")
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="TournamentTeam",
		joinColumns= 
				@JoinColumn(name="teamID",
				referencedColumnName="teamID"),
			inverseJoinColumns= 
					@JoinColumn(name="tournamentID",
					referencedColumnName="tournamentID"))
	public Set<Tournament> getTournaments() {
		return tournaments;
	}
	public void setTournaments(Set<Tournament> tournaments) {
		this.tournaments = tournaments;
	}


	
}
