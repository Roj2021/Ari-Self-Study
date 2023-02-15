package class12;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iPhone=new Phone();
        iPhone. brand="Iphone 13";
        iPhone.color="Blue";
        iPhone.price=1200;
        iPhone.version=13;
        iPhone.isUnlocked=true;

        Phone googlePixel=new Phone();
        googlePixel. brand="Pixel";
        googlePixel.color="Black";
        googlePixel.price=1200;
        googlePixel.version=7;
        googlePixel.isUnlocked=false;
        googlePixel.sendingMessage();
        googlePixel.playingGame();

        Phone samsung=new Phone();
        samsung. brand="Samsun";
        samsung.color="red";
        samsung.price=1200;
        samsung.version=11;
        samsung.isUnlocked=true;
        samsung.playingGame();
        samsung.sendingMessage();
        samsung.checkingAndSendingEmails();



        Phone nokia =new Phone();
        nokia. brand="nokia 3310";
        nokia.color="Blue";
        nokia.price=200;
        nokia.version=3;
        nokia.isUnlocked=true;
        nokia.checkingAndSendingEmails();
        nokia.sendingMessage();




    }
}
