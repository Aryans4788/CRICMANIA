package com.example.backend.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.backend.model.Match;


public interface MatchService {

    

    List<Match> getAllMatches();

    List<Match> getLiveMatch(); 

  
}
