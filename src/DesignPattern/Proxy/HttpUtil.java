package DesignPattern.Proxy;

public class HttpUtil implements IHttp {
    @Override
    public void request(String sendData) {
        System.out.println("网络请求中...");
    }

    @Override
    public void onSuccess(String receiveData) {
        System.out.println("网络请求完成.");
    }
}
