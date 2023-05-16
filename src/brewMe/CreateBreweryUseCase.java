package brewMe;

public class CreateBreweryUseCase {
    public static void main(String[] args) {
        // I debated using System.In to simulate the user creating the brewery themselves
        // but I will just implement that in the GUI

        // Simple Brewer object created
        Brewer nightShift = new Brewer("Night Shift Brewing", "NightShiftBrewing");

        // These values will be pulled from a web form
        String breweryName = nightShift.name;
        String location = "Everett, MA";
        String phoneNumber = "617-294-4233";
        String logo = "dummy value";

        // NewBrewery object is created
        // Will be saved to all brewers list
        NewBrewery NightShift = new NewBrewery(nightShift, breweryName, location, phoneNumber, logo);

        // Brewer is able to add the new brewery
        // Brewery is saved to their myBrewery attribute
        nightShift.addpost(NightShift);

        // Prints the new brewery's info to console
        System.out.println(NightShift.describe());

    }

}
