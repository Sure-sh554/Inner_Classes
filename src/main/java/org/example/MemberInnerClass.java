package org.example;

public class MemberInnerClass {
    void outerClass(){
        System.out.println("MemberOuterClass");

    }
    class InnerClass{
        static final int i=10;
        void innerClass1(){
            System.out.println("innerClass1");
        }
        void innerClass2(){
            System.out.println("innerClass2");
        }
    }
}
