package challenges.delivery_factory.factory;

import challenges.delivery_factory.models.Delivery;
import challenges.delivery_factory.models.StandardDelivery;

public class StandardDeliveryFactory implements DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new StandardDelivery();
    }
}
