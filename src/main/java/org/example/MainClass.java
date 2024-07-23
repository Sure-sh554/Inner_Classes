package org.example;

public class MainClass {
    public static void main(String[] args) {
        MemberInnerClass obj=new MemberInnerClass();
        // By using the reference of outer class we can access only outer members
        obj.outerClass();
        //obj.m2();

        MemberInnerClass.InnerClass innerClass=new MemberInnerClass().new InnerClass();
        innerClass.innerClass1();
        innerClass.innerClass2();
        // By using the inner class reference we can access inner class methods and variables
        // If not we will get the compilation error
       // innerClass.m1();

    }
}
