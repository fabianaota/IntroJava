public class Main {

    public static void main(String[] args) {

        System.out.println("Java Rocks!");

        int passengers;
        passengers = 0;
        passengers = passengers + 5;
        passengers = passengers - 3;
        passengers = passengers -1 + 5;

        System.out.println(passengers);

        int stops;
        int fare;
        stops = 0;
        fare = 0;
        stops = stops + 1;
        fare = fare + 5;
        stops = stops +1;
        fare = fare +3;
        stops = stops + 1;
        fare = fare + 7;
        System.out.println(stops);
        System.out.println(fare);

        String driver;
        driver = "Hamish";
        driver = driver.toUpperCase();
        int letters = driver.length();
        System.out.println(letters);
        System.out.println(driver);

        String driverFirstName;
        driverFirstName = "Hamish";
        String driverLastName;
        driverLastName = "Blake";
        String driverFullName = driverFirstName + " " + driverLastName;
        System.out.println(driverFullName);

        System.out.println("The bus made $" + fare + " after " + stops + " stops.");

        String language = "java";
        String feeling = "Love";
        feeling = feeling.toLowerCase();
        language = language.toUpperCase();
        System.out.println("I " + feeling + " " + language);

        double div = 5/2;
        double accurate = 5/2.0;
        System.out.println(div);
        System.out.println(accurate);

        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        int approx = (int) future;
        System.out.println(future);
        System.out.println(approx);

        double math = 97.5;
        double english = 98;
        double science = 83.5;
        double drama = 75;
        double music = 96;
        double sum = math + english + science + drama + music;
        double average = sum / 5;
        System.out.println(average);

        int x = 0;
        int y = 4;
        double z = 3;
        x = x + 2;
        z = x + y - 7;
        y = x * 3;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        double register = 10.0;
        register = register + 5;
        register = register - 2.5;
        register = register + 10;
        register = register - 3;
        System.out.println(register);

        int bankBalance = 500;
        bankBalance = bankBalance + 250;
        bankBalance = bankBalance - 100;
        System.out.println(bankBalance);

        System.out.println(2.0 * (5 / 2));

        int day = 30;
        String month = "August";

        String firstName = "Fabiana";
        String lastName = "Ota";
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName + ".");
        int lettersFullName = firstName.length() + lastName.length();
        System.out.println("There are " + lettersFullName + " letters in my name.");

        double fahrenheit = 75;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);

    }

}