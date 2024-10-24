
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

  public class main {
    
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible: Age must be 18 or older.");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        try {
            validate(18); 
            validate(10); 
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}
