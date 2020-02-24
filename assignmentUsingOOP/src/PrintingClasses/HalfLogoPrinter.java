package PrintingClasses;

abstract public class HalfLogoPrinter implements Interfaces.HalfLogoPrinter {
    protected String filler;
    protected String empty;
    protected Integer fontSize;

    protected HalfLogoPrinter(Integer fontSize) {
        this.filler = "*";
        this.empty = "-";
        this.fontSize = fontSize;
    }

    protected void printHalf(Integer numberOfRows){
        System.out.println();
    }
}
