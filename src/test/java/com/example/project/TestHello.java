package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestHello {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Test
    public void testHelloWorld() {

        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        main(null);

        assertEquals("Hello world!\n", bos.toString());

        System.setOut(originalOut);
    }
}
