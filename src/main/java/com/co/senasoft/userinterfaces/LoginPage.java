package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_EMAIL = Target.the("it is used to enter the email")
            .locatedBy("//input[@name = 'username']");
    public static final Target BTN_SEND_EMAIL = Target.the("it is used to send the email")
            .locatedBy("//span[contains(text(),'Continuar con e-mail')]");

}
