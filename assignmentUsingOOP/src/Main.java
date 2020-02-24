import PrintingClasses.LogoPrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = getInput(scanner);

        while (!isInputCorrect(input)){
            System.out.println("Sorry, your input is incorrect! Try with an odd number between 2 an 10000!");
            input = getInput(scanner);
        }

        LogoPrinter printer = new LogoPrinter(input);
        printer.printLogo();

    }

    private static boolean isInputCorrect(Integer n) {
        if(n>2 && n<10000 && n%2==1)
            return true;

        return false;
    }

    private static Integer getInput(Scanner scanner) {
        System.out.println("Input parameter n: ");

        return Integer.parseInt(scanner.nextLine());
    }
}
