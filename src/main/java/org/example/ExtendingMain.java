package org.example;

public class ExtendingMain {
    public static void main(String[] args) {
        ExtendingInnerClass.InnerClass2 innerClass = new ExtendingInnerClass().new InnerClass2();
        innerClass.print2();
        innerClass.print1();
    }
}
