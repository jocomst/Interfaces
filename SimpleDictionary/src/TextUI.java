
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TextUI {

    private Scanner scan;
    private SimpleDictionary dict;

    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.scan = scan;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = this.scan.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word:");
                String word = this.scan.nextLine();
                System.out.println("Translation:");
                String translation = this.scan.nextLine();
                this.dict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String word = this.scan.nextLine();
                if (this.dict.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println(this.dict.translate(word));
                }
            }
        }
    }
}