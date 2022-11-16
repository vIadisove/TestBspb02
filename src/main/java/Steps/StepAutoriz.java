package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StepAutoriz {
    private SelenideElement loginInput = $(By.xpath("//input[@name='username']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private SelenideElement loginBtn = $(By.xpath("//button[@id='login-button']"));

    public void stepAutoriz(String login, String password){
        loginInput.should(Condition.visible).val(login);
        passwordInput.should(Condition.visible).val(password);
        loginBtn.should(Condition.visible).click();

    }
}
