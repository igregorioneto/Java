package factory.half_simple.factory;

import factory.half_simple.model.Iphone;
import factory.half_simple.model.Iphone11;
import factory.half_simple.model.Iphone11Pro;

public class Iphone11Factory extends IphoneFactory{
    @Override
    public Iphone createIphone(String level) {
        if("standard".equals(level)) {
            return new Iphone11();
        } else if ("haghEnd".equals(level)) {
            return new Iphone11Pro();
        } else {
            return null;
        }
    }
}
