package cn.znvis.hello.java;

/**
 * DESC
 *
 * @author cc
 * @date 2020/5/29
 */
public class AnonymousInnerClass {

    public static void main(String[] args) {

        new Hello() {
            @Override
            public void hello() {
                super.hello();
                System.out.println(">>> anonymous hello single");
            }
        }.hello();

        new HelloInterface() {
            @Override
            public void hello() {
                System.out.println(">>> anonymous hello interface");
            }
        };

        Hello hello = new Hello() {
            @Override
            public void hello() {
                super.hello();
                System.out.println(">>> anonymous hello multiple");
            }

            @Override
            public void hello2() {
                super.hello2();
                System.out.println(">>> anonymous hello2  multiple");
            }
        };
        hello.hello();
        hello.hello2();

        HelloInterface helloInterface = () -> System.out.println(">>> lambda hello");
        helloInterface.hello();

    }
}

