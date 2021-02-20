package com.test.ex4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Application implements CommandLineRunner {

    private final StringUtil stringUtil;

    public Application(StringUtil stringUtil) {
        this.stringUtil = stringUtil;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(stringUtil.countSentence("Kachoww"));
    }
}
