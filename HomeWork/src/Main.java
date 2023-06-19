import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//
        //바리스타
       Barista barista = new Barista();
       //손님
       Customer customer =new Customer("서동권",10000,barista);
       //주문
        customer.order(Menu.Americano);
        int money = customer.getMoney();
        System.out.println("현재 잔액은" +money+ "입니다.");

    }
}