import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name, address, phone, age, school, department, level;

        System.out.println("Provide the information below!\n");

        System.out.println("What's your name?");
        name = scanner.nextLine();

        System.out.println("Where do you live?");
        address = scanner.nextLine();

        System.out.println("Your phone number");
        phone = scanner.nextLine();

        System.out.println("How old are you?");
        age = scanner.nextLine();

        System.out.println("What's is your school's name?");
        school = scanner.nextLine();

        System.out.println("What level are you in ?");
        level = scanner.nextLine();

        System.out.println("What department");
        department = scanner.nextLine();

        String result = '\n' +
                        name + "," + " you're " + age + " years old " +
                        "living at " + address +
                        "" + "and \nyou're currently schooling at " + school +
                        " in the " +
                        "department of " + department + ",\n" + level + " " +
                        "level.\n " + "Your" + " phone number is " + phone;


        System.out.println(result);
    }
}
