package DesignPattern.Adapter;

public class User {
    public static void main(String[] args) {
        HomeBattery homeBattery = new HomeBattery();
        int volt = homeBattery.supply();
        System.out.println("家用电源电压为" + volt + "v");

        USBLine usbLine = new USBLine();
        Adapter adapter = new Adapter();
        usbLine.charge(adapter.convert(volt));
    }
}
