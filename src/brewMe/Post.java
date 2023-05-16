package brewMe;

import java.time.LocalDate;

public class Post {

    User owner;
    LocalDate postTime;

    public Post(User user){
        this.owner = user;
        this.postTime = LocalDate.now();
    }
}
