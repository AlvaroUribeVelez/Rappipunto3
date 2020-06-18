package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnTarget;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import starter.search.CategoryA;
import starter.search.SearchForm;

public class NavegaA {


    public static Performable term(String term) {
        return Task.where("{0} attempts to search for #term",
                Click.on(By.linkText(term))
        );
    }
}
