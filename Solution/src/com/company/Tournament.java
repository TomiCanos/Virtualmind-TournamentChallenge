package com.company;

import java.util.List;

public class Tournament {

    public Team tournamentChampion (Integer n, List<Match> results) {
        Team winningTeam = new Team();
        for (Match match : results) {
            match.play();
            if (match.getLocal().getAccumulatedPoints() > winningTeam.getAccumulatedPoints()){
                winningTeam = match.getLocal();
            } else if (match.getVisitor().getAccumulatedPoints() > winningTeam.getAccumulatedPoints()) {
                winningTeam = match.getVisitor();
            }
        }
        return winningTeam;
    }
}
