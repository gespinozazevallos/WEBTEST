package org.example.testcases;

import org.example.pages.SignUpPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.FakeDataGenerator;
import utilities.PropertyReader;

public class SignUp extends BaseTestClass {
    private SignUpPage signUpPage;
    private final FakeDataGenerator fakeDataGenerator = new FakeDataGenerator();


    @Override
    @BeforeMethod
    void beforeMethod() {
        super.beforeMethod();
        signUpPage = header.clickOnSignUp();
    }

    @Test(priority = 1)
    public void validSingUp() {
        signUpPage.signUp("Gustavoe","1234567");
    }
}
