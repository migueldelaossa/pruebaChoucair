package pruebaChoucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import pruebaChoucair.userinterface.UtestSecondFormPage;

public class FillTheSecondForm implements Task {
    public static FillTheSecondForm onThePage() {
        return Tasks.instrumented(FillTheSecondForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue((CharSequence) UtestSecondFormPage.SELECT_CITY).into(UtestSecondFormPage.CITIES));
    }
}
