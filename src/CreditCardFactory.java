public class CreditCardFactory {

   static public CreditCardFactory create(int creditScore, String cardHolder){
        if(creditScore > 650){
            return new VisaFactory();
        }else{
            return new AmericanExpressFactory();
        }

    }

}
