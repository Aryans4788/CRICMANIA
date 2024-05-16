package com.example.backend.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.backend.model.Match;

public interface MatchRepository extends MongoRepository<Match,String> {
    Optional<Match> findByTeamHeading(String teamHeading);
    
}
