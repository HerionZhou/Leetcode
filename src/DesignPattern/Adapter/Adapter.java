package DesignPattern.Adapter;

public class Adapter {
    int convert(int homeVolt){
        int chargeVolt = homeVolt - 215;
        return chargeVolt;
    }
}
