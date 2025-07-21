package starter.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.questions.LoggedIIQuestions;

public class CheckLogged {

    public static Performable checkInfo(String text){
        return Task.where("{0} text logged confirmation",
                Ensure.that(LoggedIIQuestions.getLoggedText()).contains(text));
    }
}
