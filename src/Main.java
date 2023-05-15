// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Admin sean = new Admin("sean", "shea7073");
        Admin greg = new Admin("greg", "skilledShea");
        Review review = new Review(sean, "title", "body", 4.5, "dummy");
        sean.addpost(review);
        }
    }
