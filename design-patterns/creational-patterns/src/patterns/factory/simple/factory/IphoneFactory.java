package patterns.factory.simple.factory;


import patterns.factory.simple.model.*;

public class IphoneFactory {

    public static Iphone orderIphone(String generation, String level) {
        Iphone device = null;

        if ("X".equals(generation)) {
            if ("standard".equals(level)) {
                device = new IphoneX();
            } else if ("haghEnd".equals(level)) {
                device = new IphoneXSMax();
            }
        } else if ("11".equals(generation)) {
            if ("standard".equals(level)) {
                device = new Iphone11();
            } else if ("haghEnd".equals(level)) {
                device = new Iphone11Pro();
            }
        }

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
