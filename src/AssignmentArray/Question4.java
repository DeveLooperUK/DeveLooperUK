package AssignmentArray;

public class Question4 {
    public static void main(String[] args) {
        short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
        int halfCent=0, cent=0, doubleCent=0;
        for (Short element : scores) {
            if (50 <= element && element < 100) {
                halfCent++;
            }
            else if (100 <= element && element < 200) {
                cent++;
            }
            else if (element >= 200) {
                doubleCent++;
            }
        }
        System.out.println("Half centuries: " + halfCent + "\nCenturies: " + cent + "\nDouble centuries: " + doubleCent);
    }
}
