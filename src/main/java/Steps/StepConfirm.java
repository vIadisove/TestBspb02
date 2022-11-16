package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StepConfirm {
    private SelenideElement codeInput = $(By.xpath("//input[@id='otp-code']"));

    private SelenideElement codeBtn = $(By.xpath("//button[@id='login-otp-button']"));

    public void confirm(String code){
        codeInput.should(Condition.visible).val(code);
        codeBtn.should(Condition.visible).click();
    }
}
