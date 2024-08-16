import java.util.Scanner;

public class LectureRoomControls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lectureRoom room = new lectureRoom();
        char choice;

        do {
            System.out.println("Main Menu:");
            System.out.println("W: Add Students");
            System.out.println("X: Remove Students");
            System.out.println("Y: Turn On Light");
            System.out.println("Z: Turn Off Light");
            System.out.println("Q: Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);


            choice = Character.toUpperCase(choice);

            switch (choice) {
                case 'W':
                    System.out.print("Enter the number of students to add: ");
                    int addStudents = scanner.nextInt();
                    room.addStudents(addStudents);
                    System.out.println(addStudents + " students have been added.");
                    break;
                case 'X':
                    System.out.print("Enter the number of students to remove: ");
                    int removeStudents = scanner.nextInt();
                    room.removeStudents(removeStudents);
                    System.out.println(removeStudents + " students have been removed.");
                    break;
                case 'Y':
                    System.out.print("Enter the light number to turn on (1-3): ");
                    int lightOn = scanner.nextInt();
                    room.turnOnLight(lightOn);
                    System.out.println("Light " + lightOn + " has been turned on.");
                    break;
                case 'Z':
                    System.out.print("Enter the light number to turn off (1-3): ");
                    int lightOff = scanner.nextInt();
                    room.turnOffLight(lightOff);
                    System.out.println("Light " + lightOff + " has been turned off.");
                    break;
                case 'Q':
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            room.displayStatus();  // Display the status of the room

            System.out.println();

        } while (choice != 'Q');

        scanner.close();
    }
}