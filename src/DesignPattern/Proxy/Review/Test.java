package DesignPattern.Proxy.Review;

public class Test {
    public static void main(String[] args) {
        HttpUtil httpUtil = new HttpUtil();
        HttpProxy proxy = new HttpProxy();
        proxy.setTarget(httpUtil);

        IHttp result = (IHttp) proxy.getProxy();
        result.success("123");
    }
}
