package challenges.delivery_factory.models;

public class ExpressDelivery implements Delivery{
    @Override
    public String deliveryType() {
        return "Express";
    }

    @Override
    public double calculateCost() {
        return 50;
    }

    @Override
    public String estimateDeliveryTime() {
        return "2 dias";
    }

    @Override
    public String toString() {
        return "Tipo: " + deliveryType() + "\nValor de R$" + calculateCost() + "\nTempo estimado: " + estimateDeliveryTime();
    }
}
