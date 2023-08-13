package factory.after.factory;

import factory.after.model.Iphone;
import factory.after.model.IphoneX;

public class IphoneXFactory extends IphoneFactory{
    @Override
    public Iphone createIphone() {
        return new IphoneX();
    }
}
