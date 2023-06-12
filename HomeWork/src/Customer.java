import java.util.List;

public class Customer {
    private String name;
    private int money = 10000;

    private final Barista barista;

    public Customer(String name, int money, Barista barista) {
        this.name = name;
        this.money = money;
        this.barista = barista;
    }

    public void order(Menu menu){
        //커피 가격을 CoffeeCalculator 에서 계산한다
        int price = CoffeeCalculator.calculate(menu);
        //잔액 검사
        if (this.money < price){
            System.out.println( this.name +": 소지금이 적어 주문할 수 없어 를 출력하고 아무런 행동도 하지 않습니다.");
            return;
        }
        // 커피 계산
        this.money -= price;
        List<Coffee> coffee = barista.makeCoffee(menu);
        System.out.println("고객님 께서 주문하신" + menu + price + "원 되겠습니다. 곧 준비해드리겠습니다 ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}
