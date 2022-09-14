class Main {
    public static void main(String[] args) {

        boolean studentAPassed = false;
        boolean studentBPassed = true;

        // AND
        boolean allStudentsPassed = studentAPassed && studentBPassed;

        boolean notAllStudentsPassed = !allStudentsPassed;// !studentAPassed || !studentBPassed // !(studentAPassed &&
                                                          // studentBPassed)
        // OR
        boolean notAllStudentsFailed = studentAPassed || studentBPassed;

        boolean allStudentsFailed = !notAllStudentsFailed; // !studentAPassed && !studentBPassed // !(studentAPassed ||
                                                           // studentBPassed)

        System.out.printf("allStudentsPassed: %b%n", allStudentsPassed);
        System.out.printf("notAllStudentsPassed: %b%n", notAllStudentsPassed);
        System.out.printf("notAllStudentsFailed: %b%n", notAllStudentsFailed);
        System.out.printf("allStudentsFailed: %b%n", allStudentsFailed);
    }
}