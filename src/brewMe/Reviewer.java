package brewMe;

import java.util.ArrayList;

public class Reviewer extends User {

    // Holds all of the reviewers (will use DB)
    static ArrayList<Reviewer> allReviewers = new ArrayList<>();

    // Personal post collections
    ArrayList<Review> myReviews = new ArrayList<>();
    ArrayList<Comment> myComments = new ArrayList<>();

    public Reviewer(String name, String username) {
        this.username = username;
        this.name = name;

        this.reviews = new ArrayList<>();
        this.comments = new ArrayList<>();
        allReviewers.add(this);
        //System.out.println(allReviewers);
    }

    // Detect Post type and act accordingly
    @Override
    public void addpost(Post post) {
        if (post instanceof Review){
            // DOWNCASTING
            myReviews.add((Review)post);
            System.out.println("Thank you for your review!");
        }
        if (post instanceof Comment){
            // DOWNCASTING
            myComments.add((Comment)post);
            System.out.println("Comment added!");
        }

    }

    public ArrayList<Review> getReviews(){
        return this.myReviews;
    }

    public ArrayList<Comment> getMyComments(){
        return this.myComments;
    }

}
