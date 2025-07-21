package starter.iu;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoggedView {

    public static Target textLogged = Target.the("Logged validation")
            .located(By.xpath("//android.widget.TextView[@text=\"You are logged in as alice\"]\n"));

    public static String txtLogged = "//android.widget.TextView[@text=\"You are logged in as alice\"]\n";
}
