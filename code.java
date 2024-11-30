
#bank operation using oops in java

import java.util.*;
class Atm{
    int balance;
    int pin=1234,user;
    public void checkPin(){
        System.out.println("Enter your pin: ");
        Scanner sc=new Scanner(System.in);
        user=sc.nextInt();
        if(user==pin){
            menu();
        }else{
        System.out.println("Invalid password");
        }
    }
    public void menu(){
        System.out.println("------------------");
        System.out.print("1.Deposit amount\n 2.Withdraw amount \n 3.Check Balance\n 4.Exit\n");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        if(ch==1){
            System.out.println("Enter the amount you want to deposit:");
            int bal=sc.nextInt();
            balance=bal+balance;
            System.out.println(bal+" amount deposited successfully");
            menu();
        }
        if(ch==2){
            System.out.println("Enter the amount you want to withdraw:");
            int amount=sc.nextInt();
            if(amount<=balance){
                balance=balance-amount;
                System.out.println(amount+" withdrawn successfully");
            }else{
                System.out.println("Insufficient Fund");
            }
            menu();
        }
        if(ch==3){
            System.out.println("Your current balance is: "+balance+" rupees");
            menu();
        }
        if(ch==4){
            System.out.println("Successfully exited");
            System.exit(0);
            
        }
    }
}
    
class Main {
    public static void main(String[] args) {
        Atm m=new Atm();
        m.checkPin();
    }
}
