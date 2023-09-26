package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OptionsComponent {
    public static final Target BTN_CREAR_CUENTA = Target.the("it is used to sign in to the page")
            .locatedBy("//a[@data-testid='header-sign-up-button']");



}
