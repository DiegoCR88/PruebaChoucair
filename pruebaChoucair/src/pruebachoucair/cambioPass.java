/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebachoucair;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author Diego
 */
public class cambioPass {
    
    public static void main(String[] args) throws InterruptedException {
        
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\dcolr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php"); // acceder a la url del reto
                driver.manage().window().maximize();
		
		
		driver.findElement(By.className("login")).click(); // presionar opcion inicio de sesión para acceder con credenciales
		driver.findElement(By.id("email")).sendKeys("pruebacolme@prueba.com");
		driver.findElement(By.id("passwd")).sendKeys("098765");
		driver.findElement(By.id("SubmitLogin")).click();
                Thread.sleep(3000);
                
                driver.findElement(By.className("icon-user")).click();
                driver.findElement(By.id("old_passwd")).sendKeys("098765");
                driver.findElement(By.id("passwd")).sendKeys("123456");
                driver.findElement(By.id("confirmation")).sendKeys("123456");
                
                driver.findElement(By.name("submitIdentity")).click();
                
                driver.findElement(By.className("btn btn-default button button-small")).click();
                
                
                
    }
    
}
