package patterns.factory.after.factory;

import patterns.factory.after.model.Iphone;
import patterns.factory.after.model.IphoneXSMax;

public class IphoneXSMaxFactory extends IphoneFactory{
    @Override
    public Iphone createIphone() {
        return new IphoneXSMax();
    }
}
