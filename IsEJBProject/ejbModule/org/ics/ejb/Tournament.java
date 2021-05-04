package org.ics.ejb;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@NamedQueries({
	@NamedQuery(name = "Tournament.findAllTournaments", 
			query="SELECT t FROM Tournament t"),
	 @NamedQuery(name="Tournament.generateID()",
	 		query= "SELECT tournamentID FROM Tournament ORDER BY tournamentID DESC"),
})
@Table(name = "Tournament")
public class Tournament implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tournamentID;
	private String tournamentName;
	private String sport;
	private Set<Team> teams;
	private Set<Game> games;
	private int version;
	
	public Tournament (String tournamentID, String tournamentName, String sport) {
		this.tournamentID = tournamentID;
		this.tournamentName = tournamentName;
		this.sport = sport;
	}
	public Tournament () {
	}
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

	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)  
	@JoinTable(name="TournamentTeam",
		joinColumns= 
				@JoinColumn(name="tournamentID",
				referencedColumnName="tournamentID"),
			inverseJoinColumns= 
					@JoinColumn(name="teamID",
					referencedColumnName="teamID"))
	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}
	
	@Version
	@Column(name = "version")
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	} 

	@OneToMany(mappedBy = "tournament", fetch=FetchType.EAGER)
	public Set<Game> getGames() {
		return games;
	}

	public void setGames(Set<Game> games) {
		this.games = games;
	}

}
