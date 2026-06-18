package com.example;

public class App {

    public int add(int a , int b) {
        return a + b;
    }
    public static void main( String[] args ){
        App app =new App();
        int result = app.add(10,5);
        System.out.println( "10+5 =" + result );
        System.out.println(" Application is successfully executed ! ");
    }
}
