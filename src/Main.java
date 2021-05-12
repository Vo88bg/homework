import java.util.Random;

public class Main {
    public static void main(String[] args) {


        CreditCardFactory c = new CreditCardFactory();
        VisaFactory v = (VisaFactory)c.create(200);

    }
}
