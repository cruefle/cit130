/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;
import java.util.Scanner;

/**
 * client class for our password strength checking machine
 * @author cruef
 */
public class PasswordClient {
    public static void main(String[] args) {
        
        
        //prompt user for password
        System.out.println("Please enter a password that meets all of the following requirements: ");
        System.out.println("\tContains at least 1 lowercase letter"
                + "\n\tContains at least 1 uppercase letter"
                + "\n\tContains at least 1 special character"
                + "\n\tIs between 8-20 characters in length");
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        String userPassword = scan.nextLine();
        
        //create an instance of our password checking machine
        StrengthChecker checker = new StrengthChecker();
        checker.checkPasswordForDigit(userPassword);
        checker.checkPasswordForLowercase(userPassword);
        checker.checkPasswordForUppercase(userPassword);
        checker.checkPasswordForSpecial(userPassword);
        checker.checkPasswordLength(userPassword);
        checker.passOrFail();
        
        //OLD SAMPLE CODE
        //StrengthChecker checker = new StrengthChecker();
        //char[] arr = {'@','j'};
        //System.out.println("Candidate passed? " + checker.checkForCandidateCharacter("r@Jbo", arr));
    }//close main
    
}//close class
