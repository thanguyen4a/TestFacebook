/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author ThaNguyen
 */
public class TestFB {

    private WebDriver driver;

    public void TestFB() {

    }

    public void testPostFB() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", Config.driverPath);
        driver = new ChromeDriver();
        driver.get(Config.URL);
        driver.manage().window().maximize();

        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(Config.pass);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(Config.user);
        driver.findElement(By.id("u_0_2")).click();
        driver.navigate().to(Config.page);
        System.out.println("Step1");
        //Thread.sleep(1000);
        driver.findElement(By.className("_1tm3")).click();
        System.out.println("Step2");
        Thread.sleep(1000);
        //driver.findElement(By.cssSelector("div[class='_1mf _1mj'] span")).sendKeys(Config.comment);
        System.out.println("Step3");
//        Thread.sleep(1000);
        driver.findElement(By.id("react-composer-post-button")).click();
        System.out.println("Step4");
//        Thread.sleep(5000);
        driver.quit();
        System.out.println("Xong");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TestFB testFb = new TestFB();

        try {
            testFb.testPostFB();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
