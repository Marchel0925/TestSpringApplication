package com.test.ex4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Application implements CommandLineRunner {

    private final StringUtil stringUtil;

    public Application(StringUtil stringUtil) {
        this.stringUtil = stringUtil;
    }

    @Override
    public void run(String... args) throws Exception {
        String blank = "";
        System.out.println("Input string~>");
        try(Scanner sc = new Scanner(System.in)){
            if(sc.hasNext()){
                blank = sc.next();
            }
        }
        System.out.println("Length of the string '"+ blank + "' is : " + stringUtil.countSentence(blank));
    }
}
