public abstract class  CreditCard {
    private long cardNumber;
    private String cardHolder;
    private String csc;


    public  CreditCard (String cardHolder){
        this.cardHolder = cardHolder;
        this.cardNumber = generateCardNumber();
        this.csc = generateCsc();
    }


    public long generateCardNumber(){
        return 0;
    }

    public String generateCsc(){
        String result = "";
        int randomNum = (int)Math.floor(Math.random() * 999);

        if(randomNum < 10){
            result+="00";
            result+=randomNum;
        }else if(randomNum > 10 && randomNum < 100){
            result+="0";
            result+=randomNum;
        }else {
            result = String.valueOf(randomNum);
        }

        return result;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void setCsc(String csc) {
        this.csc = csc;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public String getCsc() {
        return csc;
    }
}
