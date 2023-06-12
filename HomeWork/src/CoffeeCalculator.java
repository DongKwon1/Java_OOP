public class CoffeeCalculator

{
    public static int calculate(Menu menu){
        return Math.max(menu.getPrice() * 1, 0);
    }
}
