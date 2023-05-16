package brewMe;

public class Ale extends Beer {

    String fermentation;
    String yeast;

    Ale(String name, Double abv, int ibu, String brewery){
        // Calling Beer constructor
        super(name, abv, ibu, brewery);
        // Ale specific attributes
        this.fermentation  = "Top-Fermented";
        this.yeast = "Saccharomyces cerevisiae";
    }

}
