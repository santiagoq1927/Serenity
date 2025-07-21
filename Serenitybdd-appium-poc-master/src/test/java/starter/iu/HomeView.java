package starter.iu;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeView {

    public static Target loginLink = Target.the("Login link")
            .located(By.xpath("//android.widget.TextView[@text=\"Login Screen\"]"));

}
