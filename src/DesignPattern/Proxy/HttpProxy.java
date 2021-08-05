package DesignPattern.Proxy;

public class HttpProxy implements IHttp {
    private final HttpUtil httpUtil;

    public HttpProxy(HttpUtil httpUtil) {
        this.httpUtil = httpUtil;
    }

    @Override
    public void request(String sendData) {
        System.out.println("发送数据：" + sendData);
        httpUtil.request(sendData);
    }

    @Override
    public void onSuccess(String receiveData) {
        System.out.println("收到数据：" + receiveData);
        httpUtil.onSuccess(receiveData);
    }
}
