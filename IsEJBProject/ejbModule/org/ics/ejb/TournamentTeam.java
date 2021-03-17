package org.ics.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TournamentTeam")
public class TournamentTeam implements Serializable {

	private String id;  //ev göra en TournamentTeamID calss likt lab 7
	
	
	private String teamID;
	private String tournamentID;
	
	
	private Team team;
	private Tournament tournament;
	
	@Id
	@Column(name = "Id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "teamID", nullable = false)
	@NotNull //vad gör denna??
	public String getTeamID() {
		return teamID;
	}
	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}
	
	@Column(name = "tournamentID", nullable = false)
	@NotNull
	public String getTournamentID() {
		return tournamentID;
	}
	public void setTournamentID(String tournamentID) {
		this.tournamentID = tournamentID;
	}
	
	@ManyToOne
	@JoinColumn(name = "teamID", referencedColumnName = "teamID", nullable = false, insertable = false, updatable = false) //ändra updatable till true? om amn vill kunna ta bort team från torunament
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	
	@ManyToOne
	@JoinColumn(name = "tournamentID", referencedColumnName = "tournamentID", nullable = false, insertable = false, updatable = false)
	public Tournament getTournament() {
		return tournament;
	}
	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}
}
