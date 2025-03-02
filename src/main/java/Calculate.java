import java.util.ArrayList;
import java.util.List;

public class Calculate {
    public String calculateStats(String input) throws NumberFormatException{
        String[] words = input.split(" ");
        List<String> positive = new ArrayList<>();
        List<String> negative = new ArrayList<>();
        List<String> zero = new ArrayList<>();
        for (String word: words) {
            if (Integer.valueOf(word) < 0) negative.add(word);
            if (Integer.valueOf(word) > 0) positive.add(word);
            if (Integer.valueOf(word) == 0) zero.add(word);
        }
        return "выше нуля: "+ positive.size() +", ниже нуля: "+ negative.size() +", равна нулю: " + zero.size();
    }
}
