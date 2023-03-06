package Admin_And_FileHandling;

import java.io.*;
public class FileFunctions {
        public static String[] options = {"Account_Numbers.txt","Account_Password.txt","Account_Bal.txt","CreditScore.txt","EMI.txt","Status.txt","CURRENT_AN.txt"};
        //the number of elements can be figured out by finding out the length of the arrays
        static void insert(int k, double[] jtemp) {
            String fileName= options[k];
            ObjectOutputStream outputStream = null;
            try {
                outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                outputStream.writeObject(jtemp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void insert(int k, String[] jtemp){
            String fileName= options[k];
            ObjectOutputStream outputStream = null;
            try {
                outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                outputStream.writeObject(jtemp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public static double[] readDouble(int k) {
            String fileName= options[k];
            ObjectInputStream inputStream = null;
            try {
                inputStream = new ObjectInputStream(new FileInputStream(fileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            double[] Temp = new double[0];
            try {
                Temp = (double[])inputStream.readObject();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            return Temp;
        }
        public static String[] readString(int k) {  // throws IOException, ClassNotFoundException
            String fileName= options[k];
            ObjectInputStream inputStream = null;
            try {
                inputStream = new ObjectInputStream(new FileInputStream(fileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String [] Temp = new String[0];
            try {
                Temp = (String[])inputStream.readObject();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            return Temp;
        }

        public static void updateDouble(int k, double value){
            double[] ktemp=readDouble(k);
            int n = ktemp.length;
            double[] jtemp = new double[n+1];
            System.arraycopy(ktemp, 0, jtemp, 0, n);
            jtemp[n]=value;
            insert(k,jtemp);
        }

        public static void updateString(int k, String value){
            String[] ktemp=readString(k);
            int n = ktemp.length;
            String[] jtemp = new String[n+1];
            System.arraycopy(ktemp, 0, jtemp, 0, n);
            jtemp[n]=value;
            insert(k,jtemp);
        }

        public static void main(String[] args) { //run if you want to reset the 50 preset values, running this will delete all the values you added after this.
            String[] ANN={"3618088359","1353767320","6737539885","8850273131","5888557899","7791080464","2713415347","6974449717","2457603335","9454189799","1954796145","6161541797","7217339478","3963766839","1337448539","2768871798","9949829404","5518605151","7727417073","6458419523","8564868071","1599630194","6965898432","1203798210","3012055875","9695245197","4090628195","7885999767","7596787302","6041802534","6767822933","1462962030","3418413869","1067988645","8710665091","8864996072","5540582289","6761251816","8042249138","6847668936","6759775332","3881914609","4833193374","2667945663","1164438107","4322242831","6542918986","8459093891","4313018850","8845396929"};
            String[] ANPW={"monkey" ,"11111111" ,"qazwsx" ,"159753" ,"asdfghjkl" ,"222222" ,"1234qwer" ,"qwerty1" ,"123654" ,"123abc" ,"1q2w3e4r5t" ,"iloveyou" ,"654321" ,"666666" ,"987654321" ,"123567" ,"123456a" ,"Qwe123" ,"1q2w3e4r" ,"7777777" ,"1qaz2wsx" ,"123qwe" ,"zxcvbnm" ,"121212" ,"asdasd" ,"a123456" ,"555555" ,"dragon" ,"112233" ,"123123123" ,"123456" ,"123456789" ,"123456" ,"qwerty" ,"password" ,"12345678" ,"111111" ,"123123" ,"1234567890" ,"1234567" ,"qwerty123" ,"000000" ,"1q2w3e" ,"aa12345678" ,"abc123" ,"password1" ,"123456" ,"qwertyuiop" ,"123321" ,"password123"};
            double[] ANBAL={35843,32688,760233,20421,64285,55991,60809,75191,47061,44111,99693,39416,1827,20439,40054,85230,86674,23694,53399,23760,70026,60554,70395,34598,52855,73078,27205,42843,34171,85421,9697,45479,72894,28591,52218,73769,65601,41756,69092,12416,96223,44807,25126,61353,90945,47470,75830,39693,20175,75347};
            double[] CSS= {501,82,23,23,57,94,85,59,24,87,61,0,52,59,84,15,28,17,35,62,64,51,71,51,63,19,83,52,8,90,36,84,23,71,60,30,63,98,75,53,92,19,16,29,68,30,65,17,26,54};
            insert(0,ANN);
            insert(1, ANPW);
            insert(2,ANBAL);
            insert(3,CSS);
            insert(4,new double[50]);
            insert(5,new double[50]);
            insert(6,new String[1]);
        }
}

