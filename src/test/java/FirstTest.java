import Steps.StepAutoriz;
import Steps.StepCheckMsg;
import Steps.StepConfirm;
import Steps.StepFeedback;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class FirstTest extends Config {


    @Test
    public void test1() {

        StepAutoriz sa = new StepAutoriz();
        sa.stepAutoriz("demo", "demo");

        StepConfirm stepConfirm = new StepConfirm();
        stepConfirm.confirm("0000");

        StepFeedback stepFeedback = new StepFeedback();
        stepFeedback.Feedback("Хороший сайт! Подходит для практики автотестов");

        StepCheckMsg stepCheckMsg = new StepCheckMsg();
        stepCheckMsg.CheckMsg("Спасибо за ваш отзыв!");



    }

}
