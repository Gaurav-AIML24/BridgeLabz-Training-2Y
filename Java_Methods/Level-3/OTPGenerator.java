import java.util.Arrays;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() generates a value between 0 and 1
        // Multiply by 900000 and add 100000 to ensure it stays 6 digits
        return (int)(100000 + Math.random() * 900000);
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs: " + Arrays.toString(otpArray));

        // Validate uniqueness
        if (areOTPsUnique(otpArray)) {
            System.out.println("✅ All OTPs are unique.");
        } else {
            System.out.println("❌ Duplicate OTPs found.");
        }
    }
}