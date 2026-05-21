package starter.tasks.e2e;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Task;

public class NavigateTo {

    public static Performable HomePage(){
        return Task.where("{0} navigate to demo blaze",
            Open.url("https://www.demoblaze.com/")
        );
    }

}
