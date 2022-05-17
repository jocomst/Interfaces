import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> list;

    public JokeManager() {
        this.list = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.list.add(joke);
    }

    public String drawJoke() {
        if (this.list.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int choose = draw.nextInt(this.list.size());
            return this.list.get(choose);
        }
    }

    public void printJokes() {
        for (String s : this.list) {
            System.out.println(s);
        }
    }
}