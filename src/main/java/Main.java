import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        int i = 15;
        int b = 0;
        System.out.println(i/b);

    }

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
        String answer = "выше нуля: "+ positive.size() +", ниже нуля: "+ negative.size() +", равна нулю: " + zero.size();
        return answer;
    }
}