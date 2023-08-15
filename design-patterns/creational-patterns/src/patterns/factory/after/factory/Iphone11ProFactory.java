package patterns.factory.after.factory;

import patterns.factory.after.model.Iphone;
import patterns.factory.after.model.Iphone11Pro;

public class Iphone11ProFactory extends IphoneFactory{
    @Override
    public Iphone createIphone() {
        return new Iphone11Pro();
    }
}
