package com.example.test_proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@SpringBootApplication
public class TestProxyApplication
{

    public static void main(String[] args)
    {
        //dynamic proxy
        RealClazz realClazz = new RealClazz();
        InvocationHandler invocationHandler = new DynamicProxy(realClazz);
        SubjectClazz realProxy = (SubjectClazz)Proxy.newProxyInstance(SubjectClazz.class.getClassLoader(),new Class<?>[]{SubjectClazz.class},invocationHandler);
        realProxy.testPrint();



        //static proxy
        SpringApplication.run(TestProxyApplication.class, args);
        SubjectClazz subjectClazz = new ProxyClazz();
        subjectClazz.testPrint();
    }

}
