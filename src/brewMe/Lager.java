package brewMe;

public class Lager extends Beer {

    String fermentation;
    String yeast;

    Lager(String name, Double abv, int ibu, String brewery){
        super(name, abv, ibu, brewery);
        // Lager specific attributes
        this.fermentation = "Bottom-Fermented";
        this.yeast = "Saccharomyces pastorianus";
    }
}
