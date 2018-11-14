import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Gatherer {
    public List<Hiker> signUp(){
        List<Hiker> hikers = new ArrayList<>();
        System.out.println("Tell me your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (!name.isEmpty()){
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            System.out.println("What's your name?");
            name = scanner.nextLine();
        }
        // add the hiker into hikers
        return hikers;
    }
}
