package brewMe;

public class PostReviewUseCase {

    public static void main(String[] args) {

        // Create a reviewer object
        String name = "Sean";
        String username = "Shea7073";

        Reviewer reviewer = new Reviewer(name, username);

        // This data will come from a web form
        String beerName = "Santilli ";
        String brewery = "Night Shift";
        Double abv = 5.5;
        int ibu = 55;

        // Create an Ale object with above info
        Ale beer1 = new Ale(beerName, abv, ibu, brewery);
        String body = "This was an amazing IPA!";
        Double rating = 4.7;
        String image = "dummy value";

        // Using the Reviewer and Beer we can now create a review object
        // Object automatically gets saved to allReviews variable
        Review review = new Review(reviewer, beer1, body, rating, image);

        // The reviewer can now add the post
        // The review is saved in the reviewers instance
        // Confirmation is printed to the console
        reviewer.addpost(review);

        // Get the newest review and print it to the console
        System.out.println(reviewer.getReviews().get(0).describe());


        // A second reviewer is made
        String name2 = "Greg";
        String username2 = "SkilledShea";

        Reviewer reviewer2 = new Reviewer(name2, username2);

        // New beer is created
        String beerName2 = "Whirlpool";
        String brewery2 = "Night Shift";
        Double abv2 = 4.5;
        int ibu2 = 44;
        Ale beer2 = new Ale(beerName2, abv2, ibu2, brewery2);

        // New review is created
        String body2 = "This such a good session IPA!!";
        Double rating2 = 4.5;
        String image2 = "dummy value";

        Review review2 = new Review(reviewer2, beer2, body2, rating2, image2);

        // Review is added to user's review attribute
        // Confirmation is printed to console
        reviewer2.addpost(review2);

        // Print review information to console
        System.out.println(reviewer2.getReviews().get(0).describe());

        // Admin has rights to delete any post they see fit
        Admin sean = new Admin("Admin", "AdminUserName");
        sean.deletePost(review2);
        // proof that review is no longer there
        System.out.println(Review.getAllReviews());

    }


}


