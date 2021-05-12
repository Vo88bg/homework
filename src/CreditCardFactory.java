public class CreditCardFactory {

        public CreditCardFactory create(int creditScore){

            if(creditScore > 650){
                return new VisaFactory();
            }else{
                return new AmericanExpressFactory();
            }

        }

}
