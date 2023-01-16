package Accounts;
import Admin_And_FileHandling.FileFunctions;

import java.util.Arrays;

public class Accounts{
    public int n;
    public static String[] Acc_Num;
    public static String[] Acc_Password;
    public static double[] bal;
    public static double[] creditScore;
    public static double[] emi;
    public static double[] Status;
    public static int errorFlag = 0;
    public boolean logInFlag = false;
    public int pointer = 0;

    public String Current_AN=null;

    static FileFunctions f1 = new FileFunctions();

    public static String getcurrentAN(){
        String[] temp=f1.readString(6);
        return temp[0];
    }

    public void setCurrent_AN(String k){
        String[] temp={k};
        f1.insert(6,temp);
    }

    public void getValues(){
        Acc_Num=f1.readString(0);
        Acc_Password=f1.readString(1);
        bal=f1.readDouble(2);
        creditScore=f1.readDouble(3);
        emi=f1.readDouble(4);
        Status=f1.readDouble(5);
        n=Acc_Num.length;
    }

    public void createACC(String a, String b, double c, double d){//This is to directly input the values from the admin's side!
        f1.updateString(0,a);
        f1.updateString(1,b);
        f1.updateDouble(2,c);
        f1.updateDouble(3,d);
        f1.updateDouble(4,0.00);
        f1.updateDouble(5,0);

        getValues();
    }

    public int createAccount(String AccNumm, String PW, double firstdp, double cs){//This is to create it one by one from the user's side.
        getValues();

        while (true) {

            if ((AccNumm.length() != 10)) {
                return -1;
            }

            if((Arrays.asList(Acc_Num).contains(AccNumm))){
                return -2;
            }

            int flag=0;
            for (int i = 0; i < 10; i++) {
                if (!(Character.isDigit(AccNumm.charAt(i)))) {
                    flag=1;
                }
            }

            if(flag==1){
                return -3;
            }

            if (PW.length() < 6) {
                return -4;
            }

            break;

        }

        while (true) {
            try {
                if (!(firstdp >= 10000)) {
                    return -5;
                }
                if (!((cs <= 100) && (cs >= 0))) {
                    return -6;
                }

            } catch (Exception e) {
                continue;
            }

            break;

        }

        createACC(AccNumm, PW, firstdp, cs);
        return 1;
    }

    public int LogIn(String AN,String PW)  {
        getValues();
        while(true) {
            //this is for account number
            if ((AN.length() != 10) || (!(Arrays.asList(Acc_Num).contains(AN)))) {
                return -1;
            }

            for(pointer = 0; pointer<=n; pointer++){
                if(AN.equals(Acc_Num[pointer])) {
                    break;
                }
            }

            //this is for password
            if(!(PW.equals(Acc_Password[pointer]))){
                return -2;
            }

            logInFlag=true;
            setCurrent_AN(AN);
            return 1;
        }
    }

}