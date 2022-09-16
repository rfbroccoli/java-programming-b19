public class Main {
    public static void main(String[] args) {
        
        // in kg
        float mass = 100f; 
        
        // in m
        float height = 1.7f; 
        
        float bmi = mass / (height * height);
        
        // Underweight (Severe thinness) < 16.0 < 0.64
        // Underweight (Moderate thinness) 16.0 – 16.9 0.64 – 0.67
        // Underweight (Mild thinness) 17.0 – 18.4 0.68 – 0.73
        // Normal range 18.5 – 24.9 0.74 – 0.99
        // Overweight (Pre-obese) 25.0 – 29.9 1.00 – 1.19
        // Obese (Class I) 30.0 – 34.9 1.20 – 1.39
        // Obese (Class II) 35.0 – 39.9 1.40 – 1.59
        // Obese (Class III) ≥ 40.0 ≥ 1.60
        System.out.println("Your bmi is " + bmi);
        if (bmi < 16.0f) {
            System.out.println("You're severely underweight.");
        } else if (bmi < 17f) {
            System.out.println("You're moderately underweight.");
        } else if (bmi < 18.5f) {
            System.out.println("You're mildly underweight.");
        } else if (bmi < 25f) {
            System.out.println("Your weight is normal.");
        } else if (bmi < 30f) {
            System.out.println("You're overweight.");
        } else if (bmi < 35f) {
            System.out.println("You're Class I obese.");
        } else if (bmi < 40f) {
            System.out.println("You're Class II obese.");
        } else {
            System.out.println("You're Class III obese.");
        }
    }
}