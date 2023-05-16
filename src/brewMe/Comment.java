package brewMe;

import java.util.ArrayList;

public class Comment extends Post{

    // Container for comments until DB implemented
    static ArrayList<Comment> allComments = new ArrayList<>();
    static ArrayList<Comment> getAllComments() {
        return allComments;
    }

    // Remove a comment from system
    static void removeComment(Comment comment) {
        allComments.remove(comment);
    }

    String title;
    String body;

    // I have chosen not to do a use case for comments yet. When I have a database I will associate
    // each comment with a review or a brewery

    public Comment(User user, String title, String body) {
        // Pretty basic. Will be fleshed out more
        super(user);
        this.title = title;
        this.body = body;
    }

}
