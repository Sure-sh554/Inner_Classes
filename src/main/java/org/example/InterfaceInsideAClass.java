package org.example;

public class InterfaceInsideAClass {
    // Is it possible write an interface inside a class?
    //  Yes, it possible to provide an interface inside a class, but, the respective implementation class must be provided with in the same outer class.

    interface i1 {
        void interfaceMethod1();

        void interfaceMethod2();

        void interfaceMethod3();
    }

    class c1 implements i1 {
        public void interfaceMethod1() {
            System.out.println("Interface method 1");
        }

        public void interfaceMethod2() {
            System.out.println("Interface method 2");
        }

        public void interfaceMethod3() {
            System.out.println("Interface method 3");
        }
    }
}
