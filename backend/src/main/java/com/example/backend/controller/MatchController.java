package com.example.backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Match;
import com.example.backend.service.MatchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

 


@RestController
@RequestMapping("/match")
@CrossOrigin("*")

public class MatchController {

    @Autowired
    private MatchService matchService;

    public MatchController(MatchService matchService)
    {
        this.matchService=matchService;
    }

    @GetMapping("/live")
   
    public ResponseEntity<List<Match>> getLiveMatches()
    {
        return new ResponseEntity<>(this.matchService.getLiveMatch(),HttpStatus.OK);
    }

    @GetMapping()
    public  ResponseEntity<List<Match>> getAllMatches() {
        return new ResponseEntity<>(this.matchService.getLiveMatch(),HttpStatus.OK);
    }



}

    
    

   


