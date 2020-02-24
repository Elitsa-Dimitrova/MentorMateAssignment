package PrintingClasses;

public class LowerHalfPrinter extends HalfLogoPrinter implements Interfaces.LowerHalfPrinter {

    protected LowerHalfPrinter(Integer fontSize) {
        super(fontSize);
    }


    @Override
     public void printHalf(Integer numberOfRows) {
        String output;
        StringBuilder builder = new StringBuilder();

        int middleFiller = fontSize;
        int middleDashes = fontSize;

        for (int i=fontSize, sideDashes =0; i>=numberOfRows; i--,sideDashes++, middleFiller+=2, middleDashes-=2){
            output = empty.repeat(sideDashes) + filler.repeat(fontSize) + empty.repeat(middleDashes) +
                    filler.repeat(middleFiller)+ empty.repeat(middleDashes) + filler.repeat(fontSize) + empty.repeat(sideDashes) ;
            output = output.repeat(2);
            builder.append(output);
            builder.append(System.getProperty("line.separator"));
        }

        System.out.println(builder.reverse());
    }
}
