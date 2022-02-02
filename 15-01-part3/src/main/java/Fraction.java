import lombok.Data;

@Data
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 0;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
