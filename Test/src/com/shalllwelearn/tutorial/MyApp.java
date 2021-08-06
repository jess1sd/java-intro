package com.shalllwelearn.tutorial;
public class MyApp {

    public static void main(String[] args) throws Exception {
        // MyApp : class type
        // myApp : a variable of the type MyApp
        // new MyApp() : to call constructor of MyApp
        MyInfo myInfo = new MyInfo();
        int luckyNumber = myInfo.getMyLuckyNumber();
        String name = myInfo.getMyName();

        MyInfo myInfo1 = new MyInfo(12, "JoeB");


        System.out.println("Hello, World! Lucky Visitor=" + myInfo.getMyLuckyNumber() );
        System.out.println("Hello, World! Lucky Visitor=" + myInfo1.getMyLuckyNumber() );
         

        System.out.println("Goodbye, World!");
        System.out.println("Hello Again!");        
    }

    

    public class YourApp {
    
    }
}


