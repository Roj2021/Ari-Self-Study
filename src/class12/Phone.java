package class12;

public class Phone {

    String brand;
    String color;
    int price;
    int version;
    double storage;
  boolean isUnlocked;

   void  ringing(){
       System.out.println("Ringringringring");
   }
   void sendingMessage(){
       System.out.println("SMS");
   }
   void calling(){
       System.out.println("Sending and Receiving Calls");
   }
   void usingGps(){
       System.out.println("Showing direction");
   }
   void playingGame(){
       System.out.println("Video games");
   }
   void checkingAndSendingEmails(){
       System.out.println("Email Notification");
}
}
