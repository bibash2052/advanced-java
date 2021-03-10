package com.bibash;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    void greeting(String name);
}

@FunctionalInterface
interface NewFunctionalInterface {
    void displayMessage();
}

class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample interfaceExample = new FunctionalInterfaceExample() {
            @Override
            public void greeting(String name) {
                System.out.println("Hello " + name);
            }
        };

        interfaceExample.greeting("Bibash");

//        Using lambdas
        FunctionalInterfaceExample interfaceExample1 = (name) -> {
            System.out.println("Hello " + name + " from lambdas");
        };
        interfaceExample1.greeting("Bibash");

        NewFunctionalInterface newFunctionalInterface = () -> {
            System.out.println("From new functional Interface");
        };
        newFunctionalInterface.displayMessage();
    }
}