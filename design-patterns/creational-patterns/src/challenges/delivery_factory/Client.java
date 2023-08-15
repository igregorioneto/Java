package challenges.delivery_factory;

import challenges.delivery_factory.factory.DeliveryFactory;
import challenges.delivery_factory.factory.ExpressDeliveryFactory;
import challenges.delivery_factory.factory.ScheduledDeliveryFactory;
import challenges.delivery_factory.factory.StandardDeliveryFactory;
import challenges.delivery_factory.models.Delivery;

public class Client {
    public static void main(String[] args) {
        DeliveryFactory factory = new StandardDeliveryFactory();
        Delivery delivery = factory.createDelivery();
        System.out.println(delivery);

        factory = new ExpressDeliveryFactory();
        delivery = factory.createDelivery();
        System.out.println(delivery);

        factory = new ScheduledDeliveryFactory();
        delivery = factory.createDelivery();
        System.out.println(delivery);
    }
}
