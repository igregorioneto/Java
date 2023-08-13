package factory.half_simple.factory;

import factory.half_simple.model.Iphone;

public abstract class IphoneFactory {
    public Iphone orderIphone(String level) {
        Iphone device = null;
        device = createIphone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    public abstract Iphone createIphone(String level);
}
