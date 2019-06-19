package Test;



import org.testng.Assert;
import org.testng.annotations.Test;

import Object.BasePage;
import Object.DressPage;
import Object.HomePageObjects;

public class testng {
	HomePageObjects hp;
	BasePage bp;
	DressPage dp;
	
	

	public testng(){
		hp=new HomePageObjects();
		bp=new BasePage();
		dp=new DressPage();
	}
@Test
public void verifytabtext() {
	dp.ClickDress();
	dp.clickpd();
Assert.assertTrue(dp.SmMessage().isEnabled());
}	

	

   

}
	

