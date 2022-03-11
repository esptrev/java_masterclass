package float_double;

import org.w3c.dom.ls.LSOutput;

public class Floats {

    public static void main(String[] args) {
        /// FLOATS ARE SINGLE PRECISION 32 BITS ///
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println(myMaxFloat);
        float myMinFloat = Float.MIN_VALUE;
        System.out.println(myMinFloat);



        /// DOUBLES ARE DOUBLE PRECISION 64 BITS ///
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println(myMaxDouble);
        double myMinDouble = Double.MIN_VALUE;
        System.out.println(myMinDouble);


        int myIntVal = 5;
        System.out.println("intval = " + myIntVal + " notice here it drops remainder");
        int myIntValII = 5 / 2;
        System.out.println("intvalII = " + myIntValII);

        float myFloatVal = 5F;
        System.out.println("myFloatVal = " + myFloatVal);
        float myFloatValII = 5F / 3F;
        System.out.println("myFloatValII = " + myFloatValII);
        float myFloatValIII = (float) 5;  ///Either line works but F is preferred
        System.out.println("myFloatIII = " + myFloatValIII);



        /// DOUBLES ARE THE BEST PRACTICE FOR FLOATING POINT NUMBERS, SOFTWARE AND HARDWARE BOTH HAVE BEEN OPTIMIZED FOR DOUBLES ///
        double myDoubleVal = 5D;
        System.out.println("doubleval = " + myDoubleVal);
        double myDoubleValII = 5.25D / 3.25D;
        System.out.println("dValII = " + myDoubleValII);

        double lbsToConvert = 200D;
        double convertKgs = lbsToConvert * 0.45359237D;
        System.out.println("Converted = " + convertKgs);

        double pi = 3.1415927D;
        System.out.println(pi);
        double anotherNumber = 3_000_000.4_567_899D;  /// YOU CAN USE UNDERSCORES IN PLACE OF COMMAS TO HELP WITH READABILITY
        System.out.println(anotherNumber);














    }





}
