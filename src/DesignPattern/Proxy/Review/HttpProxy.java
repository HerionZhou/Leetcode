package DesignPattern.Proxy.Review;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HttpProxy implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("request")) {
            System.out.println("发送数据" + args[0]);
            Object result = method.invoke(target, args);
            return result;
        } else if (method.getName().equals("success")) {
            System.out.println("接收数据" + args[0]);
            Object result = method.invoke(target, args);
            return result;
        }
        return null;
    }
}
