package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.iu.LoggedView;

public class LoggedQuestions implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return LoggedView.textLogged.resolveFor(actor).getText();
    }

    public static Question<String> value(){
        return new LoggedQuestions();
    }
}
