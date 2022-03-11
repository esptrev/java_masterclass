package challenges;

public class OperatorChallenge {

    public static void main(String[] args) {

        double firstVar = 20.00D;
        double secondVar = 80.00D;
        double sumOfVars = firstVar + secondVar;
        System.out.println(sumOfVars);
        double productOfSum = sumOfVars * 100.00;
        System.out.println(productOfSum);
        double remainder = productOfSum % 20.00;
        System.out.println(remainder);
        boolean isThereARemainder = remainder == 0 ? true:false;
        System.out.println(isThereARemainder);
        if(!isThereARemainder){
            System.out.println("The remainder is: " + remainder);
        }else{
            System.out.println("Remainder is 0");
        }

    }///END OF MAIN






}///END OF CLASS
