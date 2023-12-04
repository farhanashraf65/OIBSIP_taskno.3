import java.util.Scanner;
//Hi! this Farhan Ashraf and this is my 2nd task Atm Interface
public class AtmInterFace {
    public static void main(String[] args)
    {
        //taking username and password for verification
        System.out.println("Enter the username and password:");
        Scanner input=new Scanner(System.in);
        User.users(input.nextLine(),input.nextLine());
        if(User.auth())
        {
            System.out.println("\nEntered Username and password is correct you are logged in\n");
            int num;
            int amount=0;
            Scanner input1 = new Scanner(System.in);

            int[] transaction = new int[20];
            int i=0;
            System.out.println("----------Welcome to J Bank----------\n");
            do
            {
                //operation which can be performed by the user
                System.out.println("\nPlease select an option to continue");
                System.out.println("\n1. Transaction History");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. Check Balance");
                System.out.println("6. Quit");
                System.out.println("\nEnter number : ");
                num = input1.nextInt();
                switch(num)
                {
                    //for Transaction history
                    case 1:
                        System.out.println("Transaction history: ");
                        for(int j=0;j<i;j++)
                        {
                            System.out.println(transaction[j]);
                        }
                        break;
                    //for depositing amount
                    case 2:
                        System.out.println("\nEnter the amount to Deposit: ");
                        int dep = input1.nextInt();
                        amount = amount + dep;
                        System.out.println("Amount Deposited \n");
                        transaction[i]=amount;
                        i++;
                        break;
                    //for withdrawing amount
                    case 3:
                        System.out.println("\nEnter Withdraw Amount: ");
                        int Withdraw = input1.nextInt();

                        if(Withdraw > amount)
                        {
                            System.out.println("Insufficient Balance:\n");
                        }
                        else
                        {
                            amount = amount - Withdraw;

                            System.out.println("Amount Withdrawn");
                            System.out.println("Remaining balance: "+amount);

                            transaction[i]=amount;
                            i++;
                        }
                        break;
                    //for transferring amount to other user
                    case 4:
                        Scanner sc = new Scanner(System.in);
                        System.out.print("\nEnter Recipient's Name : ");
                        String recipient = sc.nextLine();
                        System.out.print("\nEnter amount you wish to transfer : ");
                        float amount1 = sc.nextFloat();

                        try {
                            if ( amount >= amount1 ) {
                                amount -= (int) amount1;
                                System.out.println("\nSuccessfully Transferred to " + recipient +"\n");
                            }
                            else {
                                System.out.println("\nInsufficient Balance");
                            }
                        }
                        catch ( Exception ignored){
                        }

                    break;
                    //to check balance by the user i.e. displaying the total balance in account
                    case 5:

                        System.out.println("\nCurrent Balance : "+amount);
                        System.out.println(" ");
                        break;
                    case 6:
                        System.out.println("\nThank You for Banking with Us");

                        break;
                    //if selected choice not present
                    default:
                        System.out.println("Invalid choice");
                }
            }while(num!=6);
        }
        //if entered user and password is wrong
        else
        {
            System.out.println("Entered Username and Password is wrong");
        }
    }
}
