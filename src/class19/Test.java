package class19;

public class Test {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=12314124094428l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        //ba.transfer(); it is not available because parent class can not access to child class

        System.out.println("------creating object");

        Checking check=new Checking();
        //feature from parent class
        check.accountNumber=5674;
        check.money=798;
        //feature from checking class
        check.interest=0;

        check.deposit(); //from parent class
        check.transfer(); //from checking class

        Saving save=new Saving();
        save.accountNumber=1242343253443l;
        save.money=9980;
        save.profit=100;
        //save.interest=0 sibling feature are not available
        save.takeProfit();

        SuperSaving superSaving=new SuperSaving();

        superSaving.accountNumber=1233949931l;
        superSaving.money=1000;
        superSaving.profit=234;
        superSaving.deposit();
        superSaving.superSaving();

    }
}
