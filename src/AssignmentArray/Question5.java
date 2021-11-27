package AssignmentArray;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] fibonacciArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == 1) {
                fibonacciArray[i] = i;
            }
            else{fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];}
        }
//         for (Integer fibs : fibonacciArray) {
//             System.out.print(fibs + " ");
//         }
        for (int i = 0; i < size; i++) {
            System.out.print(fibonacciArray[i]);
            if(i != size-1){
            System.out.print(", ");
            }
        }
    }
}
