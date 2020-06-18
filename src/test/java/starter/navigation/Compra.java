package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.search.CategoryA;
import starter.search.SearchForm;

public class Compra {

    public static Performable comprar() {
        return Task.where("{0} attempts to search for #term",
                Click.on(CategoryA.ADD_TO_CART_BUTTON)
        );
    }
}