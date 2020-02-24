package PrintingClasses;

public class LogoPrinter  implements Interfaces.LogoPrinter {
    private Integer fontSize;

    public LogoPrinter(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public void printLogo() {
        int totalNumberOfRows = fontSize+1;
        int numberOfRowsForEachHalf = totalNumberOfRows/2;

        UpperHalfPrinter u = new UpperHalfPrinter(fontSize);
        u.printHalf(numberOfRowsForEachHalf);

        LowerHalfPrinter l = new LowerHalfPrinter(fontSize);
        l.printHalf(numberOfRowsForEachHalf);

    }
}
