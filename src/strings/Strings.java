package strings;

public class Strings {
    public static void main(String[] args) {
        //// STRINGS ARE IMMUTABLE  ////
        //// STRINGS ARE ACTUALLY A CLASS, BUT WE USE THEM AS OBJECTS ////
        /// STRINGS CONTAIN SEQEUNCE OF CHARACTERS MAX IS 2.14B, WHICH IS
        /// THE SAME AS MAX VALUE OF INT

        String myString = "This is a string, ";
        System.out.println("myString is = " + myString);
        myString = myString + "appending this string to end of myString";  /// Appends to myString
        System.out.println(myString);
        myString = myString + " \u00a9 2019";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to : " + lastString);
        double dubNumb = 120.47D;
        lastString = lastString + dubNumb;
        System.out.println(lastString);











    }
}
