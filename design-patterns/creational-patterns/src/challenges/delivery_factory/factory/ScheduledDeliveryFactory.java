package challenges.delivery_factory.factory;

import challenges.delivery_factory.models.Delivery;
import challenges.delivery_factory.models.ScheduledDelivery;

public class ScheduledDeliveryFactory implements DeliveryFactory {
    @Override
    public Delivery createDelivery() {
        return new ScheduledDelivery();
    }
}
