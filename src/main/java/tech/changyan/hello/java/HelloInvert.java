package tech.changyan.hello.java;

public class HelloInvert {
    public int reverse(int x) {
        String reverseStr = "";
        long reverseX = 0;
        boolean flag = false;

        String str = String.valueOf(x);

        if(x<0){
            flag = true;
            str = str.substring(1);
        }

        for(int i=str.length()-1; i>=0; i--){
            reverseStr += str.charAt(i);
        }

        reverseX = Long.parseLong(reverseStr);
        reverseX = flag ? -reverseX : reverseX;

        if(reverseX>Math.pow(2, 31)-1 || reverseX<Math.pow(-2, 31)) return 0;

        return (int)reverseX;
    }
}
