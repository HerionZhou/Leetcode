package DesignPattern.Adapter;

public class USBLine {
    void charge(int volt){
        if (volt != 5) throw new IllegalArgumentException("只能接收5v电压!");
        System.out.println("正常充电");
    }
}
