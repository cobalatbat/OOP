import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter age: ");
/*

        switch (age) {
            case 10:
                System.out.println("Age is equal to 10");
                break;
            case 20:
                System.out.println("Age is equal to 20");
                break;
            case 30:
                System.out.println("Age is equal to 30");
                break;
            default:
                System.out.println("Age is not equal to any given number");
                break;
        }
        if (firstname.length() > 5) {
            result = "Cannot allow firstname characters greater than 5";
        } else {
            result = "Allowable";
        } */

        for (int age = myObj.nextInt(); age < 20; age++) {
            if (age == 15) {
                age = 1;
                continue;
            }
            System.out.println(age);
        }

    }
}