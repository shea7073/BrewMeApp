package brewMe;

import java.util.ArrayList;

public class Review extends Post{

    // Will be replaced by DB
    static ArrayList<Review> allReviews = new ArrayList<>();
    // Get arraylist of all reviews
    static ArrayList<Review> getAllReviews() {
        return allReviews;
    }
    // Remove a specific review (for Admins)
    static void removeReview(Review review) {
        allReviews.remove(review);
    }

    Beer beer;
    String body;
    String image;
    String type;
    Double rating;

    public Review(User user, Beer beer, String body, Double rating, String image) {
        super(user);
        this.beer = beer;
        this.body = body;
        this.image = image;
        this.rating = rating;
        // Checks if beer is already in the system
        // if in system, add review to the beer
        for (Beer b : Beer.allBeers){
            if (b.name.equals(this.beer.name) && b.brewery.equals(this.beer.brewery)){
                beer.addReview(this);
                // if not in system add to system then add review to beer
            } else if (!b.name.equals(this.beer.name) && !b.brewery.equals(this.beer.brewery)) {
                Beer.allBeers.add(beer);
                beer.addReview(this);
                }
            else {
                // Needs implementation!
            }
            }
        // save this to master list of reviews
        allReviews.add(this);
    }

    // String representation of the review
    public String describe(){
        return "Beer: " + this.beer.name + "\nBrewery:" + this.beer.brewery + "\nReview: " + this.body + "\nRating: " +
                this.rating + "\nPosted: " + this.postTime;
    }

}
