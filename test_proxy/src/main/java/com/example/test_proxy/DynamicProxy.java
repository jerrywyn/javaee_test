package com.example.test_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler
{
    private Object o;

    public DynamicProxy(Object o){
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        System.out.println("doing something before");
        method.invoke(o,args);
        System.out.println("doing something after");
        return null;
    }
}
