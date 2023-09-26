package com.co.senasoft.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target TXT_PASSWORD = Target.the("it is used to enter the password")
            .locatedBy("//input[@name = 'new_password']");
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("it is used to enter the password")
            .locatedBy("//input[@name = 'confirmed_password']");
    public static final Target BTN_REGISTER= Target.the("it is used to register")
            .locatedBy("//span[contains(text(),'Crear una cuenta')]");
}
