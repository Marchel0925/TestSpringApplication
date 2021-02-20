package com.test.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainApplication implements CommandLineRunner {

    private final NamePrintingComponent namePrintingComponent;
    @Autowired
    private PhoneNumberPrintingComponent phoneNumberPrintingComponent;

    public MainApplication(NamePrintingComponent namePrintingComponent) {
        this.namePrintingComponent = namePrintingComponent;
    }


    @Override
    public void run(String... args) throws Exception {
        namePrintingComponent.printName();
        phoneNumberPrintingComponent.printNumber();
    }
}
