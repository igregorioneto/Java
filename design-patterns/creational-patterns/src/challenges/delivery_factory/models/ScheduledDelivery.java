package challenges.delivery_factory.models;

public class ScheduledDelivery implements Delivery{
    @Override
    public String deliveryType() {
        return "Scheduled";
    }

    @Override
    public double calculateCost() {
        return 35;
    }

    @Override
    public String estimateDeliveryTime() {
        return "Toda Segunda, Quarta e Sexta a partir das 14 horas";
    }

    @Override
    public String toString() {
        return "Tipo: " + deliveryType() + "\nValor de R$" + calculateCost() + "\nTempo estimado: " + estimateDeliveryTime();
    }
}
