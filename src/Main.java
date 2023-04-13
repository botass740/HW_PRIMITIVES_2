
public class Main {
    public static void main(String[] args) {

        int balance = 300;
        int cash = 1001;
        int bonus = cash / 100;

        if (cash > 1000) {
            bonus = cash / 100;
        } else {
            bonus = 0;
        }
        int balans = balance + cash + bonus;
        System.out.println("Начислено бонусов - " + bonus);
        System.out.println("Ваш баланс равен " + balans);
    }
}