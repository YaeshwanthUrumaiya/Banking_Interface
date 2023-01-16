package Accounts;

import Admin_And_FileHandling.Admin;

import java.util.Arrays;

public class Transactions extends Accounts {

    static Admin A1 = new Admin();

    static int p;

   public Transactions(){
       p=A1.get_p(getcurrentAN());
       A1.WithDraw(getcurrentAN());
       Accounts.errorFlag=A1.get_flag(getcurrentAN());
   }

    public String[] Display(){
       String[] k = new String[5];
       k[0]="null";
       if(errorFlag==-1){
           k[0]="You Have MISSED an EMI PAYMENT! Pay it right away!";
       }
       getValues();
       k[1]=("Your Account Number:"+Accounts.Acc_Num[p]);
       k[2]=("Your Balance:"+Accounts.bal[p]);
       k[3]=("Your Credit Score:"+Accounts.creditScore[p]);

       if(Accounts.Status[p]==0){
           k[4]=("You have No current Loans!");
       }
       else{
           k[4]=("You Have "+Math.abs(Accounts.Status[p])+" Months left in your EMI; With each EMI of:"+Accounts.emi[p]);
       }
       return k;
    }

    public int withdrawal(double amt){
       if(Accounts.bal[p]>=amt){
           double newbal=(Accounts.bal[p]-amt);
           A1.Update_Value(2,p,newbal);
           return 1;
       }
       else{
           return -1;
       }
   }

    public void deposit(double amt){
        double newbal=(Accounts.bal[p]+amt);
        A1.Update_Value(2,p,newbal);
    }

    public int send_money(double amt, String AN){
       if(!(Arrays.asList(Acc_Num).contains(AN))){
           return -1;
       }

        if(!(Accounts.bal[p]>=amt)){
            return -2;
        }

        int p2=A1.get_p(AN);
        double newbal=(Accounts.bal[p2]+amt);
        A1.Update_Value(2,p2,newbal);

        double newbal2=(Accounts.bal[p]-amt);
        A1.Update_Value(2,p,newbal2);
        return 1;
    }

}
