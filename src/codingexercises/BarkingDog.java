package codingexercises;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        if(!barking){
            return false;
        }
        return hourOfDay <= 8 || hourOfDay > 22;
    }
}
