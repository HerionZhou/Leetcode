package DesignPattern.Proxy;

public interface IHttp {
    void request(String sendData);
    void onSuccess(String receiveData);
}
