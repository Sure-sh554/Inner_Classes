package org.example;

public class ExtendingInnerClass {
    class InnerClass {
        public void print1() {
            System.out.println("This is an inner class.");
        }
    }

    class InnerClass2 extends InnerClass {
        public void print2() {
            System.out.println("This is an inner class 2.");
        }
    }

    class InnerClass3 extends InnerClass2 {
        public void print3() {
            System.out.println("This is an inner class 3.");
        }
    }

    public void print4() {
        System.out.println("This is a outer class.");
    }
}
