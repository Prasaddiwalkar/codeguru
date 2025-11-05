package code.codeguru.interview.dsalgo.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TournamentWinnerTest {

    TournamentWinner tournamentWinner;

    @BeforeAll
    public void setup() {
        tournamentWinner = new TournamentWinner();
    }

    @Test
    public void setTournamentWinnerTest() {
        //        ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results

        List<List<String>> competitions =
                List.of(List.of("HTML", "C#"), List.of("C#", "Python"), List.of("Python", "HTML"));
        List<Integer> results = List.of(0, 0, 1);

        tournamentWinner.tournamentWinner(competitions, results);
    }
}
