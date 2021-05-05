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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@NamedQueries({
	@NamedQuery(name = "Game.findAllGames", 
			query="SELECT g FROM Game g"),
	 @NamedQuery(name="Game.generateID()",
	 		query= "SELECT gameID FROM Game ORDER BY gameID DESC"),
})
@Table(name = "Game")
public class Game implements Serializable {

	private static final long serialVersionUID = 1L;
	private String gameID;
	private int round;
	private Set<Team> teams;
	private Tournament tournament;
	private int version;
	
	@Id
	@Column(name = "gameID")
	public String getGameID() {
		return gameID;
	}
	public void setGameID(String gameID) {
		this.gameID = gameID;
	}
	@Column(name = "round")
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}

	@ManyToOne
	@JoinColumn(name = "tournamentID", referencedColumnName="tournamentID")
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
	@Version
	@Column(name = "version")
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)  
	@JoinTable(name="GameTeam",
		joinColumns= 
				@JoinColumn(name="gameID",
				referencedColumnName="gameID"),
			 inverseJoinColumns= 
					 @JoinColumn(name="team",
								referencedColumnName="teamID"))
	public Set<Team> getTeams() {
		return teams;
	}
	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}
}
