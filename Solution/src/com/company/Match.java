package com.company;

public class Match {
    private Team local;
    private Team visitor;
    private String result;

    public Match(Team local, Team visitor, String result) {
        this.local = local;
        this.visitor = visitor;
        this.result = result;
        play();
    }

    public void play() {
        switch (result) {
            case "local_won" :
                local.hasWon();

            case "visitor_won" :
                visitor.hasWon();

            case "draw" :
                local.hasDrawn();
                visitor.hasDrawn();
        }
    }

    public Team getVisitor() {
        return visitor;
    }

    public Team getLocal() {
        return local;
    }
}
