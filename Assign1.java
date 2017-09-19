import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign1 {
		public static void main(String[] args)
			{
			boolean b1;
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://qspiders.com/contact");
			b1=driver.findElement(By.id("edit-submitted-branch-chosen-1")).isEnabled();
			System.out.println(b1);
			//driver.findElement(By.name("submitted[message]")).sendKeys("Chennai\nTamilnadu");
			driver.close();
			}
	}