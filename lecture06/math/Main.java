class Main {
    public static void main(String[] args) {
        int myNum = 32 - 532;
        int abs = Math.abs(myNum);

        System.out.println("myNum: " + myNum);

        System.out.println("abs: " + abs);

        int ageOfSister = 32;
        int ageOfBrother = 38;

        int ageDifference = Math.abs(ageOfSister - ageOfBrother);
        System.out.println("ageDifference: " + ageDifference);

        int min = Math.min(ageOfBrother, ageOfSister);
        System.out.println("min: " + min);

        int max = Math.max(ageOfBrother, ageOfSister);
        System.out.println("max: " + max);

        double sqrt = Math.sqrt(ageOfBrother);
        System.out.println("sqrt: " + sqrt);

        double randomNum = Math.random();
        int randomNumberBetween0And100 = (int) (randomNum * 100);
        System.out.println("randomNumberBetween0And100: " + randomNumberBetween0And100);

        int randomNumberBetween5And8 = (int) (randomNum * 3) + 5;
        System.out.println("randomNumberBetween5And8: " + randomNumberBetween5And8);
    }
}