import java.util.Random;

public class Main {
    public static void main(String[] args) {

        CreditCardFactory creditCardFactory = new CreditCardFactory();
        CreditCard peterCard = creditCardFactory.create(123, "Peter Simpson");
        System.out.println(peterCard.getClass().getSimpleName());
        //test comment
    }
}
