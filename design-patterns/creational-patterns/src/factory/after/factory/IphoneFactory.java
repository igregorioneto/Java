package factory.after.factory;

import factory.after.model.Iphone;

public abstract class IphoneFactory {
    public Iphone orderIphone() {
        Iphone device = createIphone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    public abstract Iphone createIphone();
}
