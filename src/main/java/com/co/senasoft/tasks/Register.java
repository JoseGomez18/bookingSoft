package com.co.senasoft.tasks;

import com.co.senasoft.models.RegisterData;
import com.co.senasoft.userinterfaces.LoginPage;
import com.co.senasoft.userinterfaces.OptionsComponent;
import com.co.senasoft.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class Register implements Task {
    RegisterData registerData;

    public Register(RegisterData registerData) {
        this.registerData = registerData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registerData.getEmail()).into(LoginPage.TXT_EMAIL));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(LoginPage.BTN_SEND_EMAIL));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue(registerData.getPassword()).into(RegisterPage.TXT_PASSWORD));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Enter.theValue(registerData.getPassword()).into(RegisterPage.TXT_CONFIRM_PASSWORD));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(RegisterPage.BTN_REGISTER));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Register enterData(RegisterData registerData)
    {
        return Tasks.instrumented(Register.class,registerData);
    }
}
