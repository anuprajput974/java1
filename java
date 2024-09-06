public class LoopExamples {

    public static void main(String[] args) {
        
        // 1. For loop example
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count is: " + i);
        }

        // 2. While loop example
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Count is: " + j);
            j++;
        }

        // 3. Do-while loop example
        System.out.println("\nDo-While loop:");
        int k = 1;
        do {
            System.out.println("Count is: " + k);
            k++;
        } while (k <= 5);
    }
}
