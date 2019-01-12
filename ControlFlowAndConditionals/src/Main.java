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

        double balance = 0;
        balance = balance + 20;
        balance = balance - 25;
        balance = balance + 30;
        balance = balance - 25;
        if (balance < 0) {
            System.out.println("We’re in the red!");
        } else if (balance > 0) {
            System.out.println("We made a profit!");
        } else {
            System.out.println("We broke even.");
        }

        int dogs = 1;
        int cats = 2;
        if (dogs > 0 && cats == 0) {
            if (dogs > 1) {
                System.out.println("Dog lover");
            } else {
                System.out.println("Dog person");
            }
        } else if (cats > 0 && dogs == 0) {
            if (cats > 1) {
                System.out.println("Cat lover");
            } else {
                System.out.println("Cat person");
            }
            System.out.println("Meow!");
        } else if (cats > 0 && dogs > 0) {
            if (dogs > cats) {
                System.out.println("I guess you like dogs more");
            } else if (dogs == cats) {
                System.out.println("I guess you like both equally");
            } else {
                System.out.println("I guess you like cats more");
            }
        } else {
            System.out.println("What, don’t you like pets?");
        }

        boolean canSeePlayer = true;
        boolean playerPoweredUp = true;
        if (canSeePlayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }

        boolean isSnowing = false;
        boolean isRainingNow = true;
        double temperature = 60.0;
        if(isSnowing || isRainingNow || temperature < 50.0) {
            System.out.println("Let's stay home.");
        }
        else {
            System.out.println("Let's go out!");
        }

        int time = 18;
        String timeOfDay;
        if (time >= 5 && time < 12) {
            timeOfDay = "morning";
        }
        else if (time >= 12 && time < 20){
            timeOfDay = "daytime";
        }
        else {
            timeOfDay = "nighttime";
        }
        System.out.println(timeOfDay);

        int weekDay = 5;
        boolean holiday = false;
        if (weekDay >= 1 && weekDay <= 5 && !holiday) {
            System.out.println("Wake up at 7:00");
        } else {
            System.out.println("Sleep in!");
        }

        double playbackPosition = 120;
        boolean rewinding = true;
        if (rewinding) {
            double rewindAmount = 0.1;
            playbackPosition = playbackPosition - rewindAmount;
            System.out.println(playbackPosition);
        }

        int dayOfWeek = 1;
        String schedule;
        switch (dayOfWeek) {
            case 1: schedule = "Gym in the morning.";
            break;
            case 2: schedule = "Class after work.";
            break;
            case 3: schedule = "Meetings all day.";
            break;
            case 4: schedule = "Working from home.";
            break;
            case 5: schedule = "Game night after work.";
            break;
            case 6: case 7: default: schedule = "Free";
            break;
        }
        System.out.println(schedule);

    }

}