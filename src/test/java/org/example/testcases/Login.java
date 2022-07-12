package org.example.testcases;

import org.example.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.FakeDataGenerator;

public class Login extends BaseTestClass {
    private LoginPage loginPage;
    private final FakeDataGenerator fakeDataGenerator = new FakeDataGenerator();

    @Override
    @BeforeClass
    void beforeClass() {
        super.beforeClass();
        loginPage = header.clickOnLogin();
    }
    // Se está ejecutando el test con un usuario creado anteriormente
    @Test
    public void validLogin() {
        loginPage.login("Gustavoe","1234567");
    }
}
