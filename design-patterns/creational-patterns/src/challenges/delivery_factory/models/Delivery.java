package challenges.delivery_factory.models;

public interface Delivery {
    String deliveryType();
    double calculateCost();
    String estimateDeliveryTime();
}
