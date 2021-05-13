import java.util.Random;

public class Main {


    public static void main(String[] args) {



        AbstractFactory factory = CreditCardFactory.create(600);
        CreditCard ae =  factory.create("Vyrban");
        CreditCard ae1 =  factory.create("Sulyo");
        CreditCard ae2 =  factory.create("Pulyo");
        CreditCard ae3 =  factory.create("Stratsimir");
        CreditCard ae4 =  factory.create("Sanyo");
        CreditCard ae5 =  factory.create("Kolyo");
        CreditCard ae6 =  factory.create("Mozart Mozkata");


        AbstractFactory visaFactory = CreditCardFactory.create(800);
        CreditCard v = visaFactory.create("Hristo Camaroto");
        CreditCard v1 = visaFactory.create("Rambo Silek");
        CreditCard v2 = visaFactory.create("5ko");
        CreditCard v3 = visaFactory.create("Room Yana");

        System.out.println(ae.getCardHolder());
        System.out.println(ae1.getCardHolder());
        System.out.println(ae2.getCardHolder());
        System.out.println(ae3.getCardHolder());
        System.out.println(ae4.getCardHolder());
        System.out.println(ae5.getCardHolder());
        System.out.println(ae6.getCardHolder());


        System.out.println(v.getCardHolder());
        System.out.println(v1.getCardHolder());
        System.out.println(v2.getCardHolder());
        System.out.println(v3.getCardHolder());
    }
}
