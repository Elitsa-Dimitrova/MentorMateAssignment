package PrintingClasses;

public class UpperHalfPrinter extends HalfLogoPrinter {

    protected UpperHalfPrinter(int fontSize) {
        super(fontSize);
    }

    @Override
    public void printHalf(Integer numberOfRows) {

        for (int i = 0, numberOfDashes = fontSize, numberOfStars = fontSize;
             i < numberOfRows && numberOfDashes >= 0;
             i++, numberOfDashes--, numberOfStars+=2) {
            printRowNumber(i, numberOfDashes, numberOfStars);
        }
    }

    private void printRowNumber(int numberOfRow, int numberOfDashes, int numberOfStars) {
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

    public void hey (){
        System.out.println("hey");
    }
}
