package org.ics.eao;

import java.util.List;

import javax.ejb.Local;

import org.ics.ejb.Team;

@Local
public interface TeamEAOLocal {

	public Team findTeam(String teamID);
	public Team createTeam(Team team);
	public void updateTeam(Team team);
	public List<Team> findAllTeams();
	 public String generateID();
}
