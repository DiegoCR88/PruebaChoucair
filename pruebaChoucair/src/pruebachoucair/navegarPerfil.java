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
public class navegarPerfil {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dcolr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
                driver.manage().window().maximize();// acceder a la url del reto
		
		
		driver.findElement(By.className("login")).click(); // presionar opcion inicio de sesión para acceder con credenciales
		driver.findElement(By.id("email")).sendKeys("pruebacolme@prueba.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("SubmitLogin")).click();
                
                
                driver.findElement(By.className("icon-list-ol")).click();
		Thread.sleep(3000);
                
                driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a/span/i")).click();
		Thread.sleep(4000);
                
		driver.findElement(By.className("icon-ban-circle")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a/span/i")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.className("icon-building")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a/span/i")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.className("icon-user")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a/span/i")).click();
		Thread.sleep(4000);
                
		driver.findElement(By.className("icon-heart")).click();
		Thread.sleep(3000);
		
		
    }
}
