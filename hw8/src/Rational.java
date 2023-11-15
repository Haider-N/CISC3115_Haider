public class Rational extends Number implements Comparable<Rational> {

    private long numerator;
    private long denominator;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long newNumerator = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
        long newDenominator = denominator * secondRational.getDenominator();
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational secondRational) {
        long newNumerator = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
        long newDenominator = denominator * secondRational.getDenominator();
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational secondRational) {
        long newNumerator = numerator * secondRational.getNumerator();
        long newDenominator = denominator * secondRational.getDenominator();
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational secondRational) {
        long newNumerator = numerator * secondRational.getDenominator();
        long newDenominator = denominator * secondRational.getNumerator();
        return new Rational(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    private static long gcd(long n, long d) {
        long absoluteNumerator = Math.abs(n);
        long absoluteDenominator = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= absoluteNumerator && k <= absoluteDenominator; k++) {
            if (absoluteNumerator % k == 0 && absoluteDenominator % k == 0)
                gcd = k;
        }

        return gcd;
    }

    @Override
    public int compareTo(Rational o) {
        long thisNumerator = this.numerator * o.getDenominator();
        long otherNumerator = o.getNumerator() * this.denominator;
        return Long.compare(thisNumerator, otherNumerator);
    }

    // Implement abstract methods from Number class
    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }
}
