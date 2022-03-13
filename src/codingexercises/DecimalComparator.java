package codingexercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double numA, double numB){
        if ( (int) (numA * 1000) == (int) (numB * 1000) ){
            return true;
        }
        else {
            return false;
        }
    }
}
