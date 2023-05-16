package brewMe;

import java.util.ArrayList;
import brewMe.Review.*;


public class Admin extends User {

    // Will be replaced by DB
    static ArrayList<Admin> allAdmins = new ArrayList<>();

    public Admin(String name, String username) {
        this.username = username;
        this.name = name;

        // to hold all reviews and comments by admin
        this.reviews = new ArrayList<>();
        this.comments = new ArrayList<>();
        // add this admin to admin list
        allAdmins.add(this);
    }

    // Overridden from User class
    @Override
    public void addpost(Post post) {
        System.out.println("will be implemented");
    }



    // DOWNCASTING!
    // Admin can delete any post it wants
    public void deletePost(Post post) {
        if (post instanceof Review){
            Review.removeReview((Review) post);
        }
        if (post instanceof Comment) {
            Comment.removeComment((Comment) post);
        }
        if (post instanceof NewBrewery) {
            NewBrewery.removeBrewery((NewBrewery) post);
        }

    }



}
