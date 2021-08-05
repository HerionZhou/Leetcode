package DesignPattern.Builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MilkTea tea = new MilkTea.Builder("tea").size("大杯").ice(false).build();
        System.out.println(tea.toString());
    }
}
