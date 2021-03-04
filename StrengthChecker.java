/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * tool class for evaluating candidate password strength against a set of
 * requirements
 * @author celia
 */
public class StrengthChecker {
    
    //member variables
    String pwd;
    static boolean containDigit = true;
    static boolean containLowercase = true;
    static boolean containUppercase = true;
    static boolean containSpecial = true;
    static boolean correctLength = true;
    
    //method that checks password for digits
    public static void checkPasswordForDigit(String pwd){
        String regexDigit = ".*\\d.*";
        Pattern myPattern = Pattern.compile(regexDigit);
        Matcher myMatcher = myPattern.matcher(pwd);
        boolean outcome = myMatcher.matches();
        //System.out.println(outcome); //print outcome for testing purposes
        if(outcome == false){
            System.out.println("\t*Your password needs to contain a digit*");
            containDigit = false;
        }//end if statement
    }//end method checkPasswordForDigit
    
    //method that checks password for lowercase letter
    public static void checkPasswordForLowercase(String pwd){
        String regexLowercase = ".*[a-z].*";
        Pattern lowercasePattern = Pattern.compile(regexLowercase);
        Matcher lowercaseMatcher = lowercasePattern.matcher(pwd);
        boolean outcome = lowercaseMatcher.matches();
        //System.out.println(outcome); //print outcome for testing purposes
        if(outcome == false){
            System.out.println("\t*Your password needs to contain a lowercase letter*");
            containLowercase = false;
        }//end if statement
    }//end method for checkPasswordForLowercase
    
    //method that checks password for upper
    public static void checkPasswordForUppercase(String pwd){
        String regexUppercase = ".*[A-Z].*";
        Pattern uppercasePattern = Pattern.compile(regexUppercase);
        Matcher uppercaseMatcher = uppercasePattern.matcher(pwd);
        boolean outcome = uppercaseMatcher.matches();
        //System.out.println(outcome); //print outcome for testing purposes
        if(outcome == false){
            System.out.println("\t*Your password needs to contain an uppercase letter*");
            containUppercase = false;
        }//end if statement
    }//end method for checkPasswordForUppercase

    //method that checks password for a special character
    public static void checkPasswordForSpecial(String pwd){
        String regexSpecial = ".*[!@#$%^&*+=].*";
        Pattern specialPattern = Pattern.compile(regexSpecial);
        Matcher specialMatcher = specialPattern.matcher(pwd);
        boolean outcome = specialMatcher.matches();
        //System.out.println(outcome); //print outcome for testing purposes
        if(outcome == false){
            System.out.println("\t*Your password needs to contain a special character*");
            containSpecial = false;
        }//end if statement
    }//end method for checkPasswordForUppercase
    
    //method that checks that pass is between 8 and 20 characters long
    public static void checkPasswordLength(String pwd){
        if (pwd.length() >= 8 && pwd.length() <= 20){
            //do nothing
        }else{
            System.out.println("\t*Your password needs to be between 8 and 20 characters long*");
            correctLength = false;
        }//end if else
    }//end password length method
    
    //method to check if all requirements were met & tell user their pass was accepted or not
    public static void passOrFail(){
        if (containDigit == true && containLowercase == true && containUppercase == true
                && containSpecial == true && correctLength == true){
            System.out.println("Your password has been accepted, you have met all requirements!");
        }else{
            System.out.println("Your password has NOT been accepted for the reasons listed "
                    + "above. \nPlease make changes and try again");
        }//close if-else
    }//close passOrFail method
    
    
    
    
    //OLD SAMPLE CODE
    /**
     * checks a candidate for the presence of a given character
     * @param candidatePswd
     * @param reqChar
     * @return true for does contain required char, false for does not
     */
    
    //public boolean checkForCandidateCharacter(String candidatePswd, char[] requiredChar){
       //start assuming that pass does not contain requiredChar
        //boolean containsCharacter = false;
        
        //convert requiredChar to String
        //String required = new String(requiredChar);
        //flip containsChar to true if we find requiredChar in password
        //int index = candidatePswd.indexOf(required);
        
        //if(index != -1){ //we found the required string
           // containsCharacter = true;
        //}
       
        
        //return containsCharacter;
    //}//close method
    
}//close class
