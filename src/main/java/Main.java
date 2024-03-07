/*
Prompt: https://www.practicepython.org/exercise/2014/05/28/16-password-generator.html

Breakdown
1.) Begin program
    a.) Ask user for strength of password
    b.) Generate length of password depending on strength level
2.) Generate a password
    a.) Generate a random amount of lowercase letters
    b.) Generate a random amount of uppercase letters
    c.) Generate a random amount of numbers
    d.) Generate a random amount of spacial characters
    e.) Repeat steps a-d until password length is reached
3.) Display password
4.) Ask user if they want to save the password
    - if yes, save to a file
    - if no, continue
5.) Repeat steps 1-4 until user enters "exit"
*/
import java.util.Scanner;
import java.util.Random;


public class Main {
  public static String lowerLetters() {
    String[] lower = {"a" , "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    Random random = new Random();
    int i = random.nextInt(lower.length);
    return lower[i];
  }

  public static String upperLetters() {
    String[] upper = {"A" , "B", "C", "D", "E", "F", "G", "H", "H", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    Random random = new Random();
    int i = random.nextInt(upper.length);
    return upper[i];
  }

  public static String numbers() {
    String[] number = {"0" , "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    Random random = new Random();
    int i = random.nextInt(number.length);
    return number[i];
  }

  public static String specialCharacter() {
    String[] special = {"?" , "!", "@", "#", "$", "%", "&", ".", ",", "?", "!", ":", ";"};

    Random random = new Random();
    int i = random.nextInt(special.length);
    return special[i];
  }

  public static String newPassword() {
    String password = lowerLetters() + upperLetters() + numbers() + specialCharacter();

    return password;
  }
  
  public static void main(String[] args) {
    
    // Step 1a: Ask user for strength of password
    System.out.println("1: Very strong");
    System.out.println("2: Somewhat strong");
    System.out.println("3: Moderately strong");
    System.out.println("4: Somewhat weak");
    System.out.println("5: Very weak");
    System.out.print("Select a strength level for this password: ");
    Scanner userInput = new Scanner(System.in);
    int passwordStrength = userInput.nextInt();
    userInput.close();

    Random random = new Random();
    int passwordLength;
    // Step 1b: Generate length of password depending on strength level
    
    if (passwordStrength == 1) {
      passwordLength = random.nextInt(15,30);
      // veryStrong(passwordLength);
    }
    else if (passwordStrength == 2) {
      passwordLength = 15;
      // somewhatStrong(passwordLength);
    }
    else if (passwordStrength == 3) {
      passwordLength = 10;
      // moderatelyStrong(passwordLength);
    }
    else if (passwordStrength == 4 || passwordStrength == 5) {
      passwordLength = 5;
      // weak(passwordLength);
    }
    else {
      passwordLength = random.nextInt(15,30);
      // veryStrong(passwordLength);
    }

    String password = newPassword();
    System.out.println("Your new password is: " + password);
  }
}