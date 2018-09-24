package Part_3;

import java.util.Scanner;

public class TestDate {
    public static void main(String[] args) {
        Date dateOfBirth = new Date(22, 07, 1999);
        System.out.println(dateOfBirth.getDate() + "/" +
                dateOfBirth.getDay() + "/" +
                dateOfBirth.getMonth());
        System.out.println(dateOfBirth.getDate());
        dateOfBirth.setDay(11);
        dateOfBirth.setMonth(2);
        dateOfBirth.setYear(2009);
        dateOfBirth.setDate(11, 2, 2018);
        Scanner scanner = new Scanner(System.in);
        int day;
        int tempDay;
        do {
            System.out.print("Enter your day:");
            while (!scanner.hasNextInt()) {
                System.out.println("Not a valid number");
            }
            tempDay = scanner.nextInt();
        } while (tempDay>31||tempDay<1);
        day = tempDay;
        int month;
        int tempMonth;
        do {
            System.out.print("Enter your Month:");
            while (!scanner.hasNextInt()) {
                System.out.println("Not a valid number");
            }
            tempMonth = scanner.nextInt();
        } while (tempMonth>12||tempMonth<1);
        month = tempMonth;
        int year;
        int tempYear;
        do {
            System.out.print("Enter your Year:");
            while (!scanner.hasNextInt()) {
                System.out.println("Not a valid number");
            }
            tempYear = scanner.nextInt();
        } while (tempYear>2100||tempYear<1940);
        year = tempYear;
        Date newDate = new Date(day,month,year);
        System.out.println(newDate.toString());



    }
}
