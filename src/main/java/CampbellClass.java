/**
 * This CampbellClass is a utility class that has methods for converting data types into a string,
 * converting meters to centimeters and removing non-alphabetic leters from strings.
 * @author Lily You
 * @version 3
 */

public final class CampbellClass{

    //private constructor
    /**
     * Private constructor to prevent object creation
     */
    private CampbellClass(){

    }

    /**
     * Converts an integer to a String
     * @param num int - the integer being converted to a String
     * @return string - the string version of the integer given
     */
    public static String convertString(int num){
        return Integer.toString(num);
    }

    /**
     * Converts a double to a String
     * @param num double - the double being converted to a String
     * @return String - the string version of the double given
     */
    public static String convertString(double num){
        return Double.toString(num);
    }

    /**
     * Converts a character to a String
     * @param letter char - the character being converted to a String
     * @return String - the string version of the character given
     */
    public static String convertString(char letter){
        return Character.toString(letter);
    }

    /**
     * Converts a boolean to a String
     * @param bool boolean - the boolean being converted to a String
     * @return String - the string version of the boolean given
     */
    public static String convertString(boolean bool){
        return Boolean.toString(bool);
    }
    

    /**
     * Converts meters to centimeters using integers
     * @param meters int - the number of meters
     * @return the number of meters converted to centimeters as an integer
     */
    public static int convertMetersToCenti(int meters){
        return (meters*100);
    }

    /**
     * Converts meteres to centimeters using doubles
     * @param meters double - the number of meters
     * @return the number of meters converted to centimeters as a double
     */
    public static double convertMetersToCenti(double meters){
        return (meters*100.0);
    }

    /**
     * Removes all non-letter characters from a string
     * @param word String - the word given, without characters removed
     * @return the word as a String with only letter characters
     */
    public static String removeNonAlpha(String word){
        return word.replaceAll("[^a-zA-Z]", "");
    }

    /**
     * Removes all non-letters characters from a string and changes its case
     * @param word String - the word given, without characters removed
     * @param bool boolean - represents if the word will be returned as uppercase or lowercase
     * @return the word as a String with only letter characters and in upper or lower case depending on the variable bool
     */
    public static String removeNonAlpha(String word, boolean bool){
        word = word.replaceAll("[^a-zA-Z]", "");
        if(bool){
            return word.toUpperCase();
        }
        else{
            return word.toLowerCase();
        }
    }
}