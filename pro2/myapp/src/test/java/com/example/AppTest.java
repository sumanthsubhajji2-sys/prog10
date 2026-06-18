package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AppTest{
    @Test
    public void testadd(){
        App app =new App();
        int result = app.add(10,5);
        System.out.println("result is 10+5 =" +result);
        Assert.assertEquals(15,result);
    }
}
