public class Main {

    public static void main(String[] args) {

        chorus();
        playMusic();
        greeting("New York");
        weatherInterpreter(4);
        int degreesC = 15;
        weatherInterpreter(degreesC);
        admission(130.5);
        printPhoto(30, 40, true);
        likePhoto(2, "Nice pic!", true);
        int returnedLikes = likePhoto(0, "Nice color!", false);
        int totalLikes = likePhoto(returnedLikes, "I like this.", true);
        makeChange(100.5, 110.0);
        int roll1 = rollDice(5);
        int roll2 = rollDice(10);
        System.out.println("Roll 1: " + roll1);
        System.out.println("Roll 2: " + roll2);
        absoluteValue(-123.456);
        calculateTip(45.50);
        nametagText("Suzanne");
        printTemperature(75.9);
        monopolyRoll();

    }

    private static void chorus() {
        System.out.println("Once I had a love and it was a gas");
        System.out.println("Soon turned out had a heart of glass");
        System.out.println("Seemed like the real thing, only to find");
        System.out.println("Mucho mistrust, love's gone behind");
    }

    static boolean playButton = false;
    private static void playMusic() {
        if (playButton) {
            System.out.println("Music is playing");
        }
        else {
            System.out.println("Music is paused");
        }
    }

    private static void greeting(String location) {
        System.out.println("Hello, " + location);
    }

    private static void weatherInterpreter(int temperature) {
        if (temperature > 30) {
            System.out.println("It's hot outside!");
        }
        else if (temperature < 5) {
            System.out.println("Brr, consider wearing a  jacket.");
        }
        else {
            System.out.println("Not too hot, not too cold.");
        }
    }

    private static String admission(double height) {
        String passText;
        if (height > 120) {
            passText = "You pass the height requirements.";
        }
        else {
            passText = "Sorry, you do not pass.";
        }
        System.out.println(passText);
        return passText;
    }

    private static void printPhoto(int width, int height, boolean inColor) {
        System.out.println("Width = " + width + " cm");
        System.out.println("Height = " + height + " cm");
        if (inColor) {
            System.out.println("Print is full color.");
        }
        else {
            System.out.println("Print is black and white.");
        }
    }

    private static int likePhoto(int currentLikes, String comment, boolean like) {
        System.out.println("Feedback: " + comment);
        if (like) {
            currentLikes = currentLikes + 1;
        }
        System.out.println("Numbers of likes: " + currentLikes);
        return currentLikes;
    }

    private static double makeChange(double itemCost, double dollarsProvided) {
        double change = dollarsProvided - itemCost;
        System.out.println(change);
        return change;
    }

    private static int rollDice(int sides) {
        double randomNumber = Math.random();
        randomNumber = randomNumber * sides;
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }

    private static double absoluteValue(double number) {
        if (number < 0) {
            System.out.println(-number);
            return -number;
        }
        else {
            System.out.println(number);
            return number;
        }
    }

    private static double calculateTip(double cost) {
        double tip = cost * 0.15;
        System.out.println(tip);
        return tip;
    }

    private static String nametagText(String name) {
        String printName = "Hello, my name is " + name;
        System.out.println(printName);
        return printName;
    }

    /**
     * Converts from Fahrenheit to Celsius degrees.
     * @param fahrenheit Temperature in degrees Fahrenheit.
     * @return Equivalent temperature in degrees Celsius.
     */
    private static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    /**
     * Prints a temperature in both Fahrenheit and Celsius degrees.
     * @param fahrenheit Temperature in degrees Fahrenheit.
     */
    private static void printTemperature(double fahrenheit) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit));
    }

    private static int diceRoll(int sides) {
        double randomNumber = Math.random();
        randomNumber = randomNumber * sides;
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }

    private static int monopolyRoll() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        int total = roll1 + roll2;
        if (roll1 == roll2) {
            int roll3 = diceRoll(6);
            int roll4 = diceRoll(6);
            total = total + roll3 + roll4;
            System.out.println(total);
            return total;
        }
        else {
            System.out.println(total);
            return total;
        }
    }

}