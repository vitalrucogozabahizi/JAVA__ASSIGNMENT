
public class SwitchCaseExample {
    public static void main(String[] args) {

        private int dayNumber = 5;

        String day;
        switch (this.dayNumber) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }

        System.out.println("The day is: " + day);
        scanner.close();
    }
}
