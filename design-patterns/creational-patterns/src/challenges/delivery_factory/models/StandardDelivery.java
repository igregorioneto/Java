package challenges.delivery_factory.models;

public class StandardDelivery implements Delivery{
    @Override
    public String deliveryType() {
        return "Standard";
    }

    @Override
    public double calculateCost() {
        return 15;
    }

    @Override
    public String estimateDeliveryTime() {
        return "15 dias";
    }

    @Override
    public String toString() {
        return "Tipo: " + deliveryType() + "\nValor de R$" + calculateCost() + "\nTempo estimado: " + estimateDeliveryTime();
    }
}
