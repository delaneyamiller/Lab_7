import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws InvalidAgeException {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = keyboard.nextInt();
        
        if ( age < 5 || age > 110) {
            throw new InvalidAgeException("Invalid age entered");
        }
        
        double lifeInsuranceCost = calculateLifeInsurance(age);
      
        
        System.out.println("Your estimate is " + lifeInsuranceCost);
    }
    
    public static double calculateLifeInsurance(int age) {
        double insuranceCost = (5 * age) + 300;
        return insuranceCost;
    }

    static void InvalidAgeException() {
        throw new UnsupportedOperationException("Invalid age entered"); 
        
    }
}


