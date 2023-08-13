package factory.half_simple;

import factory.half_simple.factory.Iphone11Factory;
import factory.half_simple.factory.IphoneFactory;
import factory.half_simple.factory.IphoneXFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("### Ordering an Iphone X");
        IphoneFactory iphone = new IphoneXFactory();
        System.out.println(iphone.orderIphone("standard"));

        System.out.println("\n\n### Ordering an Iphone 11 HaghEnd");
        IphoneFactory iphone2 = new Iphone11Factory();
        System.out.println(iphone2.orderIphone("haghEnd"));
    }
}
