package com.aditya.dtos;

import com.aditya.model.Country;
import com.aditya.model.League;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StandingsResponseDto {
	String countryName;
	String leagueName;
	String teamName;
	Integer teamId;
	Integer overallLeaguePosition;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Integer getOverallLeaguePosition() {
		return overallLeaguePosition;
	}
	

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public void setOverallLeaguePosition(Integer overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}
	
	
}
