import Admin_And_FileHandling.Admin;
import Accounts.*;

import java.util.Arrays;
import java.util.Scanner;

public class Admin_Main {

    static Admin a1 = new Admin();

    static Accounts b1 = new Accounts();

    static Scanner inobj = new Scanner(System.in);

    public static void main(String[] args){
        int totalq=1;
        System.out.println("*********************************************************************************************");
        System.out.println("Hello Admin!");
        System.out.println("Please Enter the user's Account Number:");
        String Ann=inobj.nextLine();
        System.out.println("*********************************************************************************************");
        while(totalq==1){
            System.out.println("*********************************************************************************************");
            System.out.println("1. Loan");
            System.out.println("2. Delete Account");
            System.out.println("3. Update Account");
            System.out.println("4. Quit");
            System.out.println("*********************************************************************************************");
            System.out.println("Enter your choice:");
            int c = inobj.nextInt();
            switch (c){
                case 1:
                    a1.Get_Loan(Ann);
                    break;
                case 2:
                    a1.DeleteAcc(Ann);
                    break;
                case 3:
                    System.out.println("1. Account number");
                    System.out.println("2. Account password");
                    System.out.println("Enter your choice:");
                    int k = inobj.nextInt();
                    int p=a1.get_p(Ann);
                    System.out.println("Enter your Value:");
                    String val = inobj.nextLine();
                    if(k==0){
                        if ((val.length() == 10)&&((Arrays.asList(b1.Acc_Num).contains(val)))){
                            int flag=0;
                            for (int i = 0; i < 10; i++) {
                                if (!(Character.isDigit(Ann.charAt(i)))) {
                                    flag=1;
                                }
                            }

                            if(flag==0){
                                a1.Update_Value(0,p,val);
                            } else{System.out.println("Error");}
                        } else{System.out.println("Error");}
                    }
                    else if(k==1){
                        if (val.length() >= 6) {
                            a1.Update_Value(1,p,val);
                        } else{System.out.println("Error");}
                    }
                    break;
                case 4:
                    totalq=0;
                    break;
            }
        }
    }

}
