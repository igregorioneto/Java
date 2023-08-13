package factory.after.factory;

import factory.after.model.Iphone;
import factory.after.model.IphoneXSMax;

public class IphoneXSMaxFactory extends IphoneFactory{
    @Override
    public Iphone createIphone() {
        return new IphoneXSMax();
    }
}
