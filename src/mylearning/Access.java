package mylearning;

import jdk.swing.interop.SwingInterOpUtils;

public class Access {
    public static void main(String[] args) {
        Att myObj = new Att();
        System.out.println(myObj.secondAttribure); ///SHOULD PRINT 5
        System.out.println(myObj.fourthAttribute); ///SHOULD PRINT "DEFUALT"

    }///END OF MAIN
}///END OF CLASS
