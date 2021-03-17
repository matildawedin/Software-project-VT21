package org.ics.eao;

import javax.ejb.Local;

import org.ics.ejb.Team;

@Local
public interface TeamEAOLocal {

	public Team findTeam(String teamID);
	public Team createTeam(Team team);
	public Team updateTeam(Team team);
}
