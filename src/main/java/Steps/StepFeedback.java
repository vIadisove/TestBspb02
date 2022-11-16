package Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class StepFeedback {
    private SelenideElement btnFaq = $(By.xpath("//a[@id='faq-link']"));
    private SelenideElement btnFeedback = $(By.xpath("//li[@class='show-feedback-popup']"));
    private SelenideElement btnASmile = $(By.xpath("//img[@class='emoticon active']"));
    private SelenideElement commentInput = $(By.xpath("//textarea[@name='feedback.comment']"));
    private SelenideElement btnSubmit = $(By.xpath("//button[@id='feedback-submit']"));

    public void Feedback(String feedback) {
        btnFaq.should(Condition.visible).click();
        btnFeedback.should(Condition.visible).click();
        btnASmile.should(Condition.visible).click();
        commentInput.should(Condition.visible).val(feedback);
        btnSubmit.should(Condition.visible).click();

        sleep(300);







    }
}
