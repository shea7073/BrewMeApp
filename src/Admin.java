import java.util.ArrayList;

public class Admin extends User {

    static ArrayList<Admin> allAdmins = new ArrayList<>();

    public Admin(String name, String username) {
        this.username = username;
        this.name = name;

        this.reviews = new ArrayList<Post>();
        this.comments = new ArrayList<Post>();
        allAdmins.add(this);
        System.out.println(allAdmins);
    }

    @Override
    public void addpost(Post post) {
        System.out.println("working");
    }
}
