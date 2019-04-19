package TestJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsDriver {
	
	@Test
	public static void facebook1(){
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\sana\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

	}

}
