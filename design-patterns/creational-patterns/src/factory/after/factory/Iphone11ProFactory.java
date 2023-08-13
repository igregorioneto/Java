package factory.after.factory;

import factory.after.model.Iphone;
import factory.after.model.Iphone11Pro;

public class Iphone11ProFactory extends IphoneFactory{
    @Override
    public Iphone createIphone() {
        return new Iphone11Pro();
    }
}
