package io.qaguru.tests;

import io.qaguru.pages.StudentRegistrationPage;
import org.junit.jupiter.api.Test;

class DemoqaFakerTest extends BaseTest {

    StudentRegistrationPage studentRegistrationPage;

    @Test
    void successfulFillFormTest() {
        studentRegistrationPage = new StudentRegistrationPage();

        studentRegistrationPage.openPage();
        studentRegistrationPage.fillForm();
        studentRegistrationPage.checkData();
    }

    @Test
    void unsuccessfulFillFormTest() {
        studentRegistrationPage = new StudentRegistrationPage();

        studentRegistrationPage.openPage();
        studentRegistrationPage.verifyFormTitle();
    }
}
