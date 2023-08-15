package patterns.factory.half_simple.factory;

import patterns.factory.half_simple.model.Iphone;
import patterns.factory.half_simple.model.IphoneX;
import patterns.factory.half_simple.model.IphoneXSMax;

public class IphoneXFactory extends IphoneFactory{
    @Override
    public Iphone createIphone(String level) {
        if("standard".equals(level)) {
            return new IphoneX();
        } else if ("hagnEnd".equals(level)) {
            return new IphoneXSMax();
        } else {
            return null;
        }
    }
}
