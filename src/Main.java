
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.input.DataFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        DateFormat systemDate = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String sDate = systemDate.format(date);
        
        
                
        
        
        driver.manage().window().maximize();
        driver.get("http://booking.com");

        WebElement city = wait.until(ExpectedConditions.elementToBeClickable(By.id("ss")));
        city.sendKeys("Belgrade");

    
        
        WebElement checkIn = wait.until(ExpectedConditions.elementToBeClickable(By.className("sb-date-field__icon-btn")));
        checkIn.click();
        
        
        WebElement checkInDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[6]")));
        checkInDate.click();

        WebElement checkOutDate = checkInDate.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[6]/td[4]"));
        checkOutDate.click();

        WebElement guest = wait.until(ExpectedConditions.elementToBeClickable(By.id("xp__guests__toggle")));
        guest.click();

        WebElement adult = wait.until(ExpectedConditions.elementToBeClickable(By.className("sb-group__field-adults")));
        WebElement adultGuest = adult.findElement(By.className("bui-stepper__add-button"));
        adultGuest.click();
        adultGuest.click();
        adultGuest.click();
        adultGuest.click();
        adultGuest.click();
        adultGuest.click();

        WebElement room = wait.until(ExpectedConditions.elementToBeClickable(By.className("sb-group__field-rooms")));
        WebElement addRoom = room.findElement(By.className("bui-stepper__add-button"));
        addRoom.click();
        addRoom.click();
        addRoom.click();

        WebElement children = wait.until(ExpectedConditions.elementToBeClickable(By.className("sb-group-children")));
        WebElement addChildren = children.findElement(By.className("bui-stepper__add-button"));
        addChildren.click();
        
 //       WebElement age = addChildren.findElement(by);
        
        WebElement age = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/div[3]/div[2]/div/div/div[4]/select")));
        Select childAge = new Select(age);
        childAge.selectByValue("12");
        


        
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.className("sb-searchbox__button")));
        search.click();
//        Thread.sleep(3000);
    }

}
