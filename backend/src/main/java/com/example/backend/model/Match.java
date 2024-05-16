package com.example.backend.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "matches")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Match {
    
    @Id
    private String matchid;
    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;
    private String matchLink;
    private String textComplete;
    private MatchStatus status;
    private Date date = new Date();
    // 
    public void setMatchStatus(){
        if(textComplete.isBlank())
        {
            this.status=MatchStatus.LIVE;

        }
        else{
            this.status=MatchStatus.COMPLETED;
        }
    }
    
}
