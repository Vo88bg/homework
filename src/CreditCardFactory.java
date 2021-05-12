public class CreditCardFactory {


    

    public VisaFactory getVisaFactory() {
        return new VisaFactory();
    }

    public AmericanExpressFactory getAmericanExpressFactory(){
        return new AmericanExpressFactory();
    }


}
