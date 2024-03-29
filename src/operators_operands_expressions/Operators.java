package operators_operands_expressions;

public class Operators {
    public static void main(String[] args) {


        int result = 1 + 2;  /// 1+2=3
        /// = is assignment operator  its assigning the VALUE on
        // the right to the variable on the left
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;  // 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20/5=4
        System.out.println("latest result = " + result);

        result = result % 3; /// should be 1
        System.out.println("4 % 3 = " + result);

        //// result = result + 1;  result++; result--; SHORTHAND OPERATORS

        result++;
        System.out.println(result); // 2

        result--;
        System.out.println(result); // 1

        result += 5;
        System.out.println(result); // 6

        result *= 10;
        System.out.println(result); // 60

        result /= 4;
        System.out.println(result); // 15


        ///  TERNARY OPERATORS

        String makeOfCar = "Volkswagon";
        boolean isDomestic = makeOfCar == "Volkswagon" ? false : true;
        System.out.println(isDomestic);

        if(isDomestic){
            System.out.println("This car is made in USA");
        }
        if(!isDomestic){
            System.out.println("This car is not made in the USA");
        }

        int ageOfClient = 16;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen/adult" : "Still a minor";
        System.out.println("Our client is " + ageText);

        String car = (isDomestic) ? "this vehicle is domestic" : "this car is an import";
        System.out.println(car);






    }//END OF MAIN
}//END OF CLASS
