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
public class loginFailed {
    
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dcolr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
                driver.manage().window().maximize();
		
		
		driver.findElement(By.className("login")).click(); // presionar opcion inicio de sesión para acceder con credenciales
		driver.findElement(By.id("email")).sendKeys("prueba12334@prueba.com");
		driver.findElement(By.id("passwd")).sendKeys("clave6543");
		driver.findElement(By.id("SubmitLogin")).click();
                
                
    }
    
}
