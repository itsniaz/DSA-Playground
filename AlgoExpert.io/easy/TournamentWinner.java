package easy;
import java.util.ArrayList;
import java.util.HashMap;

class TournamentWinner {
    public String tournamentWinner(
        ArrayList<ArrayList<String>> competitions,
        ArrayList<Integer> results
    ) {
        HashMap<String, Integer> teamWins = new HashMap<>();
        String winningMaxTeam = "";
        int maxWins = 0;

        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            int winner = results.get(i);

            String winningTeam = winner == 1 ? homeTeam : awayTeam;
            teamWins.put(winningTeam, teamWins.getOrDefault(winningTeam, 0) + 3);

            if (teamWins.get(winningTeam) > maxWins) {
                winningMaxTeam = winningTeam;
                maxWins = teamWins.get(winningTeam);
            }
        }

        return winningMaxTeam;
    }
}
