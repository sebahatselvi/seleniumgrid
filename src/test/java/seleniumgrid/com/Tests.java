package seleniumgrid.com;

import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test
    public void goToAmazon(){
        driver.navigate().to("https://www.hepsiburada.com/");
    }

}
