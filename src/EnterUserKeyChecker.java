// CHANGE COMMIT
//Check if user pressed ENTER,
import java.io.IOException;
public class EnterUserKeyChecker {
    public void pressEnter() {
        int count = 10;
        System.out.println("Please press \"Enter\" to proceed");
        int rawInput = 0;
        try {
            rawInput = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char letter = (char) count;
        if (letter == rawInput) {
            System.out.println("You pressed enter. You're signed up, thank you.");
        } else {
            System.out.println("Sorry, you did not press \"Enter\".");
        }
    }
}