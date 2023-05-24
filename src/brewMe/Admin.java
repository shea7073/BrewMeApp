package brewMe;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


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
        // no functionality, yet!
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

    public void uploadBeers(String fileName) throws ArgumentNumberException{
        // PRECONDITION: Admin provides file name for file with beer data
        // POST-CONDITION: File has been read through line by line and all line with
        // valid data have been added to the beer repository as Beer objects

        // Expected arguments per line for the file
        int EXPECTED_ARGUMENTS = 5;

        // Try to create file stream, catch file not found if necessary
        FileInputStream fstream;
        try {
            fstream = new FileInputStream(fileName);
        }
        catch (FileNotFoundException e){
            System.out.println("Error, file was not found!");
            return;
        }

        Scanner file = null;

        try {
            file = new Scanner(fstream);
            // loop through each line in the input file
            while (file.hasNextLine()) {
                // split line into array of arguments
                String[] beerInfo = file.nextLine().split(",");
                int numArguments = beerInfo.length;
                // USER DEFINED EXCEPTION
                // if wrong number of arguments provided then throw exception
                if (numArguments != EXPECTED_ARGUMENTS) {
                    throw new ArgumentNumberException(numArguments, EXPECTED_ARGUMENTS);
                }
                // check beer type and then create beer object accordingly
                if (Objects.equals(beerInfo[0], "Ale")){
                    // new ale object
                    Ale ale = new Ale(beerInfo[1], Double.parseDouble(beerInfo[3]), Integer.parseInt(beerInfo[4]), beerInfo[2]);
                    // save beer object
                    Beer.allBeers.add(ale);
                } else if (Objects.equals(beerInfo[0], "Lager")) {
                    // new lager object
                    Lager lager = new Lager(beerInfo[1], Double.parseDouble(beerInfo[3]), Integer.parseInt(beerInfo[4]), beerInfo[2]);
                    // save beer object
                    Beer.allBeers.add(lager);
                }
                else {
                    // if bad data
                    System.out.println("Error reading beer on line" + Arrays.toString(beerInfo));
                }
        }

        }
        catch (Exception e ) {
            e.printStackTrace();
        }
        finally {
            assert file != null;
            file.close();
        }

    }



}
