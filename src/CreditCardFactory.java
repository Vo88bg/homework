public class CreditCardFactory implements AbstractFactory<CreditCard>{

    @Override
    public CreditCard create(int creditScore, String cardHolder){
        if(creditScore > 650){
            return new Visa(cardHolder, 234234l);
        }else{
            return new AmericanExpress(cardHolder);
        }
    }



}
