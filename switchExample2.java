import java.util.Scanner;

public class ShapeTypeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a geometric shape:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();

        String shapeType;
        switch (choice) {
            case 1:
                shapeType = "Circle";
                break;
            case 2:
                shapeType = "Square";
                break;
            case 3:
                shapeType = "Triangle";
                break;
            default:
                shapeType = "Invalid choice";
                break;
        }

        System.out.println("You chose: " + shapeType);

    }
}
