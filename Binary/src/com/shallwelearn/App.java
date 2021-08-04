package com.shallwelearn;

public class App {
    
    public static void main(String[] args) throws Exception {

        InputReader inputReader = new InputReader();

        BinaryCalculator calculator = new BinaryCalculator();

        BinaryPrinter printer = new BinaryPrinter();

        String aStr = inputReader.readUserInput("A");
        Integer a = Integer.valueOf(aStr);

        String bStr = inputReader.readUserInput("B");
        Integer b = Integer.valueOf(bStr);


        int andVal = calculator.andVals(a, b);
        int orVal = calculator.orVals(a, b);
        int xorVal = calculator.xorVals(a, b);                
        System.out.println(a + " AND " + b + " = " + printer.convertIntegerToBinary(andVal));
        System.out.println(a + " OR " + b + " = " + printer.convertIntegerToBinary(orVal));
        System.out.println(a + " XOR " + b + " = " + printer.convertIntegerToBinary(xorVal));

        inputReader.close();
    }

}
