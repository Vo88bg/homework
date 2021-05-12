public class AmericanExpressFactory extends CreditCardFactory{


    public AmericanExpress create(){

        return new AmericanExpress(234L, "");
    }

}
