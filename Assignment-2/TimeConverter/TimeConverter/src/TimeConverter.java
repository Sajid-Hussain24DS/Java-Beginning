import java.util.Scanner;

public class TimeConverter{
    int hours;
    int minutes;
    int seconds;

        TimeConverter(int totalSeconds) {
        hours = totalSeconds / 3600;
        totalSeconds = totalSeconds - (hours * 3600);
        minutes = totalSeconds / 60;
        seconds = totalSeconds - (minutes * 60);
    }

    void displayTime() {
        System.out.println("The time is = " + hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int totalSeconds = scanner.nextInt();

        TimeConverter time = new TimeConverter(totalSeconds);
        time.displayTime();
    }
}