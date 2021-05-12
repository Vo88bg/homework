public class VisaFactory extends CreditCardFactory{

    public Visa create(){

       return new Visa(234L, "");
    }

}
