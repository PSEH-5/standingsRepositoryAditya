package com.aditya.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StandingsRequestDto {
	private Integer countryId;
	private Integer teamKey;
	@NotNull @Min(value=0)
	private Integer leagueId;
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public Integer getTeamKey() {
		return teamKey;
	}
	public void setTeamKey(Integer teamKey) {
		this.teamKey = teamKey;
	}
	public Integer getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(Integer leagueId) {
		this.leagueId = leagueId;
	}
	
	
}
