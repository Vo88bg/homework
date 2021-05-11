import java.util.Random;

public class AmericanExpress extends CreditCard{


    public AmericanExpress(String cardHolder) {
        super(cardHolder);
    }

    @Override
    public long generateCardNumber(){
        long result = 0;

            int[] prefix = {34, 37};
            Random random = new Random();
            String firstPart = String.valueOf(random.nextInt(999999 - 100000) + 100000);
            String secondPart = String.valueOf(random.nextInt(9999999 - 1000000) + 1000000);
            result = Long.parseLong(prefix[random.nextInt(2)] + firstPart + secondPart);

        return result;
    }

}
