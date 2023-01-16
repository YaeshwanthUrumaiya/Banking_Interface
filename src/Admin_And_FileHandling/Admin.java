package Admin_And_FileHandling;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Admin {
    public int n;
    public String[] Acc_Num;
    public String[] Acc_Password;
    public double[] bal;
    public double[] creditScore;
    public double[] emi;
    public double[] Status;

    FileFunctions f1 = new FileFunctions();

    Scanner inobj = new Scanner(System.in);

    public void getValues(){
        FileFunctions f1 = new FileFunctions();
        Acc_Num=f1.readString(0);
        Acc_Password=f1.readString(1);
        bal=f1.readDouble(2);
        creditScore=f1.readDouble(3);
        emi=f1.readDouble(4);
        Status=f1.readDouble(5);
        n=Acc_Num.length;
    }

    public void Update_Value(int k, int p, String val){
        getValues();
        switch (k) {
            case 0 -> {
                Acc_Num[p] = val;
                f1.insert(k, Acc_Num);
            }
            case 1 -> {
                Acc_Password[p] = val;
                f1.insert(k, Acc_Password);
            }
        }
    }

    public void Update_Value(int k, int p, double val){
        getValues();
        switch (k) {
            case 2 -> {
                bal[p] = val;
                f1.insert(k, bal);
            }
            case 3 -> {
                creditScore[p] = val;
                f1.insert(k, creditScore);
            }
            case 4 -> {
                emi[p] = val;
                f1.insert(k, emi);
            }
            case 5 -> {
                Status[p] = val;
                f1.insert(k, Status);
            }
        }
    }

    public int get_p(String AN){
        getValues();
        int p=0;
        if (!(Arrays.asList(Acc_Num).contains(AN))){return p;}
        for(int i=0;i< Acc_Num.length;i++){
            if(AN.equals(Acc_Num[i])){
                p=i;
            }
        }
        return p;
    }

    public void DeleteAcc(String AN){
        getValues();
        int p= get_p(AN);
        Acc_Num[p]=Acc_Num[p+1];
        Acc_Password[p]=Acc_Password[p+1];
        bal[p]=bal[p+1];
        emi[p]=emi[p+1];
        creditScore[p]= creditScore[p+1];
        Status[p]=Status[p+1];

        f1.insert(0,Acc_Num);
        f1.insert(1,Acc_Password);
        f1.insert(2,bal);
        f1.insert(3,emi);
        f1.insert(4,creditScore);
        f1.insert(5,Status);
    }

    public void Get_Loan(String AN){

        int p=get_p(AN);

        double[] Temp_bal=f1.readDouble(2);
        double[] Temp_CS=f1.readDouble(3);
        double[] Temp_EMI=f1.readDouble(4);
        double[] Temp_Status=f1.readDouble(5);

        double Current_CS = Temp_CS[p];

        System.out.println("How much would you want?(EMI is as follows: 9.5% PER Month for 11 Months (or) 5.8% PER Month for 20 Months)");

        if(Current_CS<=25.0){
            while(true){
                System.out.println("The Max Amount is 15000");
                double princ= inobj.nextInt();
                if (princ>15000){
                    System.out.println("Try again!");
                    continue;
                }
                System.out.println("What is your Plan? 9.5% or 5.8% (1/2)");
                int inter=inobj.nextInt();
                if (!(inter!=1 || inter!=2)){
                    System.out.println("Try again!");
                    continue;
                }
                double newbal=(Temp_bal[p]+princ);
                double newemi=Temp_EMI[p];
                double newstatus=Temp_Status[p];
                Update_Value(2,p,newbal);

                switch (inter) {
                    case 1 -> {
                        newemi = newemi+(princ * 0.095);
                        newstatus += 11;
                        Update_Value(4, p, newemi);
                        Update_Value(5, p, newstatus);

                    }
                    case 2 -> {
                        newemi = newemi+(princ * 0.055);
                        newstatus += 20;
                        Update_Value(4, p, newemi);
                        Update_Value(5, p, newstatus);
                    }
                }
                break;
            }
        }
        else{
            while(true){
                double total_amt=Current_CS*10000;
                System.out.println("The Max Amount is "+total_amt);
                double princ= inobj.nextInt();
                if (princ>total_amt){
                    System.out.println("Try again!");
                    continue;
                }
                System.out.println("What is your Plan? 9.5% or 5.8% (1/2)");
                int inter=inobj.nextInt();
                if (!(inter==1 || inter==2)){
                    System.out.println("Try again!");
                    continue;
                }
                double newbal=(Temp_bal[p]+princ);
                double newemi=Temp_EMI[p];
                double newstatus=Temp_Status[p];
                Update_Value(2,p,newbal);

                switch (inter) {
                    case 1 -> {
                        newemi += princ * 0.95;
                        newstatus += 11;
                        Update_Value(4, p, newemi);
                        Update_Value(5, p, newstatus);
                    }
                    case 2 -> {
                        newemi += princ * 0.55;
                        newstatus += 20;
                        Update_Value(4, p, newemi);
                        Update_Value(5, p, newstatus);
                    }
                }
                break;
            }
        }
    }

    public String get_Date(){
        LocalDate k=java.time.LocalDate.now();
        String j=k.toString();
        return j.substring(8);
    }

    public int get_flag(String AN){
        int p = get_p(AN);
        double[] all = f1.readDouble(5);
        double current=all[p];
        if(current<0){return -1;}
        else{return 1;}
    }

    public void WithDraw(String AN){//status holds the value of how many months you have left in the emi payment and if that is neg, that means you missed a payment.
        String date=get_Date();

        if(date.equals("01")){
            int p = get_p(AN);

            double[] Temp_bal=f1.readDouble(2);
            double[] Temp_CS=f1.readDouble(3);
            double[] Temp_EMI=f1.readDouble(4);
            double[] Temp_Status=f1.readDouble(5);

            double status = Temp_Status[p];
            double cs = Temp_CS[p];

            if(status!=0){
                if(Temp_bal[p]<Temp_EMI[p]){
                    status=-1*status;
                    if(cs>10){
                        cs=cs-10;
                    }
                    else{
                        cs=0;
                    }
                    Update_Value(3,p,cs);
                    Update_Value(5,p,status);
                    return;
                }
                double bal=Temp_bal[p]-Temp_EMI[p];
                status=status-1;
                Update_Value(2,p,bal);
                Update_Value(5,p,status);
                if(status==0){
                    cs=cs+20;
                    Update_Value(3,p,cs);
                }
            }
        }
    }

    public void reverterror(String AN){
        int p = get_p(AN);

        double[] Temp_Status=f1.readDouble(5);

        double status = Temp_Status[p];

        status=Math.abs(status)-1;
        Update_Value(5,p,status);
    }

}
