package patterns.factory.after.factory;

import patterns.factory.after.model.Iphone;
import patterns.factory.after.model.Iphone11;

public class Iphone11Factory extends IphoneFactory{
    @Override
    public Iphone createIphone() {
        return new Iphone11();
    }
}
