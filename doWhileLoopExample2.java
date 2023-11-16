public class DoWhileOddNumbersExample {
    public static void main(String[] args) {
        private int count = 0;
        private int number = 1;

        // Use a do-while loop to display the first 10 odd numbers
        System.out.println("First 10 odd numbers:");

        do {
            System.out.println(number);

            this.count++;
            this.number += 2;

        } while (count < 10);
    }
}
