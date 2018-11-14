package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    //creation of a couple of Team instances to test the programme
        Team boca = new Team("Boca");
        Team river = new Team("River");
        Team sanLorenzo = new Team("SanLorenzo");
        Team racing = new Team("Racing");
        Team sacaChispas = new Team("SacaChispas");
        Team chacarita = new Team("Chacarita");
        Team defensoresDeBelgrano = new Team("DefensoresDeBelgrano");
        Team camioneros = new Team("Camioneros");
        Team independiente = new Team("Independiente");
        Team liverpool = new Team("Liverpool");
        Team realMadrid = new Team("RealMadrid");
        Team barcelona = new Team("Barcelona");


    //there's three possible results: "visitor_won", "local_won" or "draw"
        Match match1 = new Match(boca, river, "local_won");
        Match match2 = new Match(boca, river, "draw");
        Match match3 = new Match(sanLorenzo, racing, "draw");
        Match match4 = new Match(sacaChispas, camioneros, "visitor_won");
        Match match5 = new Match(chacarita, defensoresDeBelgrano, "draw");
        Match match6 = new Match(independiente, liverpool, "draw");
        Match match7 = new Match(realMadrid, barcelona, "draw");

        List<Match> results = Arrays.asList(match1, match2, match3, match4, match5, match6, match7);

        Tournament tournament = new Tournament();

        System.out.println( "The winning team is: " + tournament.tournamentChampion(12, results));
    }
}
