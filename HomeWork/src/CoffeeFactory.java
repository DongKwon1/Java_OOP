public class CoffeeFactory {
    public static Coffee make(Menu menu) {
        return switch (menu) {
            case Espresso -> new EspressoCoffee();
            case Cappuccino -> new CappuccinoCoffee();
                case CaramelMacchiato -> new CaramelMacchiatoCoffee();
            case Americano -> new AmericanoCpffee();
        };
    }
}
