package sanjay;

public class OneTimePassword {
	 public static void main(String[] args) {
	        int otpLength = 6; // Length of the OTP
	        String otp = generateOTP(otpLength);
	        System.out.println("Generated OTP: " + otp);
	    }

	    public static String generateOTP(int length) {
	        // Characters allowed in the OTP (digits 0-9 in this example)
	        char[] digits = "0123456789".toCharArray();

	        // Seed for manual randomness (current time in milliseconds)
	        long seed = System.currentTimeMillis();
	        char[] otp = new char[length];

	        for (int i = 0; i < length; i++) {
	            // Update the seed using a linear congruential generator formula
	            seed = (seed * 37 + 11) % 100000; // Keep seed values within a manageable range
	            
	            // Use the seed to determine the index of the character
	            int index = (int) (Math.abs(seed) % digits.length);
	            otp[i] = digits[index];
	        }

	        return new String(otp);
	    }

}
