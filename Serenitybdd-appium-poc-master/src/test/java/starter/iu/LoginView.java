package starter.iu;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginView {

    public static Target username = Target.the("Username")
            .located(AppiumBy.accessibilityId("username"));

    public static Target password = Target.the("Password")
            .located(AppiumBy.accessibilityId("password"));

    public static Target buttonLogin = Target.the("Button login")
            .located(By.xpath("//android.widget.TextView[@text=\"Login\"])[2]"));
}
