package com.aditya.rest;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.dtos.StandingsRequestDto;
import com.aditya.dtos.StandingsResponseDto;
import com.aditya.service.StandingsService;

@RestController
@RequestMapping("/api")
public class StandingsController {
	
	@Autowired
	StandingsService standingsService;
	
	@RequestMapping(method = RequestMethod.GET, produces = { "application/json" })
	public List<StandingsResponseDto> getStandings(@ModelAttribute @Valid StandingsRequestDto standingsRequestDto){
		return standingsService.getStandings(standingsRequestDto);
	}

}
