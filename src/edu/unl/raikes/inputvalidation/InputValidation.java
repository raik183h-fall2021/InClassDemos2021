package edu.unl.raikes.inputvalidation;

import java.util.Scanner;

/**
 * Library class of functions that perform text-based input validation. Input is read from Scanner objects, which are
 * not stored and must be passed into each function.
 * 
 * @author Stephanie Valentine, TODO: YOUR NAME(S) HERE!
 *
 */
public class InputValidation {
    /**
     * The string to add after the prompt, so the cursor moves forward some number of spaces.
     */
    private static final String AFTER_PROMPT_SPACE = " ";

    /**
     * Determines whether a given String is made up entirely of digits with an optional '-' in the first position.
     * 
     * @param s the string whose parse-ability is in question
     * @return true if s is made up entirely of digits, with an optional '-' in the first position, false otherwise
     */
    public static boolean canParseInt(String s) {
        // handle empty strings or strings with a single '-' and no digit
        boolean emptyString = s.length() == 0;
        boolean dashOnly = "-".equals(s);
        if (emptyString || dashOnly) {
            return false;
        }

        // check every char of s
        for (int i = 0; i < s.length(); i++) {
            // is this character a digit or a negative sign? if not, we cannot parse. return false.
            boolean isDigit = Character.isDigit(s.charAt(i));
            boolean isNegative = i == 0 && s.charAt(i) == '-';
            if (!isDigit && !isNegative) {
                return false;
            }
        }

        // every digit must either be a - or a digit, so it can be considered an int.
        return true;
    }

    public static boolean canParseDouble(String s) {
        // TODO: fill in this function!
        return false;
    }

    public static boolean canParseChar(String s) {
        // TODO: fill in this function!
        return false;
    }

    /**
     * Prompts a user for an integer value and ensures that the user provides viable input. Caller must provide the
     * initial user prompt message (e.g., "Please enter an integer.") and the user re-prompt message (e.g., "That wasn't
     * an integer. Please try again.").
     * 
     * @param scnr The buffer from which to pull the input.
     * @param promptMessage The initial message the function should use to request the desired input from the user.
     * @param repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return a user-provided int
     */
    public static int queryInt(Scanner scnr, String promptMessage, String repromptMessage) {

        System.out.print(promptMessage + AFTER_PROMPT_SPACE);
        String response = scnr.nextLine();

        while (!canParseInt(response)) {
            System.out.print(repromptMessage + AFTER_PROMPT_SPACE);
            response = scnr.nextLine();
        }

        int queriedInt = Integer.parseInt(response);

        return queriedInt;
    }

    /**
     * Requests an integer from the console user. Prompts a user for an integer value and ensures that the user provides
     * viable input. Caller must provide the initial user prompt message (e.g., "Please enter an integer.") and the user
     * re-prompt message (e.g., "That wasn't an integer. Please try again."). Additionally, this function ensures that
     * the user's int is included in an array of acceptable values. If their input is not in the list, the user will be
     * reprompted.
     * 
     * 
     * @param options The list of acceptable int values (any user inputted int not in this list will be rejected)
     * @param scnr The buffer from which to pull the input.
     * @param promptMessage The initial message the function should use to request the desired input from the user.
     * @param repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return a user-provided int
     */
    public static int queryIntFromOptions(int[] options, Scanner scnr, String promptMessage, String repromptMessage) {
        // get an int from the user
        int queriedInt = queryInt(scnr, promptMessage, repromptMessage);

        // now we have an int, but is it one of the ints in our options array?
        while (!valueIsInArray(options, queriedInt)) {
            // we want both messages to be the re-prompt message, since every prompt from this point is a reprompt
            queriedInt = queryInt(scnr, repromptMessage, repromptMessage);
        }

        return queriedInt;
    }

    public static double queryDouble(Scanner scnr, String promptMessage, String repromptMessage) {
        // TODO: FILL IN THIS FUNCTION
        return 0;
    }

    public static double queryDoubleFromOptions(double[] options, Scanner scnr, String promptMessage,
            String repromptMessage) {
        // TODO: FILL IN THIS FUNCTION
        return 0;
    }

    public static double queryChar(Scanner scnr, String promptMessage, String repromptMessage) {
        // TODO: FILL IN THIS FUNCTION
        return 0;
    }

    public static double queryCharFromOptions(double[] options, Scanner scnr, String promptMessage,
            String repromptMessage) {
        // TODO: FILL IN THIS FUNCTION
        return 0;
    }

    public static String queryString(Scanner scnr, String promptMessage, String repromptMessage) {
        // TODO: FILL IN THIS FUNCTION
        // Note that this function is fairly trivial, since there isn't really any validation happening.
        // However, it makes sense
        return null;
    }

    public static String queryStringFromOptions(double[] options, Scanner scnr, String promptMessage,
            String repromptMessage) {
        // TODO: FILL IN THIS FUNCTION
        return null;
    }

    /**
     * Searches an array to determine if a given value is included. Private because function is helpful internally, but
     * does not relate to the library's public area of responsibility.
     * 
     * @param haystack The array to search
     * @param needle The value to search for
     * @return true if the value is in the array, false otherwise
     */
    private static boolean valueIsInArray(int[] haystack, int needle) {
        // check needle for equivalence to every value in the haystack
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return true;
            }
        }
        return false;
    }

    private static boolean valueIsInArray(double[] haystack, double needle) {
        // TODO: FILL IN THIS FUNCTION
        return false;
    }

    private static boolean valueIsInArray(char[] haystack, char needle) {
        // TODO: FILL IN THIS FUNCTION
        return false;
    }

    private static boolean valueIsInArray(String[] haystack, String needle) {
        // TODO: FILL IN THIS FUNCTION
        return false;
    }

    public static void main(String[] args) {
        // test my Library methods
        Scanner scnr = new Scanner(System.in);
        int[] options = { 3, 4, 6 };
       
        
        int queriedInt = queryIntFromOptions(options, scnr, "int please (3, 4, or 6):",
                "that wasn't 3, 4, or 6. try again. int please:");
        
        
        
        System.out.println(queriedInt);
    }

}
