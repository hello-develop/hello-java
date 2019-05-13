package tech.changyan.hello.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloEnumTest {


    @Test
    public void printSeason() {
        HelloEnum he = new HelloEnum();
        he.printSeason();
    }
}