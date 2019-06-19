package Test;
import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.Test;

import Object.BasePage;
import Object.DressPage;
import Object.HomePageObjects;


public class DressPageTest   {
	HomePageObjects hp;
	BasePage bp;
	DressPage dp;
	
	
	int random= new Random().nextInt(500000);
	String email="andrewjerry560"+random+"@gmail.com";
	public DressPageTest(){
		hp=new HomePageObjects();
		bp=new BasePage();
		dp=new DressPage();
		
		

}
	@Test
	private void verifymail() {
		// TODO Auto-generated method stub
		hp.setnewletter(email);
		String result=hp.MsgSuccess();
		Assert.assertTrue(result.contains("successfully "), "lsf");
	}
}