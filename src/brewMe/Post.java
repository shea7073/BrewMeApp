package brewMe;

import java.time.LocalDate;

public class Post {

    User owner;
    LocalDate postTime;

    public Post(User user){
        this.owner = user;
        // current time of post
        this.postTime = LocalDate.now();
    }
}
