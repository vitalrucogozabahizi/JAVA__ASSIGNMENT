public class doWhilwLoopExample1 {
    public static void main(String[] args) {

        int count = 1;
        int number = 1;

        // Use a do-while loop to display the first 10 odd numbers
        System.out.println("First 10 odd numbers:");

        do {
            System.out.println(number);

            count++;
            number = 2 * count - 1;

        } while (count <= 10);
    }
}
