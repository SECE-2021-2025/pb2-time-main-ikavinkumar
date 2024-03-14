import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Time time1 = Time.createTimeFromInput(scanner);
        System.out.println("Time : " + time1);

        System.out.println("\nNext Second:");
        time1.nextSecond();
        System.out.println("Time  after nextSecond: " + time1);

        System.out.println("\nPrevious Second:");
        time1.previousSecond();
        System.out.println("Time  before previousSecond: " + time1);

        
        scanner.close();
    }
}
