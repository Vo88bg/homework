public class AmericanExpressFactory implements AbstractFactory{

    @Override
    public AmericanExpress create(String cardHolder){
        return new AmericanExpress(CreditCardFactory.generateCardNumber(false), cardHolder);
    }

}
