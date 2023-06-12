public class EspressoCoffee implements  Coffee{
    @Override
    public String getName() {
        return "EspressoCoffee";
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}
