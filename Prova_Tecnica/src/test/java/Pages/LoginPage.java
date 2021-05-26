package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Utility;

public class LoginPage extends BasePageClass {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#identifierId")
    WebElement userTxtBox;

    @FindBy(css = ".VfPpkd-vQzf8d")
    WebElement proximoUserBtn;

    @FindBy(css = "#password > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    WebElement pswdTxtBox;

    @FindBy(css = ".VfPpkd-LgbsSe-OWXEXe-k8QpJ > span:nth-child(3)")
    WebElement proximoPswdBtn;

    public void pressUsr(String user) throws InterruptedException {
        webActionHelperMethods.setTxtBoxString(user,userTxtBox);
        webActionHelperMethods.clickbutton(proximoUserBtn);
    }

    public void pressPswd(String pswd) throws InterruptedException {
        webActionHelperMethods.setTxtBoxString(pswd,pswdTxtBox);
        webActionHelperMethods.clickbutton(proximoPswdBtn);
    }


}
