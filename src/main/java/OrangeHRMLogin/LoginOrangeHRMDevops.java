package OrangeHRMLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrangeHRMDevops {

	public static void main(String args[]) {
		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver  = new ChromeDriver();
	    //driver = webdriver.Chrome(ChromeDriverManager().install());
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	  }
}
