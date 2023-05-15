import java.util.ArrayList;

public class Reviewer extends User {

    static ArrayList<Reviewer> allReviewers = new ArrayList<>();

    public Reviewer(String name, String username) {
        this.username = username;
        this.name = name;

        this.reviews = new ArrayList<Post>();
        this.comments = new ArrayList<Post>();
        allReviewers.add(this);
        System.out.println(allReviewers);
    }

    @Override
    public void addpost(Post post) {
        System.out.println("working");
    }
}
