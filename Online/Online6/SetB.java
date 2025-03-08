package Online.Online6;

interface Features1{
    public void sendText(String text);
    public void receiveText(String text);
}

class Messenger implements Features1{
    @Override
    public void sendText(String text) {
        System.out.println("Sending Message: "+ text);
    }

    @Override
    public void receiveText(String text) {
        System.out.println("Receiving Text : "+ text);
    }
}

interface Features2{
    public void sendCall(String name);
    public  void receiveCall(String name);
}

class Caller implements Features2{
    @Override
    public void sendCall(String name) {
        System.out.println("Sending Calling : "+ name);
    }

    @Override
    public void receiveCall(String name) {
        System.out.println("Receiving Call: "+ name);
    }
}

class DefaultMessage extends Messenger{
}

class ModernMessenger extends Messenger{
    public void sendPhotos(String name){
        System.out.println(name);
    }
    public void receivePhotos(String name){
        System.out.println(name);
    }
}

class Whatsapp extends ModernMessenger{
    public void showStatus(String name){
        System.out.println(name);
    }
}


public class SetB {
    public static void main(String[] args) {
        Whatsapp wp = new Whatsapp();
        DefaultMessage df = new DefaultMessage();

        wp.sendText("ds");
        df.receiveText("sdssv");
    }
}
