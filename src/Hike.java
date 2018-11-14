import java.util.ArrayList;
import java.util.List;

public class Hike {
    private List<Hiker> hikers = new ArrayList<>();
    public void signUp() {
        //add hikers
        Gatherer gatherer = new Gatherer();
        hikers = gatherer.signUp();
//        hikers.addAll(gatherer.signUp());
    }
    public void showHikers() {
        // show hikers
        System.out.println(hikers);
        for (Hiker hiker : hikers) {
            String name = hiker.getName();
            System.out.println(name);
        }
    }
}