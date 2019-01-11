public class Main {

    public static void main(String[] args) {

        boolean isCold = true;
        if (isCold) {
            System.out.println("It´s cold, wear a coat!");
        }

        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Windshield wipers on.");
        }

        boolean isLightGreen = false;
        boolean isLightYellow = true;
        if (isLightGreen) {
            System.out.println("Drive!");
        } else if (isLightYellow) {
            System.out.println("Slow down!");
        } else {
            System.out.println("Stop!");
        }

        boolean passport = false;
        boolean birthCertificate = true;
        boolean driversLicense = true;
        if (passport) {
            System.out.println("A passport is a valid ID.");
        } else if (birthCertificate) {
            System.out.println("A birth certificate is a valid ID.");
        } else if (driversLicense) {
            System.out.println("A driver´s license is a valid ID.");
        } else {
            System.out.println("Invalid ID. Your application is denied.");
        }

        int ticketPrice = 10;
        int age = 55;
        boolean isStudent = true;
        if (age <= 15 || age > 60 || isStudent) {
            ticketPrice = 5;
            System.out.println(ticketPrice);
        }

        boolean action = true;
        boolean romance = true;
        boolean horror = false;
        boolean comedy = true;
        if (action && romance) {
            System.out.println("This movie includes action and romance.");
            if (comedy || horror) {
                System.out.println("This also includes comedy or horror.");
            }
        }

        int rating = 4;
        if (rating >= 0 && rating <= 5) {
            if (rating <= 2) {
                System.out.println("What's the reason for your low rating?");
            }
            System.out.println("Thank you for your feedback!");
        }

        int passcode = 629;
        String coffeeType;
        switch (passcode) {
            case 555:
                coffeeType = "Espresso";
                break;
            case 312:
                coffeeType = "Vanilla Latte";
                break;
            case 629:
                coffeeType = "Drip Coffee";
                break;
            default:
                coffeeType = "Unknown";
                break;
        }
        System.out.println(coffeeType);

        int month = 8;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        System.out.println(monthString );

    }

}
