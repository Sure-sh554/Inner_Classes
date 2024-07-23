package org.example;

public class InterfaceInnerClassMain {
    public static void main(String[] args) {
        InterfaceInsideAClass.c1 interfaceInsideAClass=new InterfaceInsideAClass().new c1();
        interfaceInsideAClass.interfaceMethod1();
        interfaceInsideAClass.interfaceMethod2();
        interfaceInsideAClass.interfaceMethod3();
    }
}
