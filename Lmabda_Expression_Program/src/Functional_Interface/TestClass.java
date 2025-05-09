package Functional_Interface;

public class TestClass {

    public static void main(String[] args) {
        FunctionalInterface functionalInterface = () -> {
            System.out.println("Hell0");
            System.out.println();
        };

        functionalInterface.show();

    }}