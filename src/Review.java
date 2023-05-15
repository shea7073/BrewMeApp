public class Review extends Post{

    String title;
    String body;
    String image;
    Double rating;

    public Review(User user, String title, String body, Double rating, String image) {
        super(user);
        this.title = title;
        this.body = body;
        this.image = image;
        this.rating = rating;
    }
}
