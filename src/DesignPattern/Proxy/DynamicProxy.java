package DesignPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
    private HttpUtil httpUtil;

    public IHttp getInstance(HttpUtil httpUtil){
        this.httpUtil = httpUtil;
        return (IHttp) Proxy.newProxyInstance(httpUtil.getClass().getClassLoader(), httpUtil.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("request")){
            System.out.println("发送数据：" + args[0]);
            return method.invoke(httpUtil, args);
        }
        else if (method.getName().equals("onSuccess")){
            System.out.println("接收数据：" + args[0]);
            return method.invoke(httpUtil, args);
        }
        return null;
    }
}
