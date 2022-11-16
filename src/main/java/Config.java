import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class Config {
    private static String baseUrl = "https://idemo.bspb.ru/";
    @BeforeAll
    static void beforeConfig() {
        Configuration.timeout = 3000; // Умное ожидание появление элемента на странице
        Configuration.browserSize = "1920x1080"; // Умно
    }

    @BeforeEach
    public void before() {
        open(baseUrl);
    }
    @AfterEach
    public void after() {

    }
}
