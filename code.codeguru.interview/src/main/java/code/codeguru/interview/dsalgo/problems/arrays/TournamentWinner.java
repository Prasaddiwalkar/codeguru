package code.codeguru.interview.dsalgo.problems.arrays;

import java.util.*;

public class TournamentWinner {
    public String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        /*
         {
          "competitions": [
            ["HTML", "C#"],
            ["C#", "Python"],
            ["Python", "HTML"]
          ],
          "results": [0, 0, 1]
         }
         [homeTeam, awayTeam]

         "results": [0, 0, 1]
         0 - Home Team
         1 - Away Team
         3 points for winner
        */

        if ((competitions == null || competitions.isEmpty())
                && (results == null || results.isEmpty())
                && (competitions.size() != results.size())) {
            return "Incorrect inputs";
        }

        Map<String, Integer> finalResults = new HashMap<>();
        String tournamentWinner = null;
        for (int index = 0; index <= Objects.requireNonNull(competitions).size() - 1; index++) {

            List<String> matchDetails = competitions.get(index);
            int result = results.get(index);
            String homeTeam = matchDetails.get(0);
            String awayTeam = matchDetails.get(1);

            if (result == 0) {
                finalResults.merge(awayTeam, 3, Integer::sum);
            } else {
                finalResults.merge(homeTeam, 3, Integer::sum);
            }
        }
        int max = Collections.max(finalResults.values());

        for (Map.Entry<String, Integer> entry : finalResults.entrySet()) {
            if (entry.getValue() == max) {
                tournamentWinner = entry.getKey();
                break;
            }
        }
        return tournamentWinner;
    }
}
