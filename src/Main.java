import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int bonus;
        int account = 500;
        int deposit = 1500;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый счет:" + (account + deposit + bonus) + " " + "р");
        System.out.println("в том числе бонусных рублей:" + bonus);

    }
}