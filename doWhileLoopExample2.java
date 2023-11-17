public class doWhileLoopExample2 {
    public static void main(String[] args) {
    int count = 0;
     int number = 1;

        // Use a do-while loop to display the first 10 odd numbers
        System.out.println("First 10 odd numbers:");

        do {
            System.out.println(number);

            count++;
            number += 2;

        } while (count < 10);
    }
}
