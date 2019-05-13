package tech.changyan.hello.java;

public class HelloValueof {

    public static void main(String[] args){
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;

        int i5 = 100;
        int i6 = 100;
        int i7 = 200;
        int i8 = 200;

        Integer i9 = new Integer(100);
        Integer i10 = new Integer(100);

        String s1 = "a";
        String s2 = "b";
        String s3 = "java";
        String s4 = "java";

        System.out.println("i1==i2  "+(i1==i2));
        System.out.println("i1++==i2++  "+(i1++==i2++));

        System.out.println("i3==i4  "+(i3==i4));
        System.out.println("++i3==++i4  "+(++i3==++i4));
        System.out.println("i3+1==i4+1  "+(i3+1==i4+1));

        System.out.println("(i3+i4)==(i3+i4)  "+((i1+i3)==(i2+i4)));
        System.out.println("i3.equals(i4)  "+(i3.equals(i4)));

        System.out.println();

        i1++;
        System.out.println(i1+"  "+i2);
        System.out.println(i1==i2);

        System.out.println();

        System.out.println(i5==i6);
        System.out.println(i7==i8);

        System.out.println();

        System.out.println(i9==i10);
        System.out.println(i9.equals(i10));

        System.out.println();

        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
