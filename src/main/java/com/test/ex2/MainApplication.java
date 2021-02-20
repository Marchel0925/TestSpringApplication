package com.test.ex2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainApplication implements CommandLineRunner {

    NamePrintingComponent namePrintingComponent;
    PhoneNumberPrintingComponent phoneNumberPrintingComponent;

    public MainApplication(NamePrintingComponent namePrintingComponent, PhoneNumberPrintingComponent phoneNumberPrintingComponent) {
        this.namePrintingComponent = namePrintingComponent;
        this.phoneNumberPrintingComponent = phoneNumberPrintingComponent;
    }


    @Override
    public void run(String... args) throws Exception {
        namePrintingComponent.printName();
        phoneNumberPrintingComponent.printNumber();
    }
}
