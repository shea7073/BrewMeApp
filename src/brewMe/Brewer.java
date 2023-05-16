package brewMe;

import java.util.ArrayList;

public class Brewer extends User {

    static ArrayList<Brewer> allBrewers = new ArrayList<>();

    NewBrewery myBrewery;

    ArrayList<Review> myReviews = new ArrayList<>();
    ArrayList<Comment> myComments = new ArrayList<>();

    public Brewer(String name, String username) {
        this.username = username;
        this.name = name;

        this.reviews = new ArrayList<>();
        this.comments = new ArrayList<>();
        allBrewers.add(this);
        //System.out.println(allBrewers);
    }


    // Brewer can post reviews, new breweries, and comments
    @Override
    public void addpost(Post post) {
        if (post instanceof NewBrewery) {
            // DOWNCASTING
            this.myBrewery = (NewBrewery) post;
        }
        if (post instanceof Review){
            // DOWNCASTING
            myReviews.add((Review)post);
        }
        if (post instanceof Comment){
            // DOWNCASTING
            myComments.add((Comment)post);
        }
    }


    // shows some extra functionality for only brewers
    // this method allows them to change the location of their brewery
    public void updateLocation(String newLocation){
        NewBrewery.allBreweries.remove(this.myBrewery);
        this.myBrewery.location = newLocation;
        NewBrewery.allBreweries.add(this.myBrewery);

    }


}
