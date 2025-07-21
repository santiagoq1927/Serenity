package starter.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import starter.iu.LoggedView;

public class LoggedIIQuestions {

    public static Question<String> getLoggedText(){
        return Question.about("Text logged").answeredBy(
          //actor -> BrowseTheWeb.as(actor).textOf(LoggedView.textLogged)
                actor -> BrowseTheWeb.as(actor).textOf(LoggedView.txtLogged)
        );
    }
}
