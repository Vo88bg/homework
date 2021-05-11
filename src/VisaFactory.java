import java.util.Random;

public class VisaFactory {


    public Visa createVisa(String cardHolder){
        long result = 0;
        int[] prefix = {41,45, 49};
        Random random = new Random();

        if(Math.floor(Math.random()*2) == 0){

            String firstPart = String.valueOf(random.nextInt(9999999 - 1000000) + 1000000);
            String secondPart = String.valueOf(random.nextInt(9999999 - 1000000) + 1000000);
            result = Long.parseLong(prefix[random.nextInt(3)] + firstPart + secondPart);
        }else{

            String firstPart = String.valueOf(random.nextInt(99999 - 10000) + 10000);
            String secondPart = String.valueOf(random.nextInt(999999 - 100000) + 100000);
            result = Long.parseLong(prefix[random.nextInt(3)] + firstPart + secondPart);
        }

        return new Visa(cardHolder, result);
    }

}
