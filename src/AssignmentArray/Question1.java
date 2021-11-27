package AssignmentArray;

public class Question1 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = i+1;
        }
        for (int i = 0; i < 1000; i++) {
            if (i != 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.print(numbers[i] + "  ");
        }
    }
}
