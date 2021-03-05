/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebachoucair;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author Diego
 */
public class navegacion {
    
    public static void main(String[] args) throws InterruptedException {
         
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\dcolr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
                
                JavascriptExecutor js = (JavascriptExecutor) driver;
                
                driver.get("http://automationpractice.com/index.php");
                driver.manage().window().maximize();
                Thread.sleep(5000);
                
                
                //navegacion hacia abajo en la página
                js.executeScript("window.scrollBy(0,350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,350)", "");
                Thread.sleep(2000);
                
                //navegación hacia arriba
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(2000);
                
                js.executeScript("window.scrollBy(0,-350)", "");
                Thread.sleep(2000);
    }
    
}
