import java.util.Random;

public class CreditCardFactory {

    public static AbstractFactory create(int creditScore){

        if(creditScore > 650){
            return new VisaFactory();
        }else{
            return new AmericanExpressFactory();
        }

    }

    public static long generateCardNumber(boolean isVisa){
        long result = 0L;
        Random random = new Random();

        if(isVisa){
            int[] prefix = {41,45,49};

            if(Math.floor(Math.random()*2)==0){
                result = Long.parseLong(prefix[(int)Math.floor(Math.random()*3)] + "" +
                        (random.nextInt(999999-100000)+100000) +
                        (random.nextInt(9999999-1000000)+1000000));

            }else{
                result = Long.parseLong(prefix[(int)Math.floor(Math.random()*3)] + "" +
                        (random.nextInt(9999999-1000000)+1000000) +
                        (random.nextInt(9999999-1000000)+1000000));
            }
        }else{
            int[] prefix = {34,37};

            result = Long.parseLong(prefix[(int) Math.floor(Math.random()*2)] + "" +
                    (random.nextInt(9999999-1000000) + 1000000) +
                    (random.nextInt(99999999-10000000) + 10000000));

        }

        return result;
    }

}
