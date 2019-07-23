package com.mainacad;

import com.mainacad.model.User;
import com.mainacad.service.PromUserService;
import com.mainacad.util.ChromeDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class App
{
    public static void main( String[] args )
    {
        WebDriver driver = ChromeDriverUtil.getChromeDriver();

        User user = new User("testUser9876543@gmail.com", "123456789", "Alex", "Ignatenko");
        driver = PromUserService.registerUser(user, driver);

        ChromeDriverUtil.quitDriver(driver);
    }
}
