import java.util.ArrayList;

public class Brewer extends User {

    static ArrayList<Brewer> allBrewers = new ArrayList<>();

    public Brewer(String name, String username) {
        this.username = username;
        this.name = name;

        this.reviews = new ArrayList<Post>();
        this.comments = new ArrayList<Post>();
        allBrewers.add(this);
        System.out.println(allBrewers);
    }

    @Override
    public void addpost(Post post) {
        System.out.println("working");
    }


}
