package brewMe;

import java.util.ArrayList;

public class NewBrewery extends Post {

    static ArrayList<NewBrewery> allBreweries = new ArrayList<>();

    static void removeBrewery(NewBrewery brewery){
        allBreweries.remove(brewery);
    }

    String title;
    String location;
    String phoneNumber;
    String logo;


    public NewBrewery(Brewer brewer, String title, String location, String phoneNumber, String logo) {
        super(brewer);
        this.title = title;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.logo = logo;
        allBreweries.add(this);
        System.out.println("Welcome, Your brewery has been added to BrewMe!");
    }

    public String describe() {
        return this.title + "\nLocated in " + this.location + "\nContact us at " + this.phoneNumber;
    }

}
