public class NewBrewery extends Post {

    String title;
    String body;


    public NewBrewery(User user, String title, String body) {
        super(user);
        this.title = title;
        this.body = body;
    }

}
