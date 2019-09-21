package com.aditya.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.aditya.dtos.StandingsRequestDto;

import org.springframework.core.ParameterizedTypeReference;
import java.util.List;

@Component
public class ApiRestClient {
	@Autowired
	RestTemplate restTemplate;
	String uri="https://apiv2.apifootball.com";
			
	public <T> List<T> getAsList(String action ,StandingsRequestDto standingsRequestDto, ParameterizedTypeReference<List<T>> responseType ) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(uri)
		        .queryParam("APIkey", "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978")
		        .queryParam("action", action);
		if(standingsRequestDto.getLeagueId() !=  null) {
			builder = builder.queryParam("league_id", standingsRequestDto.getLeagueId());
		}
		if(standingsRequestDto.getCountryId() !=  null) {
			builder = builder.queryParam("country_id", standingsRequestDto.getCountryId());
		}
		if(standingsRequestDto.getTeamKey() !=  null) {
			builder = builder.queryParam("team_key", standingsRequestDto.getTeamKey());
		}
		
		return restTemplate.exchange(builder.toUriString(), HttpMethod.GET, null, responseType).getBody();
	
	}
}
