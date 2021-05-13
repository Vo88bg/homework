public class VisaFactory implements AbstractFactory{

    @Override
    public Visa create(String cardHolder){
       return new Visa(CreditCardFactory.generateCardNumber(true), cardHolder);
    }

}
