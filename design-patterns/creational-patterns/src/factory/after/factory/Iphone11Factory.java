package factory.after.factory;

import factory.after.model.Iphone;
import factory.after.model.Iphone11;

public class Iphone11Factory extends IphoneFactory{
    @Override
    public Iphone createIphone() {
        return new Iphone11();
    }
}
