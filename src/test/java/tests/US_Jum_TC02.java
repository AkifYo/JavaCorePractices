package tests;

import org.testng.annotations.Test;
import utilities.ReusableMethods;

public class US_Jum_TC02 {
    @Test
    public void  test01(){
        // login to the jumbo website
        ReusableMethods.loginJumbo("akyor06@hotmail.com","Ny233134.");
    }
}
