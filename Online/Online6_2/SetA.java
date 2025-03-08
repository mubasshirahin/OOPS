package Online.Online6_2;

class NotApplicableForChildrenException extends Exception{
    public NotApplicableForChildrenException(String message){
        super(message);
    }
}

class CardNotWorkingException extends Exception{
    public CardNotWorkingException(String message){
        super(message);
    }
}

class TicketSeller{
    public void checkAge(int age,double rating) throws NotApplicableForChildrenException{
        if(age<18 && rating<3){
            throw new NotApplicableForChildrenException("Handled");
        }
        else if(age<15 && rating<2.5){
            throw new NotApplicableForChildrenException("Handled");
        }
        else if(age<18 && rating>3.5){
            System.out.println("Applicable for kids");
        }
    }
    public void checkCard(String cardNumber)throws CardNotWorkingException{
        if(cardNumber.length()<16){
            throw new CardNotWorkingException("Handled");
        }
        else{
            System.out.println("Card is valid");
        }
    }
}


public class SetA {
    public static void main(String[] args){
        TicketSeller ts = new TicketSeller();

        try{
        ts.checkAge(17,1.5);
        ts.checkCard("1111111111111111111");
        }catch (Exception e){
            System.out.println("Exception Handled");
        }
    }
}
