package com.driver;

public class Main {

    public static class A {

        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] arg) {
        B obj = new B();

//      when in class B have not function/method then output :
        String s = obj.meth(); // s = Invoking method from class A

        // if make a function in class B the call the meth function then output :
        System.out.println(s); // Method is overridden in Extendend class B
    }
}