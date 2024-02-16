package Footbal;

public class Main {
    public static void main(String[] args) {
        // Create players
        Player player1 = new Player("Messi", 10);
        Player player2 = new Player("Ronaldo", 7);
        Player player3 = new Player("Neymar", 11);

        Match match = new Match();

        match.addHomeTeamPlayer(player1);
        match.addAwayTeamPlayer(player2);
        match.addAwayTeamPlayer(player3);

    }
}

