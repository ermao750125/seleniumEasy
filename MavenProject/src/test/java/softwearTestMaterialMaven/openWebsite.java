package softwearTestMaterialMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class openWebsite {
 
 public WebDriver driver;
 
  @Test
  public void openMyBlog() {
 //driver.get("https://www.softwaretestingmaterial.com/");
 //driver.get("file:///home/ermao/et510-SoftwearTestMaterial_NG/MavenProject/BrowserFolder/websiteSoftwareTestMaterial_HomePage.html");
	  driver.get("file:///home/ermao/et510-SoftwearTestMaterial_NG/MavenProject/BrowserFolder/websiteSoftwareTestMaterial_HomePage.html");
  }
  
  @BeforeClass
  public void beforeClass() {
   
   System.setProperty("webdriver.gecko.driver", "BrowserFolder//geckodriver");
   driver = new FirefoxDriver();
   
  }
 
  @AfterClass
  public void afterClass() {
   driver.quit();
  }
 
}