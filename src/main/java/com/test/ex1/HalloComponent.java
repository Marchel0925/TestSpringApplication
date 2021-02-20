package com.test.ex1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HalloComponent implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hallo");
    }
}
