package conditionals;

public class LogicalAndOr {
    public static void main(String[] args) {
        int topScore = 99;
        if (topScore < 100) {
            System.out.println("You have the high score");
        }
        int secondScore = 95;
        if (topScore > secondScore && topScore < 100) {
            System.out.println("Greater than second score and less than 100");
        }

        if (topScore < 100 || topScore > secondScore) {
            System.out.println("Logical OR statment works");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("Remember to use equality operator == not the = assignment operator ");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This shouldn't print, the if then looks for boolean value and since we re assigned a boolean it compiles");
        }

        if(!isCar){
            System.out.println("This is appropriate if/then block for boolean, use the !");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("IsCar reassigned to true so this block will execute");
        }











    }//END OF MAIN
}//END OF CLASS
