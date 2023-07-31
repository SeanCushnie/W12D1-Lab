public class Printer {
    private int pagesLeft;
    private int tonerVolume;

    public Printer(int pagesLeft, int tonerVolume) {
        this.pagesLeft = pagesLeft;
        this.tonerVolume = tonerVolume;
    }

    public int print(int pages,int copies) {
        int totalRequired = pages * copies;
        int tonerRequired = this.tonerVolume - totalRequired;

        if (this.pagesLeft >= totalRequired) (this.tonerVolume >= tonerRequired) {
            this.pagesLeft -= totalRequired;
            this.tonerVolume -= tonerRequired;
        }
    }

}
