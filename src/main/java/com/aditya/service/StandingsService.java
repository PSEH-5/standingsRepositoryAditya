package com.aditya.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import com.aditya.client.ApiRestClient;
import com.aditya.dtos.StandingsRequestDto;
import com.aditya.dtos.StandingsResponseDto;

@Service
public class StandingsService {
	@Autowired
	ApiRestClient apiRestClient;
	public List<StandingsResponseDto> getStandings(StandingsRequestDto standingsRequestDto){
		List<StandingsResponseDto> leagueStandings =  apiRestClient.getAsList("get_standings", standingsRequestDto,new ParameterizedTypeReference<List<StandingsResponseDto>>() {});
		if(standingsRequestDto.getTeamKey()!=null)
			leagueStandings = leagueStandings.stream()
									.filter(standing -> standing.getTeamId().equals(standingsRequestDto.getTeamKey()))
									.collect(Collectors.toList());
		return leagueStandings;
	}
}
