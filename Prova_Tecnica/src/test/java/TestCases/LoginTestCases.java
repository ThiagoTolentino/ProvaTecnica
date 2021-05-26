package TestCases;

import account.GoogleAccount;
import org.testng.annotations.Test;
import util.Utility;

public class LoginTestCases extends BaseTest {

    GoogleAccount googleAccount = new GoogleAccount();
    @Test
    public void TEST_CASE_CREAT_ACCOUNT() throws InterruptedException {
        Utility utility = new Utility();
        driver.get(URL);

        googleAccount.setUser(utility.geraStringAleatoria(8));
        googleAccount.setPasswd(utility.geraStringAleatoria(8));

        homePage.maximizar();
        homePage.typeName(utility.geraStringAleatoria(5));
        homePage.typeLastName(utility.geraStringAleatoria(5));
        homePage.typeNewUser(googleAccount.getUser());
        homePage.typeNewPswd(googleAccount.getPasswd());
        homePage.clickProximoCadastro();
    }

    @Test
    public void TEST_CASE_DO_LOGIN() throws InterruptedException {
        Utility utility = new Utility();
        driver.get(URL);

        homePage.maximizar();
        homePage.goToLogin();

        loginPage.pressUsr(googleAccount.getUser().concat("@gmail.com"));
        loginPage.pressPswd(googleAccount.getPasswd());
    }


}
