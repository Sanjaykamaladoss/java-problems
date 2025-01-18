package sanjay;

public class password {

	public static void main(String[] args) {
		
		        int passwordLength = 10; // the password length
		        String password = generatePassword(passwordLength);
		        System.out.println("Generated Password: " + password);
		    }

		    public static String generatePassword(int length) {
		        // characters set for the password
		        char[] characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*".toCharArray();

		        // Seed for manual randomness (using current time in milliseconds)
		        long seed = System.currentTimeMillis();
		        char[] password = new char[length];

		        for (int i = 0; i < length; i++) {
		            seed = (seed * 37 + 11) % characters.length; // Simple random-like formula
		            password[i] = characters[(int) seed];
		        }

		        return new String(password);

	}

}
