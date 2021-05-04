package org.ics.ejb;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.persistence.JoinColumn;



@Entity
@NamedQueries({
	@NamedQuery(name = "Team.findAllTeams()",
			query="SELECT t FROM Team t"),
	 @NamedQuery(name="Team.generateID()",
	 		query= "SELECT teamID FROM Team ORDER BY teamID DESC"),
})
@Table(name = "Team")
public class Team implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String teamID;
	private String teamName;
	private Set<Tournament> tournaments;
	private Set<Game> games;
	private int version;
	
	
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
	
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="teams", cascade = CascadeType.PERSIST)
	public Set<Tournament> getTournaments() {
		return tournaments;
	}
	public void setTournaments(Set<Tournament> tournaments) {
		this.tournaments = tournaments;
	}
	
	@Version
	@Column(name = "version")
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	@ManyToMany(fetch = FetchType.EAGER, mappedBy="teams", cascade = CascadeType.PERSIST)
	public Set<Game> getGames() {
		return games;
	}
	public void setGames(Set<Game> games) {
		this.games = games;
	}
	

	

	
}
