package conditions_and_loops.Switch_Cases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit =in.next();
//
////        switch (fruit) {
////            case "Mango" -> System.out.println("King of fruits");
////            case "Apple" -> System.out.println("A sweet red fruit");
////            case "Orange" -> System.out.println("Round fruit");
////            case "Grape" -> System.out.println("Small Fruit");
////            default -> System.out.println("Please enter a valid fruit");
////        }
//
//        int day= in.nextInt();
//
////        switch (day) {
////            case 1 -> System.out.println("Monday");
////            case 2 -> System.out.println("Tuesday");
////            case 3 -> System.out.println("Wednesday");
////            case 4 -> System.out.println("Thursday");
////            case 5 -> System.out.println("Friday");
////            case 6 -> System.out.println("Saturday");
////            case 7 -> System.out.println("Sunday");
////        }
//
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("Weekends");
//        }
        int empID= in.nextInt();
        String department=in.next();

        switch (empID) {
            case 1 -> System.out.println("Sagnik Hore");
            case 2 -> System.out.println("Kingas Eroh");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("It department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter Correct EmpID");
        }

    }
}
