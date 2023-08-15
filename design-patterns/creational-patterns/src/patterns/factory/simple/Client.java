package patterns.factory.simple;

import patterns.factory.simple.factory.IphoneFactory;
import patterns.factory.simple.model.Iphone;

public class Client {
    public static void main(String[] args) {
        System.out.println("### Ordering an Iphone X");
        Iphone iphone = IphoneFactory.orderIphone("X", "standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an Iphone 11 HaghEnd");
        Iphone iphone2 = IphoneFactory.orderIphone("11", "haghEnd");
        System.out.println(iphone2);
    }
}
