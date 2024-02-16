package Footbal;
//s

import java.util.ArrayList;
import java.util.List;

public class Match {
    private List<Player> homeTeam;
    private List<Player> awayTeam;

    public Match() {
        this.homeTeam = new ArrayList<>();
        this.awayTeam = new ArrayList<>();
    }

    public void addHomeTeamPlayer(Player player) {
        homeTeam.add(player);
    }

    public void addAwayTeamPlayer(Player player) {
        awayTeam.add(player);
    }
}


