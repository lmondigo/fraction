public class Fraction {

    private int wholeNumber;
    private int numerator;
    private int denominator;
    private String type;

    // Default Constructor
    public Fraction() {
    }

    // Fraction without whole number
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.type = Util.generateType(numerator, denominator);
    }

    /// Fraction with whole number
    public Fraction(int wholeNumber, int numerator, int denominator) {
        this.wholeNumber = wholeNumber;
        this.numerator = numerator;
        this.denominator = denominator;
        this.type = Type.MIXED;
    }

    public int getWholeNumber() {
        return wholeNumber;
    }

    public void setWholeNumber(int wholeNumber) {
        this.wholeNumber = wholeNumber;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}
