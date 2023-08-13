package factory.before;

import factory.before.model.*;

public class Client {

    public Iphone orderIphone(String generation, String level) {
        Iphone device = null;

        if("X".equals(generation)) {
            if ("standard".equals(level)) {
                device = new IphoneX();
            } else if ("highEnd".equals(level)) {
                device = new IphoneXSMax();
            }
        } else if ("11".equals(generation)){
            if ("standard".equals(level)) {
                device = new Iphone11();
            } else if ("highEnd".equals(level)) {
                device = new Iphone11Pro();
            }
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("### Ordering an Iphone X");
        Iphone iphone = client.orderIphone("X", "standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an Iphone 11 HighEnd");
        Iphone iphone2 = client.orderIphone("11", "highEnd");
        System.out.println(iphone2);
    }
}
