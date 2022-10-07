import java.util.Arrays;

public class Main {

    static String getRandomString(String[] array) {
        int randInt = (int) (Math.random() * array.length);
        return array[randInt];
    }

    public static void main(String[] args) {
        String[] coinFaces = { "HEAD", "TAIL" };
        int headCount = 0;
        int tailCount = 0;
        for (int i = 0; i < 10000; i++) {
            String randomCoinFace = getRandomString(coinFaces);
            // System.out.println("random coin face: " + randomCoinFace);
            if (randomCoinFace == coinFaces[0]) {
                headCount++;
            } else if (randomCoinFace == coinFaces[1]) {
                tailCount++;
            }
        }
        System.out.println("headCount: " + headCount);
        System.out.println("tailCount: " + tailCount);
        // String[] diceFaces = { "1", "2", "3", "4", "5", "6" };
        // String randomDiceFace = getRandomString(diceFaces);
        // System.out.println("random dice face: " + randomDiceFace);

        // int randInt = (int) (Math.random() * coinFaces.length);
        // System.out.println("randInt: " + randInt);

        // System.out.println("Arrays.toString(coinFaces): " +
        // Arrays.toString(coinFaces));
        // 0 -> "HEAD", 1 -> "TAIL", 2 -> "BODY"
        // System.out.println("coinFaces[0]: " + coinFaces[0]);
        // System.out.println("coinFaces[1]: " + coinFaces[1]);
        // System.out.println("coinFaces[2]: " + coinFaces[2]);

        // if (randInt == 0) {
        // System.out.println("random Face: " + "HEAD");
        // } else if (randInt == 1) {
        // System.out.println("random Face: " + "TAIL");
        // } else if (randInt == 2) {
        // System.out.println("random Face: " + "BODY");
        // }

        // switch (randInt) {
        // case 0:
        // System.out.println("random Face: " + "HEAD");
        // break;
        // case 1:
        // System.out.println("random Face: " + "TAIL");
        // break;
        // case 2:
        // System.out.println("random Face: " + "BODY");
        // break;
        // }
    }
}