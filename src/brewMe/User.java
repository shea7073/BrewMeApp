package brewMe;

import java.util.ArrayList;

abstract class User {

    String name;
    String username;
    ArrayList<Post> reviews;
    ArrayList<Post> comments;

    public abstract void addpost(Post post);

}
