public enum Menu {
    Americano(1500),Cappuccino(2000),CaramelMacchiato(2500),Espresso(2500);

    private int price;

    Menu(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
