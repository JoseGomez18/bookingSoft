package com.co.senasoft.tasks;

import com.co.senasoft.userinterfaces.HomePage;
import com.co.senasoft.userinterfaces.LoginPage;
import com.co.senasoft.userinterfaces.OptionsComponent;
import com.co.senasoft.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToBy;
import org.openqa.selenium.interactions.ClickAndHoldAction;

public class ClickRegisterButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_CLOSE_MODAL),
                Click.on(OptionsComponent.BTN_CREAR_CUENTA)
        );
    }

    public static ClickRegisterButton clickButton()
    {
        return Tasks.instrumented(ClickRegisterButton.class);
    }
}
