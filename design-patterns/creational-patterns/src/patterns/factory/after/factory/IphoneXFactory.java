package patterns.factory.after.factory;

import patterns.factory.after.model.Iphone;
import patterns.factory.after.model.IphoneX;

public class IphoneXFactory extends IphoneFactory{
    @Override
    public Iphone createIphone() {
        return new IphoneX();
    }
}
