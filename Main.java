package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        DeliveryFactory myThuckСarFactory = new ThuckСarDeliveryFactory();
        DeliveryFactory myShipFactory = new ShipDeliveryFactory();
        DeliveryFactory myAirFactory = new AirDeliveryFactory();
        Delivery myThuckСarDelivery = myThuckСarFactory.createDelivery();
        Delivery myShipDelivery = myShipFactory.createDelivery();
        Delivery myAirDelivery = myAirFactory.createDelivery();
        System.out.println(myThuckСarDelivery);
        System.out.println(myShipDelivery);
        System.out.println(myAirDelivery);
    }
}
abstract class Delivery {
    String name;
    List<String> accessories = new ArrayList();
    public String toString() {
        return "Model Delivery: " + name + "\n" + accessories;
    }
}
abstract class DeliveryFactory {
    public abstract Delivery createDelivery();

}
class ThuckСarDeliveryFactory extends DeliveryFactory {

    public Delivery createDelivery() {
        return new ThuckСarDelivery();
    }

}
class ShipDeliveryFactory extends DeliveryFactory {

    public Delivery createDelivery() {

        return new ShipDelivery();
    }

}
class AirDeliveryFactory extends DeliveryFactory {

    public Delivery createDelivery() {
        return new AirDelivery();
    }
}

class ThuckСarDelivery extends Delivery {

    public ThuckСarDelivery() {
        name = "Thuck Car";
        accessories.add("водительское удостоверение");
        accessories.add("мед. книжка");
        accessories.add("накладная на товары");
        accessories.add("документы на транспорт");
    }
}
class ShipDelivery extends Delivery {
    public ShipDelivery() {
        name = "Корабль";
        accessories.add("документы на судно");
        accessories.add("водные права");
    }
}
class AirDelivery extends Delivery {
    public AirDelivery() {
        name = "Самолет";
        accessories.add("документы на самолет");
        accessories.add("самолетные права");
        accessories.add("медицинская книжка");
        accessories.add("мед. книжка");
    }
}