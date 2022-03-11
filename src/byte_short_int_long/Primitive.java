package byte_short_int_long;

public class Primitive {
    public static void main(String[] args) {

        /// INT OCCUPIES 32 BITS ///
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        /// INTEGER IS A WRAPPER CLASS AND IS AN OBJECT ///
        /// AVAILABLE FOR ALL PRIMITIVE TYPES ///
        System.out.println("Integer min value = " + myMinIntValue);
        System.out.println("Integer max value = " + myMaxIntValue);
        /// OVERFLOW ///  SKIPS OVER TO MIN NUMBER
        System.out.println("Busted max value = " + (myMaxIntValue + 1));
        /// UNDERFLOW /// SKIPS OVER TO MAX NUMBER
        System.out.println("Busted min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        ////  BYTE //// OCCUPIES 8 BITS
        byte myMinByte = Byte.MIN_VALUE;
        System.out.println(myMinByte);
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println(myMaxByte);


        /// SHORT /// OCCUPIES 16 BITS
        short myShortValue = 1000;
        short myMinShort = Short.MIN_VALUE;
        System.out.println(myMinShort);
        short myMaxShort = Short.MAX_VALUE;
        System.out.println(myMaxShort);

        /// LONG /// OCCUPIES 64 BITS
        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        System.out.println(myMinLong);
        long myMaxLong = Long.MAX_VALUE;
        System.out.println(myMaxLong);
        long myMaxLongTest = 2_147_483_647_123L;
        System.out.println(myMaxLongTest);


        /// CHANGE 7 TO 8 TO BREAK IT ///
        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);
        int myTotal = myMinIntValue / 2;


        /// THE RESULT BELOW IS AN INT BUT GIVES ERROR  CAST TO BYTE TO REMOVE ERROR ///
        byte myNewByteValue = (byte) (myMinByte / 2);
        System.out.println(myNewByteValue);
        short newShortValue = (short) (myShortValue / 2);
        System.out.println(newShortValue);

        byte byteValue = 10;
        short shortVal = 20;
        int intVal = 50;
        long longTotal = 50000L + 10L * (byteValue + shortVal + intVal);
        System.out.println(longTotal);

        /// AGAIN CAST TO SHORT - DYNAMICALLY RETURNS AN INT ///
        short shortTotal = (short) (1000 + 10 *
                        (byteValue + shortVal + intVal));
        System.out.println(shortTotal);


    }
}
