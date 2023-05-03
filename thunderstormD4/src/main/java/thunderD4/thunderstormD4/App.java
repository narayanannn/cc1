package thunderD4.thunderstormD4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        
    }
}
