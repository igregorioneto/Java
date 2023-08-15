package challenges.delivery_factory.factory;

import challenges.delivery_factory.models.Delivery;
import challenges.delivery_factory.models.ExpressDelivery;

public class ExpressDeliveryFactory implements DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new ExpressDelivery();
    }
}
