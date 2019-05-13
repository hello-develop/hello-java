package tech.changyan.hello.java;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
    Season(){
        System.out.println("Constructor");
    }
}

public class HelloEnum {

    protected void printSeason(){
        for(Season s:Season.values()){
            System.out.println(s.toString());
        }
    }
}
