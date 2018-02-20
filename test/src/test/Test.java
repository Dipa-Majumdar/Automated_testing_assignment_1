/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author DipaMajumdar
 */
public class Test 
{
    public static void main(String[] args)
    {
                    try{
                System.setProperty("webdriver.chrome.driver",
                            "C:\\Users\\dipamajumdar\\Desktop\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");

                WebDriver driver= new ChromeDriver();
              
          
                  driver.navigate().to("http://automationpractice.com");
                  driver.findElement(By.xpath("//*[@id=\"home-page-tabs\"]/li[1]/a")).click();
                  Thread.sleep(2000L);
                  driver.findElement(By.xpath(" //*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]/span")).click();
                  Thread.sleep(2000L);
                  driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
                  Thread.sleep(2000L);
                  driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]/span")).click();
                  Thread.sleep(2000L);
                  
                  
                  driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
                  Thread.sleep(2000L);
                  driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span/i")).click();
                  Thread.sleep(2000L);
                  driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
                  Thread.sleep(2000L);
                  driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
                  Thread.sleep(2000L);
                  driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
                  
                  
                 Select select1;
                 select1 = new Select(driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]")));
                select1.selectByValue("price:asc");
                driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
                Thread.sleep(2000L);
                driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
                
                driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
                for(int i=0;i<4;i++)
                {
                driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_1_1_0_0\"]/span/i")).click();
                
                       }
                driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
                    
         
                 
                }
                catch(Exception e)
                {
                    System.out.print(e);
                }
    
    }
}
