/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfb;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

/**
 *
 * @author ThaNguyen
 */
public class TestFB {

    private WebDriver driver;

    public void TestFB() {

    }

    public void testPostFB() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", Config.driverPath);
        driver = new ChromeDriver();
        driver.get(Config.URL);
        driver.manage().window().maximize();

//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//        TakesScreenshot ts = (TakesScreenshot) new Augmenter().augment(driver);
//        Path from = Paths.get(ts.getScreenshotAs(OutputType.FILE).toURI());
//        Path to = Paths.get("E:\\tmp\\"+ "1.png");    
//        Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
        
//        Screenshot screenshot = new AShot().takeScreenshot(driver);
       Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);

ImageIO.write(screenshot.getImage(), "jpg", new File("E:\\tmp\\"+ "1.png"));
//        driver.findElement(By.id("pass")).clear();
//        driver.findElement(By.id("pass")).sendKeys(Config.pass);
//        driver.findElement(By.id("email")).clear();
//        driver.findElement(By.id("email")).sendKeys(Config.user);
//        driver.findElement(By.id("u_0_2")).click();
//        driver.navigate().to(Config.page);
//        System.out.println("Step1");
//        //Thread.sleep(1000);
//        driver.findElement(By.className("_1tm3")).click();
//        System.out.println("Step2");
//        Thread.sleep(1000);
//        //driver.findElement(By.cssSelector("div[class='_1mf _1mj'] span")).sendKeys(Config.comment);
//        System.out.println("Step3");
////        Thread.sleep(1000);
//        driver.findElement(By.id("react-composer-post-button")).click();
//        System.out.println("Step4");
////        Thread.sleep(5000);
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
        } catch (IOException ex) {
            Logger.getLogger(TestFB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
