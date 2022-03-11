package char_boolean;

public class Chars {
    public static void main(String[] args) {

        /// REMEMBER CHARS CAN ONLY BE A SINGLE CHARACTER ///
        /// A CHAR OCCUPIES 16 BITS, BECAUSE IT STORES THE UNICODE OF THE CHARACTER USED ///
        /// UNICODE ALLOWS NON ENGLIGH LANGS TO USE ALL OF THEIR LETTERS ///

        char myChar = 'D';
        System.out.println(myChar);
        char myUCChar = '\u0044';  /// Unicode code for D
        System.out.println(myUCChar);
        char myUCCopywright = '\u00A9';
        System.out.println(myUCCopywright);


    }
}
