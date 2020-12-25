package com.example.test_proxy;

public class RealClazz implements SubjectClazz
{
    @Override
    public void testPrint()
    {
        System.out.println("real work...");
    }
}
