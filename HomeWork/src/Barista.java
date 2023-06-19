public class Barista {

    public Barista() {
    }

    public Coffee makeCoffee(Menu menu){
        Coffee make = CoffeeFactory.make(menu);
        System.out.println(menu+"커피만드는중");

        return make;
    }
}
