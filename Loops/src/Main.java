
public class Main {

    public static void main(String[] args) {

        printGoogol();
        keepRolling();
        raiseAlarm1(5);
        raiseAlarm2(5);
        raiseAlarm3(5);
        raiseAlarm4(5);
        countBlocks(3);
        addNumber();
        subtractNumber();
        evenNumbers();
        searchWifi();
        rollASix();
        martingale();
        pressConference();
        calculateAverage();
        search();
        findLongestName();
        int [][] grades = {
                {87, 93, 99, 75, 60},
                {93, 70, 98, 90, 75},
                {82, 75, 95, 80, 66},
                {90, 75, 99, 85, 70}
        };
        subjectAverage(grades, 2);
        studentAverage(grades, 4);
        printHi();
        sum(grades);
        exercise1();
        exercise2(3);
        exercise3("Java");
        exercise4(500000);
        exercise5();
        exercise6();
        exercise7();
        monopolyRoll1();
        monopolyRoll2();

    }

    private static void printGoogol() {
    String googol = "1";
    int len = googol.length();
    while (len < 101) {
        googol = googol + "0";
        len = googol.length();
    }
    System.out.println(googol);
    }

    private static int rollDice() {
        double randomNumber = Math.random();
        randomNumber = randomNumber * 6;
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;
        return randomInt;
    }

    private static int keepRolling() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int dice4 = rollDice();
        int dice5 = rollDice();
        int count = 1;
        while (! (dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            count = count + 1;
        }
        System.out.println(count);
        return count;
    }

    private static void raiseAlarm1(int numOfWarnings) {
        int i = 1;
        while (i <= numOfWarnings) {
            System.out.println("Warning!");
            i++;
        }
    }

    private static void raiseAlarm2(int numOfWarnings) {
        for (int i = 1; i <= numOfWarnings; i++) {
            System.out.println("Warning #" + i);
        }
    }

    private static void raiseAlarm3(int numOfWarnings) {
        for (int i = 1; i <= numOfWarnings; i++) {
            int x = i - 1;
            System.out.println(x);
        }
    }

    private static void raiseAlarm4(int numOfWarnings) {
        for (int i = 1; i <= numOfWarnings; i++) {
            System.out.println(i * 2);
        }
    }

    private static int countBlocks(int levels){
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            total = total + i * i;
        }
        System.out.println(total);
        return total;
    }

    private static int addNumber() {
        int sum = 0;
        for (int i = 15; i <= 20; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }

    private static int subtractNumber() {
        int subtraction = 3;
        for (int i = 3; i >= 1; i--) {
            subtraction = subtraction -1;
        }
        System.out.println(subtraction);
        return subtraction;
    }

    private static void evenNumbers() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    private static boolean checkWifi() {
        boolean wifi = true;
        if (wifi) {
            System.out.println("Wi-Fi avaiable!");
        }
        return wifi;
    }

    private static void searchWifi() {
        for (int i = 1; i <= 10; i++) {
            boolean wifiAvaiable = checkWifi();
            if (wifiAvaiable) {
                System.out.println("Wi-Fi found!");
                break;
            }
        }
    }

    private static boolean rollASix() {
        int dice = rollDice();
        while (dice != 6) {
            dice = rollDice();
            if (dice == 3) {
                break;
            }
        }
        if (dice == 6) {
            System.out.println("You won!");
            return true;
        }
        else {
            System.out.println("You lose...");
            return false;
        }
    }

    private static boolean play() {
        boolean game = true;
        if (game) {
            System.out.println("Play!");
        }
        return game;
    }

    private static int martingale() {
        int money = 1000;
        int target = 1200;
        int bet = 10;
        while (money > bet) {
            boolean win = play();
            if (win) {
                money += bet;
                bet = 10;
            } else {
                money -= bet;
                bet *= 2;
            }
            if (money >= target) {
                break;
            }
        }
        System.out.println(money);
        return money;
    }

    private static void pressConference() {
        String [] newsOutlet = {"abc", "bbc", "CNN", "CBS", "AP", "NBC", "FOX", "npr", "sky", "Aljazeera"};
        double lucky = Math.random();
        lucky *= 10;
        int luckyIndex = (int) lucky;
        System.out.println(newsOutlet[luckyIndex]);
    }

    private static double calculateAverage() {
        double [] temperatures = {75, 73, 72, 80};
        int size = temperatures.length;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += temperatures[i];
        }
        double average = total / size;
        System.out.println(average);
        return average;
    }

    private static double search() {
        double [] speed = {7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19};
        int size = speed.length;
        double min = speed[0];
        for (int i = 1; i < size; i++) {
            if (speed[i] < min) {
                min = speed[i];
            }
        }
        System.out.println(min);
        return min;
    }

    private static String findLongestName() {
        String [] names = {"Nakita", "Elina", "Sheree", "Guy", "Calandra", "Perry", "Heike", "Harris", "Lynsey", "Isaac"};
        int size = names.length;
        String longestName = names[0];
        for (int i = 1; i < size; i++) {
            if (names[i].length() > longestName.length()) {
                longestName = names[i];
            }
        }
        System.out.println(longestName);
        return longestName;
    }

    private static double subjectAverage(int [][] grades, int subject) {
        int students = grades.length;
        int total = 0;
        for (int i = 0; i < students; i++) {
            total += grades [subject][i];
        }
        double average = total / (double) students;
        System.out.println(average);
        return average;
    }

    private static double studentAverage(int [][] grades, int student) {
        int subjects = grades.length;
        int total = 0;
        for (int i = 0; i < subjects; i++) {
            total += grades [i][student];
        }
        double average = total / (double) subjects;
        System.out.println(average);
        return average;
    }

    private static void printHi() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.println("Hi!");
            }
        }
    }

    private static int sum(int [][] grades) {
        int total = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++){
                total += grades [i][j];
            }
        }
        System.out.println(total);
        return total;
    }

    private static void exercise1() {
        int n = 10;
        while (n < 50) {
            n = n * 2;
        }
        System.out.println(n);
    }

    private static int exercise2(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return factorial;
    }

    private static int exercise3(String target) {
        String [] sentence = {"Learning", "Java", "is", "fun."};
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].equals(target)) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println("-1");
        return -1;
    }

    private static int exercise4(double initialBalance) {
        int years = 0;
        double balance = initialBalance;
        while (balance < 1000000) {
        years++;
        balance = balance * 1.05;
        }
        System.out.println(years);
        return years;
    }

    private static void exercise5() {
        String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        for (int i = weekdays.length - 1; i >= 0; i--) {
            System.out.println(weekdays[i]);
        }
    }

    private static int exercise6() {
        int [] intArray = {1, 0, 2, 3, -1, 2};
        if (intArray.length == 0) {
            return -1;
        }
        int smallest = intArray[0];
        int largest = intArray[0];
        for (int i = 1; i < intArray.length; i ++) {
            if (intArray[i] < smallest) {
                smallest = intArray[i];
            }
            if (intArray[i] > largest) {
                largest = intArray[i];
            }
        }
        System.out.println(largest - smallest);
        return largest - smallest;
    }

    private static void exercise7() {
        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            String thisRow = "";
            for (int j = 0; j < i; j++) {
                thisRow = thisRow + "#";
            }
            System.out.println(thisRow);
        }
    }

    private static int diceRoll(int sides) {
        double randomNumber = Math.random() * sides;
        randomNumber = randomNumber + 1;
        return (int) randomNumber;
    }

    private static int monopolyRoll1() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        int total = roll1 + roll2;
        int rolls = 1;
        while (roll1 == roll2) {
            if (rolls >= 3) {
                roll1 = diceRoll(6);
                roll2 = diceRoll(6);
                total = total + roll1 + roll2;
                rolls = rolls + 1;
            }
            System.out.println(total);
            System.out.println(rolls);
            return -1;
        }
        System.out.println(total);
        return total;
    }

    private static int monopolyRoll2() {
        int roll1 = diceRoll(6);
        int roll2 = diceRoll(6);
        int total = roll1 + roll2;
        if (roll1 != roll2) {
            System.out.println(total);
            return total;
        }
        else {
            System.out.println(total + monopolyRoll2());
            return total + monopolyRoll2();
        }
    }

}