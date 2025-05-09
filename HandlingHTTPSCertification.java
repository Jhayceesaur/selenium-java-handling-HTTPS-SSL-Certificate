import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHTTPSCertification 
{
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//FirefoxOptions, EdgeOptions, SafariOptions is the class on the corresponding browsers in the list
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}
}
