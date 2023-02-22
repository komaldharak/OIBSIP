import java.util.Scanner;
public class Atm_Interface
{
    public static void main(String args[])
    { 
        int balance = 40000, withdraw, deposit;
        int trial=1;
        Scanner sc = new Scanner(System.in);
        int pinnumber=9096;
        System.out.println("Enter your ATM pin number: ");
        int pass=sc.nextInt();
        
        if(pass!=pinnumber )
        {
            while(true)
            {
                trial++;
            System.out.println("Wrong pin Number!! ");
            System.out.println("Please Re-enter your pin number(Max. Attempts : 3) : ");
            pass=sc.nextInt();
            if(pass==pinnumber)
            {
                break;
            }
            if(trial==3){
                
                System.out.println("You have exceeded your trials !! Retry After some time !");
            System.exit(0);
            }
            }
        }
        if(pass==pinnumber )
        {
            System.out.println("**********WELCOME TO ATM SERVICES***********");  
            while(true)
            {
                System.out.println("1. Check your Balance amount");
                System.out.println("2. Withdraw money");
                System.out.println("3. Deposit money");
                System.out.println("4. QUIT");
                System.out.print("Choose your option: ");
                int choice = sc.nextInt();

                switch(choice)
                {
                    case 1:
                    System.out.println("Your Balance is : "+balance);
                    System.out.println("");
                    break;

                    case 2:
                    System.out.println("Enter amount you want to Withdraw : ");
                    withdraw=sc.nextInt();
                    
                    if(withdraw>balance||balance==0)
                    {
                        System.out.printf("You have insufficient balance!!\n");
                        break;
                    }
                    System.out.println("Hope you collected your amount!");
                    balance=balance-withdraw;
                    System.out.println("Your Balance is : "+balance);
                    System.out.println("");
                    break;

                    case 3:
                    System.out.print("Enter money to be deposited: ");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited to your account");
                    System.out.println("Your Balance is : "+balance);
                    System.out.println(" ");
                    break;

                    case 4:
                    System.out.println("THANK YOU FOR USING ATM !");
                    System.exit(0);
                }
            }
       }
    }
}