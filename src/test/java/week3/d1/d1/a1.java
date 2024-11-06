package week3.d1.d1;

import static week3.d1.d1.COPIEDFROM_other_pakage.drivers.driverSetUp.createChroomDriver;
import static week3.d1.d1.COPIEDFROM_other_pakage.drivers.driverSetUp.driver;
import static week3.d1.d1.COPIEDFROM_other_pakage.urls.urls.*;

public class a1 {
    public static void main(String[] args) {
        createChroomDriver();
        driver.get(oldRetailApp);

    }
}
