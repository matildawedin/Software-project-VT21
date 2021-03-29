package org.ics.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
	private String participantOne;
	private String participantTwo;
	private String tournamentID;
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
	@Column(name = "participantOne")
	public String getParticipantOne() {
		return participantOne;
	}
	public void setParticipantOne(String participantOne) {
		this.participantOne = participantOne;
	}
	@Column(name = "participantTwo")
	public String getParticipantTwo() {
		return participantTwo;
	}
	public void setParticipantTwo(String participantTwo) {
		this.participantTwo = participantTwo;
	}
	@Column(name = "tournamentID")
	public String getTournamentID() {
		return tournamentID;
	}
	public void setTournamentID(String tournamentID) {
		this.tournamentID = tournamentID;
	}
	@Column(name = "version")
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
}
