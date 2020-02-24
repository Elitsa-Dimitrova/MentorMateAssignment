import java.util.Scanner;

public class Main {
    private static String filler = "*";
    private static String empty = "-";
    private static Integer FONT_SIZE;

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        FONT_SIZE = getInput(scanner);

        while (!isInputCorrect(FONT_SIZE)){
            System.out.println("Sorry, your input is incorrect! Try with an odd number between 2 an 10000!");
            FONT_SIZE = getInput(scanner);
        }

        printLogo(FONT_SIZE);

    }

    private static void printLogo(Integer n) {
        int totalNumberOfRows = n+1;
        Integer numberOfRowsForEachHalf = totalNumberOfRows/2;
        printUpperHalf(numberOfRowsForEachHalf);
        printLowerPart(numberOfRowsForEachHalf);
    }

    private static void printLowerPart(Integer n) {
        String output;
        StringBuilder builder = new StringBuilder();

        int middleFiller = FONT_SIZE;
        int middleDashes = FONT_SIZE;

        for (int i=n*2-1, sideDashes =0; i>=n; i--,sideDashes++, middleFiller+=2, middleDashes-=2){
            output = empty.repeat(sideDashes) + filler.repeat(FONT_SIZE) + empty.repeat(middleDashes) +
                    filler.repeat(middleFiller)+ empty.repeat(middleDashes) + filler.repeat(FONT_SIZE) + empty.repeat(sideDashes) ;
            output = output.repeat(2);
            builder.append(output);
            builder.append(System.getProperty("line.separator"));


        }

        System.out.println(builder.reverse());
    }

    private static void printUpperHalf(Integer n) {

        for (int i = 0, numberOfDashes = FONT_SIZE, numberOfStars = FONT_SIZE;
             i < n && numberOfDashes >= 0;
             i++, numberOfDashes--, numberOfStars+=2) {
            printRowNumber(i, numberOfDashes, numberOfStars);
        }
    }

    private static void printRowNumber(int numberOfRow, int numberOfDashes, int numberOfStars) {
        int numberOfMiddleDashes;
        StringBuilder builder = new StringBuilder();

        numberOfMiddleDashes = numberOfDashes-numberOfRow;

        String halfOutput =
                empty.repeat(numberOfDashes) + filler.repeat(numberOfStars) + empty.repeat(numberOfMiddleDashes) +
                        filler.repeat(numberOfStars) + empty.repeat(numberOfDashes);
        String output = halfOutput.repeat(2);
        builder.append(output);

        if(numberOfMiddleDashes!=1)
        System.out.println(builder);
        else System.out.print(builder);
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
