package patterns.factory.after;

import patterns.factory.after.factory.Iphone11ProFactory;
import patterns.factory.after.factory.IphoneFactory;
import patterns.factory.after.factory.IphoneXFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("### Ordering an Iphone X");
        IphoneFactory iphone = new IphoneXFactory();
        System.out.println(iphone.orderIphone());

        System.out.println("\n\n### Ordering an Iphone 11 HaghEnd");
        IphoneFactory iphone2 = new Iphone11ProFactory();
        System.out.println(iphone2.orderIphone());
    }
}
