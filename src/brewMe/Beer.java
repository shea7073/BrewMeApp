package brewMe;
import java.util.ArrayList;

public abstract class Beer {

    // Hold every unique beer (until DB implemented)
    static ArrayList<Beer> allBeers = new ArrayList<>();

    String name;

    // Alcohol content
    Double abv;

    // International Bitterness Units
    int ibu;
    String brewery;

    // Container for reviews of each Beer instance
    ArrayList<Review> beerReviews;

    Beer(String name, Double abv, int ibu, String brewery){
        this.name = name;
        this.abv = abv;
        this.ibu = ibu;
        this.brewery = brewery;
    }

    // add review to a beer instance
    public void addReview(Review review){
        this.beerReviews.add(review);
    }

    public String describe(){
        return null;
    }

}
