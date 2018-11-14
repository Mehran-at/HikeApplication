// write their name
//If press enter with name,
// they get signed up
//If press enter empty string
//it stops asking for more hikers
//List<Hiker> Hikers = hikersList.getHikersName();
import java.util.List;
public class Hiker {
    private String name;
    public Hiker(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}