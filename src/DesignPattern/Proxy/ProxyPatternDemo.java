package DesignPattern.Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        HttpUtil httpUtil = new HttpUtil();
        IHttp proxy = new DynamicProxy().getInstance(httpUtil);
        proxy.request("123");
    }
}
