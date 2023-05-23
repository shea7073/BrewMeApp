package brewMe;

import java.io.File;

public class UploadBeersUseCase {

    public static void main(String[] args) throws ArgumentNumberException {

        Admin sean = new Admin("Admin", "AdminUserName");
        sean.uploadBeers("./src/BrewMe/beerList.txt");
        // If this returns 13 then we have been successful
        System.out.println(Beer.allBeers.size());
        for (Beer beer : Beer.allBeers) {
            System.out.println(beer.describe());
        }
    }
}
