package org.example;

public class AnonymousInnerClass {
    AnonymousInterface anonymousInterface = new AnonymousInterface() {
        @Override
        public void interfaceMethod1() {
            System.out.println("Method1");
        }

        @Override
        public void interfaceMethod2() {
            System.out.println("Method2");
        }

        @Override
        public void interfaceMethod3() {
            System.out.println("Method3");

        }
        public void interfaceMethod4() {
            System.out.println("Method4");
        }
    };
}
