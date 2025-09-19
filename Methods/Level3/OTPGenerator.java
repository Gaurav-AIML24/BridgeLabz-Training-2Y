public class OTPGenerator {

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; 
    }

    public static int[] generateMultipleOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final int OTP_COUNT = 10;
        int[] otpArray = generateMultipleOTPs(OTP_COUNT);

        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        boolean unique = areOTPsUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + (unique ? "Yes ✅" : "No ❌"));
    }
}
