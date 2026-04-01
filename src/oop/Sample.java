package oop;

public class Sample {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));
    }

    public void sayNick(String 바보) {
    }
}

class Calculator {

    static int result = 0;

    static int add (int num) {
        result += num;
        return result;

    }
}

