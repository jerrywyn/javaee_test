package com.example.test_proxy;

public class ProxyClazz implements SubjectClazz
{
    private RealClazz realClazz = new RealClazz();

    @Override
    public void testPrint()
    {
        System.out.println("proxy  work...");
        realClazz.testPrint();
    }
}
