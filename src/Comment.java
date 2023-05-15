
public class Comment extends Post{

    String title;
    String body;


    public Comment(User user, String title, String body) {
        super(user);
        this.title = title;
        this.body = body;
    }

}
