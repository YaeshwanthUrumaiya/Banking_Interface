import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.formdev.flatlaf.*;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import Accounts.*;

public class User_UI {
    Accounts b1 = new Accounts();
    Transactions k1 = new Transactions();

    //frames
    JFrame f1 = new JFrame("Banking");//login
    JFrame f2 = new JFrame("Banking");//sign in
    JFrame f3 = new JFrame("Banking");//menu for accounts or transactions field
    JFrame f4 = new JFrame("Banking");//for account actions
    JFrame f5 = new JFrame("Banking");//for account actions' response.
    JFrame f6 = new JFrame("Banking");//for transact actions
    JFrame t4f = new JFrame("Banking");//for sending money
    JFrame t1f = new JFrame("Banking");//to see details
    JFrame t2f = new JFrame("Banking");//to withdraw
    JFrame t3f = new JFrame("Banking");//to deposit

    //Text fields.
    JTextField User_Field = new JTextField();
    JTextField s1 = new JTextField();
    JTextField s2 = new JTextField();
    JTextField s3 = new JTextField();
    JTextField s4 = new JTextField();
    JTextField t4t1 = new JTextField();
    JTextField t4t2 = new JTextField();
    JTextField t2t1 = new JTextField();
    JTextField t3t1 = new JTextField();

    //Password fields
    JPasswordField PW = new JPasswordField();

    //Buttons
    JButton LOGIN = new JButton("LOGIN");
    JButton signup = new JButton("SIGN UP");
    JButton s_in = new JButton("SUBMIT");
    JButton t4s = new JButton("Send");
    JButton Accb = new JButton("Account Actions");
    JButton Transb = new JButton("Transact Actions");
    JButton del = new JButton("Delete your account");
    JButton cha = new JButton("Change/Update information about your account");
    JButton t1 = new JButton("Display your account details");
    JButton t2 = new JButton("Withdrawal");
    JButton t3 = new JButton("Deposit");
    JButton t4 = new JButton("Send Funds to another Account");
    JButton t2fs = new JButton("WITHDRAW");
    JButton t3fs = new JButton("DEPOSIT");
    JButton back = new JButton("BACK");
    JButton b2 = new JButton("Quit");
    JButton b3 = new JButton("BACK");
    JButton b4 = new JButton("BACK");
    JButton b5 = new JButton("BACK");
    JButton t4fb = new JButton("BACK");
    JButton t1fb = new JButton("BACK");
    JButton t2fb = new JButton("BACK");
    JButton t3fb = new JButton("BACK");

    //Lables
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel("ACCOUNT NO.:");
    JLabel l3 = new JLabel("Password:");
    JLabel l4 = new JLabel("New User?:");
    JLabel l5 = new JLabel("Welcome to our Bank! We are glad to have you as our customer!");
    JLabel l6 = new JLabel("Please Enter your Account number of exactly 10 Digits:");
    JLabel l7 = new JLabel("Please Enter your password of at least 6 Characters!");
    JLabel l8 = new JLabel("Your first deposit to your Account (More than 10,000):");
    JLabel l9 = new JLabel("What is your current creditScore (0-100)");
    JLabel l10 = new JLabel();
    JLabel l11 = new JLabel("Visit the nearest Admin's Office to Change details of your Account!");
    JLabel t4l1 = new JLabel("Enter the Account number:");
    JLabel t4l2 = new JLabel("Enter the Amount:");
    JLabel t4o = new JLabel();
    JLabel t1l1 = new JLabel();
    JLabel t1l2 = new JLabel();
    JLabel t1l3 = new JLabel();
    JLabel t1l4 = new JLabel();
    JLabel t1l5 = new JLabel();
    JLabel t2l1 = new JLabel("Enter the AMOUNT:");
    JLabel t2l2 = new JLabel();
    JLabel t3l1 = new JLabel("Enter the AMOUNT:");
    JLabel t3l2 = new JLabel();

    JLabel setBG() {
        return new JLabel(new ImageIcon("bg_pic.jpg"));
    }

    User_UI(){
        f1.setSize(400,400);
        f2.setSize(400,400);
        f3.setSize(400,400);
        f4.setSize(400,400);
        f5.setSize(400,400);
        f6.setSize(400,400);
        t4f.setSize(400,400);
        t1f.setSize(400,400);
        t2f.setSize(400,400);
        t3f.setSize(400,400);
        f1.setLayout(null);
        f2.setLayout(null);
        f3.setLayout(null);
        f4.setLayout(null);
        f5.setLayout(null);
        f6.setLayout(null);
        t4f.setLayout(null);
        t1f.setLayout(null);
        t2f.setLayout(null);
        t3f.setLayout(null);

        User_Field.setBounds(100,50,100,20);
        PW.setBounds(100,100,100,20);
        LOGIN.setBounds(100,150, 100,20);
        l1.setBounds(25, 300, 355, 30);
        l2.setBounds(5,50,100,20);
        l3.setBounds(5,100,90,20);
        l4.setBounds(30,200,100,20);
        signup.setBounds(100,200,100,20);

        l5.setBounds(5,20,395,20);
        l6.setBounds(5,50,395,20);
        s1.setBounds(300,80,75,20);
        l7.setBounds(5,110,395,20);
        s2.setBounds(300,140,75,20);
        l8.setBounds(5,170,395,20);
        s3.setBounds(300,200,75,20);
        l9.setBounds(5,230,395,20);
        s4.setBounds(300,260,75,20);
        l10.setBounds(5,300,395,20);
        s_in.setBounds(290,340,100,20);
        back.setBounds(180,340,100,20);

        Accb.setBounds(115, 100,150,40);
        Transb.setBounds(115, 150, 150,40);
        b2.setBounds(115,250,150,40);

        del.setBounds(50, 100,300,40);
        cha.setBounds(50, 150, 300,40);
        b3.setBounds(115,250,150,40);

        l11.setBounds(5,150,395,20);
        b4.setBounds(115,250,150,40);

        t1.setBounds(50,50,300,40);
        t2.setBounds(50,100,300,40);
        t3.setBounds(50,150,300,40);
        t4.setBounds(50,200,300,40);
        b5.setBounds(115,300,150,40);

        t4l1.setBounds(50,100,200,20);
        t4t1.setBounds(250,100,75,20);
        t4l2.setBounds(50,200,200,20);
        t4t2.setBounds(250,200,75,20);
        t4o.setBounds(50,300,395,20);
        t4s.setBounds(260,330,100,30);
        t4fb.setBounds(150,330,100,30);


        t1l1.setBounds(35,250,310,20);//error
        t1l2.setBounds(35,50,395,20);
        t1l3.setBounds(35,100,395,20);
        t1l4.setBounds(35,150,395,20);
        t1l5.setBounds(15,200,395,20);
        t1fb.setBounds(115,300,150,40);

        t2l1.setBounds(50,100,200,20);
        t2t1.setBounds(250,100,75,20);
        t2l2.setBounds(50,200,200,20);
        t2fs.setBounds(260,330,100,30);
        t2fb.setBounds(150,330,100,30);

        t3l1.setBounds(50,100,200,20);
        t3t1.setBounds(250,100,75,20);
        t3l2.setBounds(50,200,200,20);
        t3fs.setBounds(260,330,100,30);
        t3fb.setBounds(150,330,100,30);


        f1.setContentPane(setBG());
        f1.add(User_Field);
        f1.add(PW);
        f1.add(LOGIN);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(signup);

        f2.setContentPane(setBG());
        f2.add(l5);
        f2.add(l6);
        f2.add(s1);
        f2.add(l7);
        f2.add(s2);
        f2.add(l8);
        f2.add(s3);
        f2.add(l9);
        f2.add(s4);
        f2.add(l10);
        f2.add(s_in);
        f2.add(back);

        f3.setContentPane(setBG());
        f3.add(Accb);
        f3.add(Transb);
        f3.add(b2);

        f4.setContentPane(setBG());
        f4.add(cha);
        f4.add(del);
        f4.add(b3);

        f5.setContentPane(setBG());
        f5.add(l11);
        f5.add(b4);

        f6.setContentPane(setBG());
        f6.add(t1);
        f6.add(t2);
        f6.add(t3);
        f6.add(t4);
        f6.add(b5);

        t4f.setContentPane(setBG());
        t4f.add(t4l1);
        t4f.add(t4l2);
        t4f.add(t4o);
        t4f.add(t4s);
        t4f.add(t4t1);
        t4f.add(t4t2);
        t4f.add(t4fb);

        t1f.setContentPane(setBG());
        t1f.add(t1l1);
        t1f.add(t1l2);
        t1f.add(t1l3);
        t1f.add(t1l4);
        t1f.add(t1l5);
        t1f.add(t1fb);

        t2f.setContentPane(setBG());
        t2f.add(t2l1);
        t2f.add(t2l2);
        t2f.add(t2t1);
        t2f.add(t2fs);
        t2f.add(t2fb);

        t3f.setContentPane(setBG());
        t3f.add(t3l1);
        t3f.add(t3l2);
        t3f.add(t3t1);
        t3f.add(t3fs);
        t3f.add(t3fb);

        f1.setVisible(true);
        f2.setVisible(false);
        f3.setVisible(false);
        f4.setVisible(false);
        f5.setVisible(false);
        f6.setVisible(false);
        t4f.setVisible(false);
        t1f.setVisible(false);
        t2f.setVisible(false);
        t3f.setVisible(false);

        LOGIN.setBackground(Color.decode("#8957c1"));
        signup.setBackground(Color.decode("#8957c1"));
        s_in.setBackground(Color.decode("#8957c1"));
        t4s.setBackground(Color.decode("#8957c1"));
        Accb.setBackground(Color.decode("#8957c1"));
        Transb.setBackground(Color.decode("#8957c1"));
        del.setBackground(Color.decode("#8957c1"));
        cha.setBackground(Color.decode("#8957c1"));
        t1.setBackground(Color.decode("#8957c1"));
        t2.setBackground(Color.decode("#8957c1"));
        t3.setBackground(Color.decode("#8957c1"));
        t4.setBackground(Color.decode("#8957c1"));
        t2fs.setBackground(Color.decode("#8957c1"));
        t3fs.setBackground(Color.decode("#8957c1"));
        back.setBackground(Color.decode("#f22f84"));
        b2.setBackground(Color.decode("#f22f84"));
        b3.setBackground(Color.decode("#f22f84"));
        b4.setBackground(Color.decode("#f22f84"));
        b5.setBackground(Color.decode("#f22f84"));
        t4fb.setBackground(Color.decode("#f22f84"));
        t1fb.setBackground(Color.decode("#f22f84"));
        t2fb.setBackground(Color.decode("#f22f84"));
        t3fb.setBackground(Color.decode("#f22f84"));

        t1l1.setForeground(Color.red);
        t1l1.setBorder(new LineBorder(Color.BLACK, 2));
        t1l1.setBackground(Color.darkGray);
        t1l1.setFont(t1l1.getFont().deriveFont(Font.BOLD));
        t1l1.setOpaque(true);

        LOGIN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String user=User_Field.getText();
                    String pw = String.valueOf(PW.getPassword());

                    int k = b1.LogIn(user,pw);

                    switch (k) {
                        case -1 -> l1.setText("The account number DOES NOT exists or It is NOT in Format!");
                        case -2 -> l1.setText("The Password is Wrong, try again!");
                        case 1 -> {
                            f1.setVisible(false);
                            f3.setVisible(true);
                        }
                    }
                }catch(Exception ignored){};
            }
        });

        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                f2.setVisible(true);
            }
        });

        s_in.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String AN = s1.getText();
                    String password = s2.getText();
                    double firstdp = Double.parseDouble(s3.getText());
                    double cs = Double.parseDouble(s4.getText());

                    int k = b1.createAccount(AN,password,firstdp,cs);

                    switch (k) {
                        case -1 -> l10.setText("Your account number is under (or) over 10 digits!");
                        //1234567819
                        case -2 -> l10.setText("The account number already exists!");
                        case -3 -> l10.setText("you have inputted Characters instead of digits, Please try again!");
                        case -4 -> l10.setText("The Password is less than 6 characters, Please Try again.");
                        case -5 -> l10.setText("The first deposit must be greater than 10,000! Kindly try again");
                        case -6 -> l10.setText("Enter the proper creditScore. Kindly try again");
                        case 1 -> {
                            f2.setVisible(false);
                            f1.setVisible(true);
                            l1.setText("Your Account has been Created! We wish you the Best Of Luck!");
                        }
                    }

                }catch(Exception ignored){};

            }
        });

        Accb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.setVisible(false);
                f4.setVisible(true);
            }
        });

        Transb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f3.setVisible(false);
                f6.setVisible(true);
            }
        });

        cha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.setVisible(false);
                f5.setVisible(true);
            }
        });

        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.setVisible(false);
                f5.setVisible(true);
            }
        });

        t4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t4f.setVisible(true);
                f6.setVisible(false);
            }
        });

        t4s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String an = t4t1.getText();
                    double amt = Double.parseDouble(t4t2.getText());

                    int k=k1.send_money(amt,an);

                    switch (k) {
                        case 1 -> t4o.setText("The funds has been sent!");
                        case -1 -> t4o.setText("The given account number doesn't work! Try again");
                        case -2 -> t4o.setText("You don't enough funds! Please try again");
                    }
                }catch (Exception ignored){};
            }
        });

        t1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    f6.setVisible(false);
                    t1f.setVisible(true);

                    String[] k = k1.Display();

                    if(!(k[0].equals("null"))){
                        t1l1.setText("You Have MISSED an EMI PAYMENT! Pay it right away!");
                    }
                    t1l2.setText(k[1]);
                    t1l3.setText(k[2]);
                    t1l4.setText(k[3]);
                    t1l5.setText(k[4]);
                }catch (Exception ignored){};
            }
        });

        t2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2f.setVisible(true);
                f6.setVisible(false);
            }
        });

        t3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t3f.setVisible(true);
                f6.setVisible(false);
            }
        });

        t2fs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double amt = Double.parseDouble(t2t1.getText());

                    int k = k1.withdrawal(amt);

                    switch (k) {
                        case -1 -> t2l2.setText("You don't have enough funds!");
                        case 1 -> t2l2.setText("You have Withdrawal the money!");
                    }
                }catch(Exception ignored){};
            }
        });

        t3fs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double amt = Double.parseDouble(t3t1.getText());

                    k1.deposit(amt);

                    t3l2.setText("You have deposited the money!");

                }catch(Exception ignored){};
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(true);
                f2.setVisible(false);
            }
        });

        b2.addActionListener(new ActionListener() {//change this
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f4.setVisible(false);
                f3.setVisible(true);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f5.setVisible(false);
                f4.setVisible(true);
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f6.setVisible(false);
                f3.setVisible(true);
            }
        });
        t4fb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t4f.setVisible(false);
                f6.setVisible(true);
            }
        });

        t1fb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1f.setVisible(false);
                f6.setVisible(true);
            }
        });

        t2fb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2f.setVisible(false);
                f6.setVisible(true);
            }
        });

        t3fb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t3f.setVisible(false);
                f6.setVisible(true);
            }
        });

    }

    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel( new FlatDarkLaf() );
            new User_UI();
        }catch (Exception ignored){};
    }

}
