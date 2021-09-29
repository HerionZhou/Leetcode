package DesignPattern.Proxy.Review;

public class HttpUtil implements IHttp {
    @Override
    public void request(String data) {
        System.out.println("网络请求中...");
    }

    @Override
    public void success(String data) {
        System.out.println("网络请求成功!");
    }
}
