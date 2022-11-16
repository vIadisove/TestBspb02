package Steps;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StepCheckMsg {
    private SelenideElement msg = $(By.xpath("//span[@class='feedback-popup-success-message']"));

    public void CheckMsg(String expected) {
        Assertions.assertEquals(expected, msg.getText());



    }
}
