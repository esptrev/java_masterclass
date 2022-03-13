package codingexercises;

public class PositiveNegativeZero {
////  COPY AND PASTE METHODS INTO UDEMY CONSOLE TO COMPLETE TESTS  ////
    public static void main(String[] args) {
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }
}
